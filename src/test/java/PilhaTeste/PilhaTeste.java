package PilhaTeste;

import aula6TesteDeUnidade.Pilha;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class PilhaTeste {
    Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
    @Test
    public void testePilhaVazia(){
        // no junit é sempre importante adicionar a dependencia de teste no projeto e usar a anotação @Test
        // nunca deve receber parametros
        boolean vazia = pilhaInteiros.pilhaVazia();
        assertTrue(vazia);
    }

    @Test
    public void TestePilhaPush(){
        pilhaInteiros.push(23);
        int tamanho = pilhaInteiros.size();
        assertEquals(1,tamanho);
    }

    @Test
    public void testPilhaPopSize(){
        pilhaInteiros.push(13);
        pilhaInteiros.pop();
        int tamanho = pilhaInteiros.size();
        assertEquals(0,tamanho);
    }

    @Test
    public void testePilhaPopRetorno(){
       int valor = 13;
       pilhaInteiros.push(valor);
       int retorno = pilhaInteiros.pop();
       assertEquals(valor,retorno);
    }
}
