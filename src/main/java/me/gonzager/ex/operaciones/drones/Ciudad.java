package me.gonzager.ex.operaciones.drones;

public class Ciudad {
    private static Ciudad instance = new Ciudad();

    private Ciudad() {
        // Constructor privado para evitar instanciación externa
    }

    public static Ciudad getInstance() {
        return instance;
    }

    private int limiteDronesPorEscuadron = 10;

    public int getLimiteDronesPorEscuadron() {
        return limiteDronesPorEscuadron;
    }

    public void setLimiteDronesPorEscuadron(int limiteDronesPorEscuadron) {
        this.limiteDronesPorEscuadron = limiteDronesPorEscuadron;
    }
}
