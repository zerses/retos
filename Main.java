package reto2Variante1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Reto 2 variante 1");


        Jugador j = new Jugador("Explorador", 'm', -1, -1, 130);
        Enemigo e = new Enemigo("bitter", 'f', 0, 0, 120);

        System.out.println("Acciones");

        j.golpear(e);
        j.golpear(e);
        j.usarBotiquin();
        j.recogerBotiquin();
        j.recogerBotiquin();
        j.usarBotiquin();
        j.moverArriba(2);
        e.golpear(j);

        System.out.println("datos del jugador");
        System.out.println(j.getNombre());
        System.out.println(j.getSexo());
        System.out.println(j.getPosicionX());
        System.out.println(j.getPosicionY());
        System.out.println("daño " + j.getDamage());
        System.out.println("vida jugador " +j.getVida());
        System.out.println(j.getNumeroBotiquines());

        System.out.println("datos del enemigo");
        System.out.println(e.getNombre());
        System.out.println(e.getSexo());
        System.out.println(e.getPosicionX());
        System.out.println(e.getPosicionY());
        System.out.println("daño " + e.getDamage());
        System.out.println(e.getVida());
        System.out.println(e.getEvolucionesAplicadas());
        System.out.println(e.getResistencia());
    }
}
