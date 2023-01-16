package es.ieslavereda.example;

public class Persona {
    private String DNI;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String DNI, String nombre, String apellido, int edad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void cumplirAnos() {
        edad++;
    }

    @Override
    public String toString() {
        return "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad;
    }

    public void printDNI() {
        System.out.println("example.Persona - DNI: " + DNI);
    }
    
    
}
