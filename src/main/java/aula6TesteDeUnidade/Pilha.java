package aula6TesteDeUnidade;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha<T>{
    private List<T> elementos = new ArrayList<T>(); //arraylist para armazenar os elementos       
    private int tamanho = 0;
    public int size(){
        return tamanho;
    }

    public boolean pilhaVazia(){//verificar se a pilha está vazia
        return (tamanho == 0);
    }
    public void push(T elem){//faz o push na pilha
        elementos.add(elem);
        tamanho++;
    }

    public T pop() throws EmptyStackException { //função que faz o pop na pilha, caso esteja vazia, lança uma exception
        if(pilhaVazia())
            throw new EmptyStackException();
        T elem = elementos.remove(tamanho-1);
        tamanho--;
        return elem;
    }
}