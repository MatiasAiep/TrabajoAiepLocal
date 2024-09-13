package com.robot.proyecto;

public abstract class Partes_MM {

	String material;
	String color;
	
	public Partes_MM(String material , String color) {
		this.material = material;
		this.color = color;
	}
	
	public String getMaterial_mm() {
		return material;
	}
	public void setMaterial_mm(String material) {
		this.material = material;
	}
	public String getColor_mm() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
		
	public void operar_mm() {
		
		
	}
}
