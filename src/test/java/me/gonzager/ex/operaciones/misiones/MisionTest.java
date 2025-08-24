package me.gonzager.ex.operaciones.misiones;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import me.gonzager.ex.operaciones.accesorios.Sensor;

public class MisionTest {

    private final MisionVigilancia misionVigilancia = new MisionVigilancia();
    private final MisionTransporte misionTransporte = new MisionTransporte();

    @Test
    void misionVigilaciaConMejorasTecnologicas() {
        misionVigilancia.addSensor(new Sensor(10, 10, Boolean.FALSE));
        misionVigilancia.addSensor(new Sensor(9, 4, Boolean.TRUE));
        assertTrue(misionVigilancia.tieneSensorConMejorasTecnologicas());

    }

    @Test
    void misionVigilaciaSinMejorasTecnologicas() {
        misionVigilancia.addSensor(new Sensor(10, 10, Boolean.FALSE));
        misionVigilancia.addSensor(new Sensor(9, 4, Boolean.FALSE));
        assertFalse(misionVigilancia.tieneSensorConMejorasTecnologicas());

    }

    @Test
    void misionTransporteSinMejorasTecnologicas() {
        misionTransporte.addSensor(new Sensor(10, 10, Boolean.FALSE));
        misionTransporte.addSensor(new Sensor(9, 4, Boolean.FALSE));
        assertFalse(misionTransporte.tieneSensorConMejorasTecnologicas());

    }

    @Test
    void misionTransporteConMejorasTecnologicas() {
        misionTransporte.addSensor(new Sensor(10, 10, Boolean.FALSE));
        misionTransporte.addSensor(new Sensor(9, 4, Boolean.TRUE));
        assertTrue(misionTransporte.tieneSensorConMejorasTecnologicas());

    }
}
