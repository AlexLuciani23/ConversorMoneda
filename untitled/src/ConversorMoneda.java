import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorMoneda {

    private static final String API_KEY = "0435fe82be67352642394f15";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";
    private static final HttpClient CLIENT = HttpClient.newHttpClient();

    private JsonObject obtenerTasasDeCambio(String monedaOrigen) {
        try {
            String url = BASE_URL + monedaOrigen;
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
            return JsonParser.parseString(response.body()).getAsJsonObject();

        } catch (IOException | InterruptedException e) {
            System.err.println("Error al obtener tasas de cambio: " + e.getMessage());
            return null;
        }
    }

    private double convertir(String monedaOrigen, String monedaDestino, double cantidad) {
        JsonObject tasasDeCambio = obtenerTasasDeCambio(monedaOrigen);
        if (tasasDeCambio != null) {
            JsonObject conversionRates = tasasDeCambio.getAsJsonObject("conversion_rates");
            if (conversionRates.has(monedaDestino)) {
                return cantidad * conversionRates.getAsJsonPrimitive(monedaDestino).getAsDouble();
            } else {
                System.err.println("Error: La moneda de destino '" + monedaDestino + "' no está disponible desde '" + monedaOrigen + "'.");
            }
        }
        System.err.println("Error al obtener tasas de cambio.");
        return 0; // Valor por defecto en caso de error
    }

    // Métodos para cada conversión
    public double convertirDolarAPesoArgentino(double cantidad) {
        return convertir("USD", "ARS", cantidad);
    }

    public double convertirPesoArgentinoADolar(double cantidad) {
        return convertir("ARS", "USD", cantidad);
    }

    public double convertirDolarARealBrasileno(double cantidad) {
        return convertir("USD", "BRL", cantidad);
    }

    public double convertirRealBrasilenoADolar(double cantidad) {
        return convertir("BRL", "USD", cantidad);
    }

    public double convertirDolarAPesoColombiano(double cantidad) {
        return convertir("USD", "COP", cantidad);
    }

    public double convertirPesoColombianoADolar(double cantidad) {
        return convertir("COP", "USD", cantidad);
    }

    public double convertirDolarABoliviano(double cantidad) {
        return convertir("USD", "BOB", cantidad);
    }

    public double convertirBolivianoADolar(double cantidad) {
        return convertir("BOB", "USD", cantidad);
    }
}

// ... (
