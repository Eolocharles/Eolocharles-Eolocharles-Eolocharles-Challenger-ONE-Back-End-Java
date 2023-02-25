package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;

public class Converter {

    String responseBody = new ExchangeRatesApi().getExchangeRate();
    ObjectMapper objectMapper = new ObjectMapper();
    JsonNode jsonNode = objectMapper.readTree(responseBody);

    JsonNode rates = jsonNode.get("rates");

    public Converter() throws IOException, InterruptedException {
    }

    public double currencyConverter(String from, String to, double value) {
        Map<String, String> currencyMap = Map.of(
                "Reais", "BRL",
                "Dólares", "USD",
                "Euros", "EUR",
                "Libras", "GBP",
                "Pesos Argentinos", "ARS",
                "Pesos Chilenos", "CLP"
        );

        from = currencyMap.get(from);
        to = currencyMap.get(to);

        if (Objects.equals(from, to)) {
            return value;
        }
        if (Objects.equals(from, "USD")) {
            return value * rates.get(to).asDouble();
        }
        if (Objects.equals(to, "USD")) {
            return value / rates.get(from).asDouble();
        }else {
            return value * rates.get(to).asDouble() / rates.get(from).asDouble();
        }
    }

    public double unitConverter(String from, String to, double value) {

        if (Objects.equals(from, to)) {
            return value;
        }
        if (Objects.equals(from, "kilometros") && Objects.equals(to, "metros")) {
            return value * 1000;
        }
        if (Objects.equals(from, "kilometros") && Objects.equals(to, "milímetros")) {
            return value * 1000000;
        }
        if (Objects.equals(from, "kilometros") && Objects.equals(to, "milhas")) {
            return value * 0.621371;
        }
        if (Objects.equals(from, "kilometros") && Objects.equals(to, "jardas")) {
            return value * 1093.61;
        }
        if (Objects.equals(from, "kilometros") && Objects.equals(to, "pés")) {
            return value * 3280.84;
        }
        if (Objects.equals(from, "kilometros") && Objects.equals(to, "polegadas")) {
            return value * 39370.1;
        }
        if (Objects.equals(from, "metros") && Objects.equals(to, "kilometros")) {
            return value * 0.001;
        }
        if (Objects.equals(from, "metros") && Objects.equals(to, "milímetros")) {
            return value * 1000;
        }
        if (Objects.equals(from, "metros") && Objects.equals(to, "milhas")) {
            return value * 0.000621371;
        }
        if (Objects.equals(from, "metros") && Objects.equals(to, "jardas")) {
            return value * 1.09361;
        }
        if (Objects.equals(from, "metros") && Objects.equals(to, "pés")) {
            return value * 3.28084;
        }
        if (Objects.equals(from, "metros") && Objects.equals(to, "polegadas")) {
            return value * 39.3701;
        }
        if (Objects.equals(from, "milímetros") && Objects.equals(to, "kilometros")) {
            return value * 0.000001;
        }
        if (Objects.equals(from, "milímetros") && Objects.equals(to, "metros")) {
            return value * 0.001;
        }
        if (Objects.equals(from, "milímetros") && Objects.equals(to, "milhas")) {
            return value * 0.000000621371;
        }
        if (Objects.equals(from, "milímetros") && Objects.equals(to, "jardas")) {
            return value * 0.00109361;
        }
        if (Objects.equals(from, "milímetros") && Objects.equals(to, "pés")) {
            return value * 0.00328084;
        }
        if (Objects.equals(from, "milímetros") && Objects.equals(to, "polegadas")) {
            return value * 0.0393701;
        }
        if (Objects.equals(from, "milhas") && Objects.equals(to, "kilometros")) {
            return value * 1.60934;
        }
        if (Objects.equals(from, "milhas") && Objects.equals(to, "metros")) {
            return value * 1609.34;
        }
        if (Objects.equals(from, "milhas") && Objects.equals(to, "milímetros")) {
            return value * 1609340;
        }
        if (Objects.equals(from, "milhas") && Objects.equals(to, "jardas")) {
            return value * 1760;
        }
        if (Objects.equals(from, "milhas") && Objects.equals(to, "pés")) {
            return value * 5280;
        }
        if (Objects.equals(from, "milhas") && Objects.equals(to, "polegadas")) {
            return value * 63360;
        }
        if (Objects.equals(from, "jardas") && Objects.equals(to, "kilometros")) {
            return value * 0.0009144;
        }
        if (Objects.equals(from, "jardas") && Objects.equals(to, "metros")) {
            return value * 0.9144;
        }
        if (Objects.equals(from, "jardas") && Objects.equals(to, "milímetros")) {
            return value * 914.4;
        }
        if (Objects.equals(from, "jardas") && Objects.equals(to, "milhas")) {
            return value * 0.000568182;
        }
        if (Objects.equals(from, "jardas") && Objects.equals(to, "pés")) {
            return value * 3;
        }
        if (Objects.equals(from, "jardas") && Objects.equals(to, "polegadas")) {
            return value * 36;
        }
        if (Objects.equals(from, "pés") && Objects.equals(to, "kilometros")) {
            return value * 0.0003048;
        }
        if (Objects.equals(from, "pés") && Objects.equals(to, "metros")) {
            return value * 0.3048;
        }
        if (Objects.equals(from, "pés") && Objects.equals(to, "milímetros")) {
            return value * 304.8;
        }
        if (Objects.equals(from, "pés") && Objects.equals(to, "milhas")) {
            return value * 0.000189394;
        }
        if (Objects.equals(from, "pés") && Objects.equals(to, "jardas")) {
            return value * 0.333333;
        }
        if (Objects.equals(from, "pés") && Objects.equals(to, "polegadas")) {
            return value * 12;
        }
        if (Objects.equals(from, "polegadas") && Objects.equals(to, "kilometros")) {
            return value * 0.0000254;
        }
        if (Objects.equals(from, "polegadas") && Objects.equals(to, "metros")) {
            return value * 0.0254;
        }
        if (Objects.equals(from, "polegadas") && Objects.equals(to, "milímetros")) {
            return value * 25.4;
        }
        if (Objects.equals(from, "polegadas") && Objects.equals(to, "milhas")) {
            return value * 0.0000157828;
        }
        if (Objects.equals(from, "polegadas") && Objects.equals(to, "jardas")) {
            return value * 0.0277778;
        }
        if (Objects.equals(from, "polegadas") && Objects.equals(to, "pés")) {
            return value * 0.0833333;
        }
        return 0;
    }

    public double temperatureConverter(String from, String to, double value) {


        if (Objects.equals(from, "Celsius") && Objects.equals(to, "Fahrenheit")) {
            return value * 1.8 + 32;
        }
        if (Objects.equals(from, "Celsius") && Objects.equals(to, "Kelvin")) {
            return value + 273.15;
        }
        if (Objects.equals(from, "Fahrenheit") && Objects.equals(to, "Celsius")) {
            return (value - 32) / 1.8;
        }
        if (Objects.equals(from, "Fahrenheit") && Objects.equals(to, "Kelvin")) {
            return (value + 459.67) * 5 / 9;
        }
        if (Objects.equals(from, "Kelvin") && Objects.equals(to, "Celsius")) {
            return value - 273.15;
        }
        if (Objects.equals(from, "Kelvin") && Objects.equals(to, "Fahrenheit")) {
            return value * 9 / 5 - 459.67;
        }
        return 0;
    }
}







