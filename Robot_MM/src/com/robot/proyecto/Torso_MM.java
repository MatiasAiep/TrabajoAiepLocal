package com.robot.proyecto;

public class Torso_MM extends Partes_MM {

	private String forma;

	public Torso_MM(String material, String color, String forma) {
		super(material, color);
		this.forma = forma;
	}

	@Override
	public void operar_mm() {
		System.out.println("El Torso del robot tiene forma " + forma + ".");
	}
	
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}

}
