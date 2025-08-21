package me.gonzager.ex.operaciones.drones;

public class Zona {
    private final int tamaño;
    private int operacionesRecibidas = 0;

    public Zona(int tamaño, int operacionesRecibidas) {
        this.tamaño = tamaño;
        this.operacionesRecibidas = operacionesRecibidas;
    }

    public int getTamaño() {
        return tamaño;
    }

    public int getOperacionesRecibidas() {
        return operacionesRecibidas;
    }

    public void recibirOperacion() {
        operacionesRecibidas++;
    }
}