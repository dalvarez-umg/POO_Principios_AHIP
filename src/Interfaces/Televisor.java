package Interfaces;

public class Televisor implements Aparato{
    @Override
    public void encender() {
        System.out.println("El televisor está encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El televisor está apagado");
    }
}
