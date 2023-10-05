package Aula8.TDD.calculador;

public class Calculadora {
    public int soma(int i, int j) {
        return i + j;
    }

    public int subtrair(int i, int j) {
        return i-j;
    }

    public int multiplicacao(int i, int j) {
        return i*j;
    }

    public double divisao(double i, double j) {
        if(j==0)
            throw new IllegalArgumentException("Divisão por zero");
        return i/j;
    }
}
