package me.gonzager.ex.operaciones.drones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import me.gonzager.ex.operaciones.misiones.MisionExploracion;
import me.gonzager.ex.operaciones.misiones.MisionTransporte;
import me.gonzager.ex.operaciones.misiones.MisionVigilancia;

public class DronTest {

    private final Dron dronSeguridad = new DronSeguridad(3, 52);
    private final Dron dronComercial = new DronComercial(3, 10);
    private final Dron dronAvanzado = new DronSeguridad(1, 60);

    private final MisionVigilancia misionVigilancia = new MisionVigilancia();
    private final MisionTransporte misionTransporte = new MisionTransporte();
    private final MisionExploracion misionExporacion = new MisionExploracion();

    public DronTest() {
        // Agregamos sensores para que la eficiencia operativa sea la esperada en los tests
        // Sensor 1: capacidad 10, durabilidad 30, sin mejoras
        // Sensor 2: capacidad 9, durabilidad 40, con mejoras
        misionVigilancia.addSensor(new me.gonzager.ex.operaciones.accesorios.Sensor(10, 30, false)); // eficiencia: 10
        misionVigilancia.addSensor(new me.gonzager.ex.operaciones.accesorios.Sensor(9, 40, true)); // eficiencia: 18
    }

    @Test
    void testEsDronAvanzadoTrueYFalse() {
        dronAvanzado.esAvanzado();
        assertTrue(dronAvanzado.esAvanzado());
    }

    @Test
    void testEfecienciaOperativaDronSeguridadEnMisionVigilancia() {
    dronSeguridad.setMision(misionVigilancia);
    // 3*10 (autonomía) + 10 + 18 (sensores)
    assertEquals(3 * 10 + 10 + 18, dronSeguridad.eficienciaOperativa());
    }

    @Test
    void testEfecienciaOperativaDronSeguridadEnMisionTransporte() {
        dronSeguridad.setMision(misionTransporte);
        assertEquals(3 * 10 + 10, dronSeguridad.eficienciaOperativa());
    }

    @Test
    void testEfecienciaOperativaDronSeguridadEnMisionExploracion() {
        dronSeguridad.setMision(misionExporacion);
        assertEquals(3 * 10, dronSeguridad.eficienciaOperativa());
    }

    @Test
    void testEfecienciaOperativaDronComercialEnMisionVigilancia() {
        dronComercial.setMision(misionVigilancia);
        assertEquals(3 * 10 + 10 + 18 + 15, dronComercial.eficienciaOperativa());
    }

    @Test
    void testEfecienciaOperativaDronComercialEnMisionTransporte() {
        dronComercial.setMision(misionTransporte);
        assertEquals(3 * 10 + 10 + 15, dronComercial.eficienciaOperativa());
    }

    @Test
    void testEfecienciaOperativaDronComercialEnMisionExploracion() {
        dronComercial.setMision(misionExporacion);
        assertEquals(3 * 10 + 15, dronComercial.eficienciaOperativa());
    }

    @Test
    void testEsAvanzadoDronSeguridadEnMisionVigilancia() {
        dronSeguridad.setMision(misionVigilancia);
    }

    @Test
    void testEsAvanzadoDronSeguridadEnMisionTransporte() {
        dronSeguridad.setMision(misionTransporte);
        assertTrue(dronSeguridad.esAvanzado());
    }

    @Test
    void testEsAvanzadoDronSeguridadEnMisionExploracion() {
        dronSeguridad.setMision(misionExporacion);
        assertTrue(dronSeguridad.esAvanzado());
    }

    @Test
    void testEsAvanzadoDronComercialEnMisionVigilancia() {
        dronComercial.setMision(misionVigilancia);
        assertTrue(dronComercial.esAvanzado());
    }

    @Test
    void testNoEsAvanzadoDronComercialEnMisionTransporte() {
        dronComercial.setMision(misionTransporte);
        assertFalse(dronComercial.esAvanzado());
    }

    @Test
    void testEsAvanzadoDronComercialEnMisionExploracion() {
        dronComercial.setMision(misionExporacion);
        assertFalse(dronComercial.esAvanzado());
        assertEquals(3 * 10 + 15, dronComercial.eficienciaOperativa());
    }
}