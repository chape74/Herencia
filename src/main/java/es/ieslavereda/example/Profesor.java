package es.ieslavereda.example;

import java.util.Arrays;

public class Profesor extends Persona {

    private String cargo;

    Grado[] grados;

    public Profesor(String DNI, String nombre, String apellido, int edad, String cargo, Grado[] grados) {
        super(DNI, nombre, apellido, edad);
        this.cargo = cargo;
        this.grados = grados;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cargo=" + cargo +
                ", grados=" + Arrays.toString(grados);
    }
}
