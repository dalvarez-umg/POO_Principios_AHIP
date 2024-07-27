package Polimorfismo;

public class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El gato maúlla");
    }

    void hacerSonido(String nombre){
        System.out.println("El gato " +nombre + " hace sonido");
    }
}