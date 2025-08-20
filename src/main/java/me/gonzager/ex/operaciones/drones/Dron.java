package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public abstract class Dron {
    private int autonomia;
    protected final int procesamiento;
    private Mision mision;

    public Dron(int autonomia, int procesamiento, Mision mision) {
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
        this.mision = mision;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int eficienciaOperativa() {
        return autonomia * 10 + mision.extraEficienciaOperativa();
    }

    public int getProcesamiento() {
        return procesamiento;
    }

    public Mision getMision() {
        return mision;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    public boolean esAvanzado() {
        return this.esAvanzadoSegunTipo() || mision.esAvanzadoSegunTipo(null);
    }

    public void disminuirAutonomia() {
        this.autonomia -= 2;
    }

    protected abstract boolean esAvanzadoSegunTipo();

}