package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public interface Mision {
    int extraEficienciaOperativa();

    boolean esAvanzadoSegunTipo(Dron dron);

    boolean esAvanzadoSegunMision(Dron dron);
}
