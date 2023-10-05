package Aula8.TDD.compras;

public class NumeroNegativoExpection extends Throwable {

    // constrói um objeto NumeroNegativoException com a mensagem passada por parâmetro
    public NumeroNegativoExpection(String msg){
        super(msg);
    }

    // contrói um objeto NumeroNegativoException com mensagem e a causa dessa exceção, utilizado para encadear exceptions
    public NumeroNegativoExpection(String msg, Throwable cause){
        super(msg, cause);
    }


}
