package TrabalhoObserver.inatel.palavrasCruzadas.Observador;
import TrabalhoObserver.inatel.palavrasCruzadas.Interface.ObservadorUpdate;
public class Observador implements ObservadorUpdate {
    private int id;
    private boolean notificação;
    public Observador(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void update(ObservadorUpdate observador) {
        System.out.println("O observador " + id + " foi avisado.");
        notificação = true;
    }

    public boolean isNotificação() {
        return notificação;
    }
}