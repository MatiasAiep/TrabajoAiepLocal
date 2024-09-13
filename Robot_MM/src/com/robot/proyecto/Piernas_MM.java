package com.robot.proyecto;

public class Piernas_MM extends Partes_MM {

	private int largo;

	public Piernas_MM(String material, String color , int largo) {
		super(material, color);
		this.largo = largo;
	}

	@Override
	public void operar_mm() {
		System.out.println("El robot camina con piernas de" + largo + " cm.");	
	}
	
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
}
