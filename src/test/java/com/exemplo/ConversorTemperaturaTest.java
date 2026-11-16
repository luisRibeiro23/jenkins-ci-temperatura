package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversorTemperaturaTest {

    private final ConversorTemperatura conversor = new ConversorTemperatura();

    @Test
    void deveConverterFahrenheitParaCelsius() {
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32.0), 0.01);
        assertEquals(100.0, conversor.fahrenheitParaCelsius(212.0), 0.01);
    }

    @Test
    void deveConverterCelsiusParaFahrenheit() {
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0.0), 0.01);
        assertEquals(212.0, conversor.celsiusParaFahrenheit(100.0), 0.01);
    }
}
