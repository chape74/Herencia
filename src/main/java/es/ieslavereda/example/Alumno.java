package es.ieslavereda.example;

import java.util.Random;
public class Alumno extends Persona {

    private int NIA;
    private Grado grado;
    public Alumno(String DNI, String nombre, String apellido, int edad) {
        super(DNI, nombre, apellido, edad);
    }

    public Alumno(String DNI, String nombre, String apellido, int edad, Grado grado) {
        super(DNI, nombre, apellido, edad);
        this.NIA = generateNIA();
        this.grado = grado;
    }
    private int generateNIA() {
        Random random = new Random();
        int nia = 0;
        for (int i = 0; i < 8; i++) {
            nia = nia * 10 + random.nextInt(10);
        }
        return nia;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", NIA=" + NIA +
                ", grado=" + grado;
    }

    @Override
    public void printDNI() {
        System.out.println("example.Alumno - DNI: " + this.getDNI());
    }
}
