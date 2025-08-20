package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public class Comercial extends Dron {
    public Comercial(int autonomia, int procesamiento, Mision mision) {
        super(autonomia, procesamiento, mision);
    }

    @Override
    protected boolean esAvanzadoSegunTipo() {
        return false; // Los drones comerciales no son avanzados
    }

    @Override
    public int eficienciaOperativa() {
        return super.eficienciaOperativa() + 15;
    }

}