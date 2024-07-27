package Interfaces;

public class Lampara implements Aparato{
    @Override
    public void encender() {
        System.out.println("La lámpara está encendida");
    }

    @Override
    public void apagar() {
        System.out.println("La lámpara está apagada");
    }
}