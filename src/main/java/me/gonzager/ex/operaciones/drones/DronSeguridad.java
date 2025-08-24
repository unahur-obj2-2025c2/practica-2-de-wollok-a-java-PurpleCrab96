package me.gonzager.ex.operaciones.drones;

public class DronSeguridad extends Dron {

    public DronSeguridad(Integer autonomia, Integer procesamiento) {
        super(autonomia, procesamiento);
    }

    @Override
    public Boolean esDronAvanzado() {
        return this.getProcesamiento() > 50;
    }
}
