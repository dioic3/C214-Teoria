package aula8.TDD.compras;

import Aula8.TDD.compras.Brownie;
import Aula8.TDD.compras.CarrinhoCompra;
import Aula8.TDD.compras.CupomDeDesconto;
import Aula8.TDD.compras.NumeroNegativoExpection;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteCarrinhoDeCompras {


    // Teste inicial básico (Padrão 1)
    @Test
    public void testSomaTotalCompra() throws NumeroNegativoExpection {

        Brownie bw1 = new Brownie("Brownie Nutella", 6, 150);
        Brownie bw2 = new Brownie("Brownie Doce de Leite", 4, 100);

        CarrinhoCompra carrinho = new CarrinhoCompra();

        carrinho.adiciona(bw1);
        carrinho.adiciona(bw2);

        assertEquals(250, carrinho.somaTotal(),0.01);

    }


    // Teste inicial básico (Padrão 1) + algo diferente (teste valor total de itens) (Padrão 2)
    @Test
    public void testSomaTotalQtd() throws NumeroNegativoExpection {

        Brownie bw1 = new Brownie("Brownie Nutella", 6, 150);
        Brownie bw2 = new Brownie("Brownie Doce de Leite", 4, 100);

        CarrinhoCompra carrinho = new CarrinhoCompra();

        carrinho.adiciona(bw1);
        carrinho.adiciona(bw2);
        assertEquals(10, carrinho.somaTotalItens(),0.01);


    }

    // Teste negativo (Padrão 3) forçando uma situação inesperada
    @Test(expected = NumeroNegativoExpection.class)
    public void testSomaNegativo() throws NumeroNegativoExpection {

        Brownie bw1 = new Brownie("Brownie Nutella", -6, 150);
        Brownie bw2 = new Brownie("Brownie Doce de Leite", -4, 100);

        CarrinhoCompra carrinho = new CarrinhoCompra();

        carrinho.adiciona(bw1);
        carrinho.adiciona(bw2);

    }

    // Teste integração (Padrão 4) 2 classes (Carrinho e Cupom sendo testadas juntas).
    @Test
    public void testIntegracaoCupom() throws NumeroNegativoExpection {

        Brownie bw1 = new Brownie("Brownie Nutella", 6, 150);
        Brownie bw2 = new Brownie("Brownie Doce de Leite", 4, 100);

        CarrinhoCompra carrinho = new CarrinhoCompra();
        CupomDeDesconto cupom = new CupomDeDesconto(0.20);
        carrinho.setCupom(cupom);

        carrinho.adiciona(bw1);
        carrinho.adiciona(bw2);
        carrinho.somaTotal();

        assertEquals(200, carrinho.somaTotal(), 0.1);

    }

}
