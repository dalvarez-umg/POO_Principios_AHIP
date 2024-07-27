import Interfaces.*;
import herencia.Perro;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan", 25);
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());

        p.setNombre("Carlos");
        p.setEdad(30);
        System.out.println("Nuevo Nombre: " + p.getNombre());
        System.out.println("Nueva Edad: " + p.getEdad());

        testHerencia();
    }

    public static void testHerencia() {
        Perro perro = new Perro();
        perro.hacerSonido();
    }

    public static void testInterfaces() {
        Aparato miLampara = new Lampara();
        Aparato miTelevisor = new Televisor();
    }
}