package reto2Variante1;

public class Personaje {
    // atributos
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;
    private double vida = 100;

    // metodo constructor

    public Personaje (String nombre, char sexo, double posicionX, double posicionY, double damage){
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
    }

    // metodos

    public void golpear(Personaje p){

    }

    public void recibirImpacto(double d){

    }

    public double calcularDistanciaRespectoPersonaje(Personaje p){
        //calcularDistanciaRespectoPersonaje(p) = Math.sqrt(Math.pow(this.posicionX, 2) + Math.pow(this.posicionY, 2));
        return calcularDistanciaRespectoPersonaje(p);
    }

    // getters y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {

        this.damage = damage;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
}
