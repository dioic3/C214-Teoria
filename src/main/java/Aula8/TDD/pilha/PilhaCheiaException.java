package Aula8.TDD.pilha;

public class PilhaCheiaException extends RuntimeException{

    private int elemento;

    public PilhaCheiaException(int elemento) {
        this.elemento = elemento;
    }

    public int getElemento() {
        return elemento;
    }
}
