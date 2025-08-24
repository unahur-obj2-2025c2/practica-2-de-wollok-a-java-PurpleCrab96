package me.gonzager.ex.operaciones.accesorios;

public class Sensor {
    private final Integer capacidad;
    private final Integer durabilidad;
    private final Boolean mejorasTecnologicas;

    public Sensor(Integer capacidad, Integer durabilidad, Boolean mejorasTecnologicas) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.mejorasTecnologicas = mejorasTecnologicas;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public Integer getDurabilidad() {
        return durabilidad;
    }

    public Boolean getMejorasTecnologicas() {
        return mejorasTecnologicas;
    }

    public Integer efecienciaOperativa() {
        return !mejorasTecnologicas ? (capacidad != null ? capacidad : 0) : 2 * (capacidad != null ? capacidad : 0);
    }

    public Boolean esDuradero() {
        return durabilidad > 2 * capacidad;
    }

}
