package TrabalhoObserver.inatel.palavrasCruzadas.Interface;
import TrabalhoObserver.inatel.palavrasCruzadas.Observador.Observador;
public interface ObservadorActions {
    void addObservador(Observador observer);
    void removeObservador(Observador observer);
    void notification();
}
