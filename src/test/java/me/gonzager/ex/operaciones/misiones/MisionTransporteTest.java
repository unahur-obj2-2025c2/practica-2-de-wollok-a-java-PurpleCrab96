
package me.gonzager.ex.operaciones.misiones;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import me.gonzager.ex.operaciones.accesorios.Sensor;



class MisionTransporteTest {

    
    private final Sensor sensorConMejoras = new Sensor(10, 20, true);
    private final Sensor sensorSinMejoras = new Sensor(10, 20, false);


    @Test
    void eficienciaOperativaReturns10WhenNoSensores() {
        MisionTransporte mision = new MisionTransporte();
        assertEquals(10, mision.eficienciaOperativa());
    }


    @Test
    void eficienciaOperativaReturnsSumOfSensores() {
        MisionTransporte mision = new MisionTransporte(Arrays.asList(sensorConMejoras, sensorSinMejoras));
        // sensorConMejoras: 2*10=20, sensorSinMejoras: 10, total=30
        assertEquals(30, mision.eficienciaOperativa());
    }


    @Test
    void eficienciaOperativaWithOneSensor() {
        Sensor sensor = new Sensor(5, 10, false);
        MisionTransporte mision = new MisionTransporte();
        mision.addSensor(sensor);
        assertEquals(5, mision.eficienciaOperativa());
    }
}