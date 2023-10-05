package Aula8.TDD.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    private List<Brownie> brownies;
    private CupomDeDesconto cupom;

    public CarrinhoCompra() {
        brownies = new ArrayList<Brownie>();
    }

    public void adiciona(Brownie bw) throws NumeroNegativoExpection {

        if(bw.getQtd() > 0){
            brownies.add(bw);
        }else{
            throw new NumeroNegativoExpection("Não é possivel adicionar uma quantidade negativa");
        }

    }

    public double somaTotal() {
        double total = 0;
        for (Brownie brownie : brownies) {
            total += brownie.getValor();
        }

        if(cupom != null && cupom.getDesconto() > 0){
            return somaTotalComDesconto(total, cupom.getDesconto());
        }else{
            return total;
        }
    }

    private double somaTotalComDesconto(double total, double desconto){
        return total = total - (total*desconto);
    }

    public double somaTotalItens() {
        double total = 0;
        for (Brownie brownie : brownies) {

            total += brownie.getQtd();
        }
        return total;
    }

    public CupomDeDesconto getCupom() {
        return cupom;
    }

    public void setCupom(CupomDeDesconto cupom) {
        this.cupom = cupom;
    }
}
