package com.robot.proyecto;

public class Mano_MM extends Partes_MM {
	private int dedos;

    public Mano_MM(String material, String color, int dedos) {
        super(material, color);
        this.dedos = dedos;
    }

    public void operar_mm() {
        System.out.println("Moviendo los " + dedos + " dedos.");
    }

    // Getter y Setter
    public int getDedos() {
        return dedos;
    }

    public void setDedos(int dedos) {
        this.dedos = dedos;
    }
}