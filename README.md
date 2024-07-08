# Conversor de Monedas

Este proyecto implementa un conversor de monedas en Java que utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tasas de cambio actualizadas en tiempo real. Permite a los usuarios convertir entre una variedad de monedas de forma rápida y sencilla.

## Funcionalidades

* **Convierte entre múltiples monedas:** El conversor soporta las siguientes monedas:
    * Dólar estadounidense (USD)
    * Peso argentino (ARS)
    * Real brasileño (BRL)
    * Peso chileno (CLP)
    * Peso colombiano (COP)
    * Boliviano boliviano (BOB)
* **Tasas de cambio actualizadas:** Obtiene las tasas de cambio más recientes directamente desde la API de ExchangeRate-API, asegurando conversiones precisas.
* **Manejo de errores robusto:** El sistema está diseñado para manejar errores como monedas no disponibles o problemas de conexión con la API, proporcionando mensajes informativos al usuario.

## Cómo compilar y ejecutar

1. **Clona el repositorio:**
bash git clone https://github.com/AlexLuciani23/ConversorMoneda.git
2. **Instala Maven:** Asegúrate de tener Maven instalado en tu sistema. Puedes descargarlo desde [https://maven.apache.org/](https://maven.apache.org/).
3. **Compila el proyecto:** Abre una terminal en la carpeta raíz del proyecto y ejecuta el comando:
bash mvn compile
4. **Ejecuta el proyecto:**
5. bash mvn exec:java -Dexec.mainClass="Principal"
## Dependencias

Este proyecto utiliza la librería Gson para parsear los datos JSON recibidos de la API. La dependencia está gestionada a través del archivo `pom.xml`.

## Ejemplos de uso
## Dependencias

Este proyecto utiliza la librería Gson para parsear los datos JSON recibidos de la API. La dependencia está gestionada a través del archivo `pom.xml`.

## Ejemplos de uso
![Descripción de la imagen](Conversor_moneda.jpg)


**Ejemplo 1: Convertir dólares a pesos argentinos**

1. Ejecuta el programa.
2. Selecciona la opción "1. Dólar a Peso Argentino".
3. Ingresa la cantidad de dólares que deseas convertir.
4. El programa mostrará el equivalente en pesos argentinos.
