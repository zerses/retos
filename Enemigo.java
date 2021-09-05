package reto2Variante1;

public class Enemigo extends Personaje {
    // atributos
    private int evolucionesAplicadas = 0;
    private int resistencia = 1;

    // constructor

    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);

    }

    // metodos

    public void evolucionar() {
        if (getVida() <= 30 && getVida() > 10 && evolucionesAplicadas == 0) {
            setDamage(getDamage() + 20);
            evolucionesAplicadas++;
        } else if (getVida() <= 10 && evolucionesAplicadas == 1) {
            evolucionesAplicadas++;
            setResistencia(2);
        }
    }

    public void recibirImpacto(double d) {
        evolucionar();
        if (evolucionesAplicadas == 2) {
            setVida(getVida() - d / resistencia);
            if (getVida() <= 0) {
                setVida(0);
            }

        } else {
            setVida(getVida() - d / resistencia);
            evolucionar();
            if (getVida() <= 0) {
                setVida(0);
            }

        }
    }

    public void golpear(Jugador p) {
        if (Math.sqrt((Math.pow(p.getPosicionX(), 2)- Math.pow(getPosicionX(),2)) + (Math.pow(p.getPosicionY(), 2)- Math.pow(getPosicionY(), 2))) == 0){
            p.setVida(p.getVida() - getDamage());
        }
        else{
            p.setVida(p.getVida() - getDamage() / Math.sqrt((Math.pow(p.getPosicionX(), 2)- Math.pow(getPosicionX(),2)) + (Math.pow(p.getPosicionY(), 2)- Math.pow(getPosicionY(), 2))));
        }
        if (p.getVida() <= 0) {
            p.setVida(0);
        }
    }

    // getters y setters
    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }

    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
}
