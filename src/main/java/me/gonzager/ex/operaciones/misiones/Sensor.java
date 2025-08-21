package me.gonzager.ex.operaciones.misiones;

public class Sensor {
    private final int capacidad;
    private final int durabilidad;
    private final Boolean mejorasTecnologicas;

    public Sensor(int capacidad, int durabilidad, Boolean mejorasTecnologicas) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.mejorasTecnologicas = mejorasTecnologicas;
    }

    public int eficienciaOperativa() {
        return mejorasTecnologicas ? capacidad * 2 : capacidad;
    }

    public Boolean esDuradero() {
        return durabilidad > capacidad * 2;
    }
}
