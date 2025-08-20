package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public class Transporte implements Mision {
    private static Transporte instance = new Transporte();

    private Transporte() {
        // Constructor privado para evitar instanciación externa
    }

    public static Transporte getInstance() {
        return instance;
    }

    @Override
    public int extraEficienciaOperativa() {
        return 30;
    }

    @Override
    public boolean esAvanzadoSegunMision(Dron dron) {
        return dron.getProcesamiento() > 60;
    }

    @Override
    public boolean esAvanzadoSegunTipo(Dron dron) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esAvanzadoSegunTipo'");
    }
}
