package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public class Seguridad extends Dron {

    public Seguridad(int autonomia, int procesamiento, Mision mision) {
        super(autonomia, procesamiento, mision);
    }

    @Override
    protected boolean esAvanzadoSegunTipo() {
        return procesamiento > 50;
    }

    @Override
    public int eficienciaOperativa() {
        return super.eficienciaOperativa() + 20;
    }
}
