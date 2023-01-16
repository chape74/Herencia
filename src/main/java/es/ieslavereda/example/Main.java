package es.ieslavereda.example;

public class Main {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];
        
        personas[0] = new Persona("1234X","salman","badwa",29);
        personas[1] = new Persona("2345X","ian","maio",18);
        personas[2] = new Persona("3Z","carlos","cremades",21);
        personas[3] = new Persona("4W","aitor","lopez",18);
        personas[4] = new Persona("1234X","ruben","flores",18);
        Alumno alumno = new Alumno("1234X","ruben","flores",18,Grado.DAM_PRIMERO);
        Grado[] grados = new Grado[2];
        grados[0] = Grado.DAM_SEGUNDO;
        grados[1] = Grado.ASIR_PRIMERO;
        Profesor profesor = new Profesor("1234X","ruben","flores",18,"profe",grados);
        
        
        
        System.out.println(personas[1]);
        for (Persona p : personas) {
            p.cumplirAnos();
            System.out.println(p);
        }
        System.out.println(alumno);
        alumno.printDNI();
        System.out.println(profesor);
    }
}