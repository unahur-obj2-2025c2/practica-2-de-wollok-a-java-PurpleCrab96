package me.gonzager.ex.operaciones.drones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import me.gonzager.ex.operaciones.misiones.Transporte;

public class ComercialTest {

    Dron dronC1 = new Comercial(60, 100, Transporte.getInstance());

    @Test
    void testEficienciaOperativa() {
        assertEquals(60 * 10 + 15 + 100, dronC1.eficienciaOperativa());
    }

    @Test
    void testEsAvanzadoSegunTipo() {

    }
}
