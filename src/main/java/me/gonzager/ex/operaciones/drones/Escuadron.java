package me.gonzager.ex.operaciones.drones;

import java.util.HashSet;
import java.util.Set;

public class Escuadron {
    private Set<Dron> drones = new HashSet<>();

    public void agregarDron(Dron dron) throws IllegalStateException {
        if (drones.size() >= Ciudad.getInstance().getLimiteDronesPorEscuadron()) {
            throw new IllegalStateException("Límite de drones por escuadrón alcanzado");
        }
        drones.add(dron);
    }

    private Boolean alMenosUnDronAvanzado() {
        return drones.stream().anyMatch(Dron::esAvanzado);
    }

    public Boolean puedeOperarEn(Zona zona) {
        return this.alMenosUnDronAvanzado() && this.eficienciaOperativa() > zona.getTamaño() * 2;
    }

    private int eficienciaOperativa() {
        return drones.stream().mapToInt(Dron::eficienciaOperativa).sum();
    }

    public void operar(Zona unZona) {
        if (this.puedeOperarEn(unZona)) {
            unZona.recibirOperacion();
            drones.stream().forEach(Dron::disminuirAutonomia());
        }
    }
}
