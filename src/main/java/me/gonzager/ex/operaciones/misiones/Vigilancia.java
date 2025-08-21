package me.gonzager.ex.operaciones.misiones;

import java.util.ArrayList;
import java.util.List;
import me.gonzager.ex.operaciones.drones.Dron;

public class Vigilancia implements Mision {
    private List<Sensor> sensores = new ArrayList<>();

    public Vigilancia(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    @Override
    public int extraEficienciaOperativa() {
        return sensores.stream().mapToInt(Sensor::eficienciaOperativa).sum();
    }

    @Override
    public boolean esAvanzadoSegunMision(Dron dron) {
        return sensores.stream().allMatch(sensor -> sensor.esDuradero());
    }

}