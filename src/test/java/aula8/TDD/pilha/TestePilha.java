package aula8.TDD.pilha;

import Aula8.TDD.pilha.Pilha;
import Aula8.TDD.pilha.PilhaCheiaException;
import Aula8.TDD.pilha.PilhaVaziaException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestePilha {
    private Pilha pilha;
    private int maxElementos;

    @Before
    public void init() {
        maxElementos = 15;
        pilha = new Pilha(maxElementos);
    }

    @Test
    public void testePilhaVazia() {
        assertTrue(pilha.pilhaVazia());
        assertEquals(0, pilha.getQtdElementos());
    }

    @Test
    public void testPushPilha() {
        pilha.push(23);
        assertFalse(pilha.pilhaVazia());
        assertEquals(1, pilha.getQtdElementos());
        assertEquals(23, pilha.mostraTopo());
    }

    @Test
    public void testePush2Elementos() {
        pilha.push(23);
        pilha.push(9);
        assertEquals(2, pilha.getQtdElementos());
        assertEquals(9, pilha.mostraTopo());
    }

    @Test
    public void testePop() {
        pilha.push(23);
        pilha.push(7);
        int topo = pilha.pop();
        assertEquals(topo, 7);
        assertEquals(1, pilha.getQtdElementos());
    }

    @Test(expected= PilhaVaziaException.class)
    public void testePopPilhaVazia() {
        pilha.pop();
    }

    @Test
    public void testePushPilhaCheia() {
        for(int i = 0; i < maxElementos; i++)
            pilha.push(i);
        try {
            pilha.push(42);
            fail();
        } catch (PilhaCheiaException e) {
            assertEquals(42, e.getElemento());
        }
    }
}
