package reto2Variante1;

public class Jugador extends Personaje{
    // atributos
    private int numeroBotiquines = 0;


    // constructor

public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage){
    super(nombre, sexo, posicionX, posicionY, damage);

}
    // metodos

    public void usarBotiquin(){
        if (numeroBotiquines > 0){
            setVida(getVida() + 5);
            if (getVida() > 100){
                setVida(100);
            }
            numeroBotiquines --;
        }
    }

    public void recogerBotiquin(){
        this.numeroBotiquines ++;
    }

    public void moverDerecha(double d){
        setPosicionX(getPosicionX() + d);
    }

    public void moverIzquierda(double d){
        setPosicionX(getPosicionX() - d);
    }

    public void moverArriba(double d){
        setPosicionY(getPosicionY() + d);
    }

    public void moverAbajo(double d){
        setPosicionY(getPosicionY() - d);
    }

    public void golpear(Enemigo p){
        p.recibirImpacto(getDamage()/Math.sqrt((Math.pow(getPosicionX(), 2) - Math.pow(p.getPosicionX(), 2)) + (Math.pow(getPosicionY(), 2)- Math.pow(p.getPosicionY(), 2))));
        p.evolucionar();
    }


    // setters y getters


    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }
}
