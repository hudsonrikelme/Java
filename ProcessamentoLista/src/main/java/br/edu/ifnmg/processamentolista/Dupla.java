package br.edu.ifnmg.processamentolista;

/**
 *
 * @author Rikelme
 */
public class Dupla<T, U> {

    private T x;
    private U y;

    public Dupla(T x, U y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public U getY() {
        return y;
    }

    public void setY(U y) {
        this.y = y;
    }

}
