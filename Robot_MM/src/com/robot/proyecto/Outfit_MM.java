package com.robot.proyecto;

public abstract class Outfit_MM {
	protected String tipo;
    protected String color;

    public void Outfit(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    public abstract void Vestir_MM();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
