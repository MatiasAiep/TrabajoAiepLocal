package com.robot.proyecto;

public class Robot_MM {
    private Mano_MM mano;
    private Piernas_MM pierna;
    private Torso_MM torso;
    private Cabeza_MM cabeza;
    private Outfit_MM outfit;

    public Robot_MM(Mano_MM mano, Piernas_MM pierna, Torso_MM torso, Cabeza_MM cabeza) {
        this.mano = mano;
        this.pierna = pierna;
        this.torso = torso;
        this.cabeza = cabeza;
    }

    public void aplicarOutfit(Outfit_MM outfit) {
        this.outfit = outfit;
        outfit.Vestir_MM();
    }

    public void operar() {
        mano.operar_mm();
        pierna.operar_mm();
        torso.operar_mm();
        cabeza.operar_mm();
    }

    // Getters y Setters
    public Mano_MM getMano() {
        return mano;
    }

    public void setMano(Mano_MM mano) {
        this.mano = mano;
    }

    public Piernas_MM getPierna() {
        return pierna;
    }

    public void setPierna(Piernas_MM pierna) {
        this.pierna = pierna;
    }

    public Torso_MM getTorso() {
        return torso;
    }

    public void setTorso(Torso_MM torso) {
        this.torso = torso;
    }

    public Cabeza_MM getCabeza() {
        return cabeza;
    }

    public void setCabeza(Cabeza_MM cabeza) {
        this.cabeza = cabeza;
    }

    public Outfit_MM getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit_MM outfit) {
        this.outfit = outfit;
    }
}