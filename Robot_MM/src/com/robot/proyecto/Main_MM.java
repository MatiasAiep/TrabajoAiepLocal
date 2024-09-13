package com.robot.proyecto;

public class Main_MM {
    public static void main(String[] args) {
        Mano_MM mano = new Mano_MM("metal", "plateado", 5);
        Piernas_MM pierna = new Piernas_MM("aluminio", "gris", 90);
        Torso_MM torso = new Torso_MM("plástico", "azul", "rectangular");
        Cabeza_MM cabeza = new Cabeza_MM("silicona", "beige", 2);

        Robot_MM robot = new Robot_MM(mano, pierna, torso, cabeza);

        robot.operar();

        Outfit_MM casual = new Casual_MM("verde");
        robot.aplicarOutfit(casual);

        Outfit_MM formal = new Formal_MM("negro");
        robot.aplicarOutfit(formal);
    }
}