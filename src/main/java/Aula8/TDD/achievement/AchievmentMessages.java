package Aula8.TDD.achievement;

import java.util.ArrayList;
import java.util.List;

public class AchievmentMessages {
    private List<RecebedorMSG> receiver = new ArrayList<RecebedorMSG>();
    public void distribuirMensagem(String msg){
        if(receiver.isEmpty())
            throw new SemRecebedoresExpection("Sem recebedores válido");
        for (RecebedorMSG recebedorMSG: receiver){
            try {
                recebedorMSG.recebedorMensagem(msg);
            } catch (RuntimeException e){

            }
        }
    }

    public void adicionarRecebedor(RecebedorMSG rm){
        this.receiver.add(rm);
    }

    public void removerRecebedor(RecebedorMSG rm){
        receiver.remove(rm);
    }
}
