package me.gonzager.ex.operaciones.misiones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.accesorios.Sensor;
import me.gonzager.ex.operaciones.drones.Dron;

public class MisionTransporte extends Mision {
    private List<Sensor> sensores = new ArrayList<>();

    public MisionTransporte() {
    }

    public MisionTransporte(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    public void addSensor(Sensor unSensor) {
        sensores.add(unSensor);
    }

    public Boolean tieneSensorConMejorasTecnologicas() {
        return this.sensores.stream().anyMatch(sensor -> sensor.getMejorasTecnologicas());
    }

    @Override
    public Integer eficienciaOperativa() {
        // Si no hay sensores, retorna 10 como antes
        if (sensores.isEmpty()) {
            return 10;
        }
        return sensores.stream().map(s -> s.efecienciaOperativa()).reduce(0, Integer::sum);
    }

    @Override
    public Boolean estaEnMisionAvanzada(Dron dron) {
        return dron.getAutonomia() > 50;
    }
}
