package TrabalhoObserver;
import TrabalhoObserver.inatel.palavrasCruzadas.Observador.Observador;
import TrabalhoObserver.inatel.palavrasCruzadas.Observador.Observavel;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteObserver {
    @Test
    public void adicionarObservavel(){
        Observavel obs = new Observavel();
        Observador obs1 = new Observador(50);
        obs.addObservador(obs1);
        assertTrue(obs.getObservers().contains(obs1));
    }

    @Test
    public void removerObservavel(){
        Observavel obs = new Observavel();
        Observador obs1 = new Observador(50);
        obs.addObservador(obs1);
        obs.removeObservador(obs1);
        assertTrue(obs.getObservers().isEmpty());
    }
    @Test
    public void contarTodasPalavras() {
        Observavel observavel = new Observavel();
        assertEquals(3, observavel.contarTodasPalavras("Hello World Java"));
        assertEquals(1, observavel.contarTodasPalavras("SingleWord"));
    }

    @Test
    public void palavrasPar() {
        Observavel observavel = new Observavel();
        assertEquals(2, observavel.palavrasPar("Even Word"));
        assertEquals(0, observavel.palavrasPar("Odd Words"));
    }

    @Test
    public void contarPalavrasMaiusculas() {
        Observavel observavel = new Observavel();
        assertEquals(3, observavel.contarPalavrasMaiusculas("Java Is Fun"));
        assertEquals(0, observavel.contarPalavrasMaiusculas("lowercase words"));
        assertEquals(2, observavel.contarPalavrasMaiusculas("Only Uppercase"));
    }

    @Test
    public void notification() {
        Observador observador1 = new Observador(1);
        Observador observador2 = new Observador(2);
        Observavel observavel = new Observavel();
        observavel.addObservador(observador1);
        observavel.addObservador(observador2);
        observavel.notification();
        assertTrue(observador1.isNotificação());
        assertTrue(observador2.isNotificação());
    }
}
