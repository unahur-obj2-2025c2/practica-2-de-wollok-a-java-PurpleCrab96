package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public abstract class Mision {
    public abstract Integer eficienciaOperativa();

    public abstract Boolean estaEnMisionAvanzada(Dron dron);

}
