package com.robot.proyecto;

public class Cabeza_MM extends Partes_MM{

	private int ojos;

	public Cabeza_MM(String material, String color , int ojos) {
		super(material, color);
		this.ojos = ojos;
	}

	@Override
	public void operar_mm() {
		System.out.println("Cabeza con cantidad de" + ojos);
	}
	public int getOjos() {
		return ojos;
	}
	public void setOjos(int ojos) {
		this.ojos = ojos;
	}

}
