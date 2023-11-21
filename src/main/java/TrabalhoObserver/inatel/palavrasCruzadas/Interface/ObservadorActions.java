package TrabalhoObserver.inatel.palavrasCruzadas.Observador;

public interface ObservadorActions {
    void addObservador(Observer observer);
    void removeObservador(Observer observer);
    void notification();
}
