import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        ConversorMoneda conversor = new ConversorMoneda();

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            double cantidad;
            double resultado;

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de dólares: ");
                    cantidad = scanner.nextDouble();
                    resultado = conversor.convertirDolarAPesoArgentino(cantidad);
                    mostrarResultado("pesos argentinos", resultado);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de pesos argentinos: ");
                    cantidad = scanner.nextDouble();
                    resultado = conversor.convertirPesoArgentinoADolar(cantidad);
                    mostrarResultado("dólares", resultado);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de dólares: ");
                    cantidad = scanner.nextDouble();
                    resultado = conversor.convertirDolarARealBrasileno(cantidad);
                    mostrarResultado("reales brasileños", resultado);
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad de reales brasileños: ");
                    cantidad = scanner.nextDouble();
                    resultado = conversor.convertirRealBrasilenoADolar(cantidad);
                    mostrarResultado("dólares", resultado);
                    break;
                case 5:
                    System.out.print("Ingrese la cantidad de dólares: ");
                    cantidad = scanner.nextDouble();
                    resultado = conversor.convertirDolarAPesoColombiano(cantidad);
                    mostrarResultado("pesos colombianos", resultado);
                    break;
                case 6:
                    System.out.print("Ingrese la cantidad de pesos colombianos: ");
                    cantidad = scanner.nextDouble();
                    resultado = conversor.convertirPesoColombianoADolar(cantidad);
                    mostrarResultado("dólares", resultado);
                    break;
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("*** Conversor de Monedas ***");
        System.out.println("1. Dólar a Peso Argentino");
        System.out.println("2. Peso Argentino a Dólar");
        System.out.println("3. Dólar a Real Brasileño");
        System.out.println("4. Real Brasileño a Dólar");
        System.out.println("5. Dólar a Peso Colombiano");
        System.out.println("6. Peso Colombiano a Dólar");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
    }

    public static void mostrarResultado(String monedaDestino, double resultado) {
        System.out.println("El resultado es: " + resultado + " " + monedaDestino);
    }
}

