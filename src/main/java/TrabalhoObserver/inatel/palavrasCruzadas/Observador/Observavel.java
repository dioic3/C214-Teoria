package TrabalhoObserver.inatel.palavrasCruzadas.Observador;

import TrabalhoObserver.inatel.palavrasCruzadas.Interface.ObservadorActions;
import TrabalhoObserver.inatel.palavrasCruzadas.Interface.ObservadorUpdate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Observavel implements ObservadorActions {
    private List<Observador> observers;

    public Observavel(){
        this.observers = new ArrayList<>();
    }
    public List<Observador> getObservers() {
        return observers;
    }

    public void setObservers(List<Observador> observers) {
        this.observers = observers;
    }

    @Override
    public void addObservador(Observador observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservador(Observador observer) {
        observers.remove(observer);
    }

    @Override
    public void notification() {
        for (ObservadorUpdate observer : observers) {
            observer.update(observer);
        }
    }

    public int contarTodasPalavras(String sentence) {
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public int palavrasPar(String sentence) {
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    public int contarPalavrasMaiusculas(String sentence) {
        return Arrays.stream(sentence.split("\\s+"))
                .filter(word -> !word.isEmpty() && Character.isUpperCase(word.charAt(0)))
                .toArray()
                .length;
    }
}
