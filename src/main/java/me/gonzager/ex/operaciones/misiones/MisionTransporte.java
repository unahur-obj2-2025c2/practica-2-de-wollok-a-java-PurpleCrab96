package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public class MisionTransporte extends Mision {

    @Override
    public Integer eficienciaOperativa() {
        return 10;
    }

    @Override
    public Boolean estaEnMisionAvanzada(Dron dron) {
        return dron.getAutonomia() > 50;
    }
}
