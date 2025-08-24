package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public class MisionExploracion extends Mision {

    @Override
    public Integer eficienciaOperativa() {
        return 0;
    }

    @Override
    public Boolean estaEnMisionAvanzada(Dron dron) {
        return dron.eficienciaOperativa() % 2 == 0;
    }
}