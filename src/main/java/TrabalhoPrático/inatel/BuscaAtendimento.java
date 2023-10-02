package TrabalhoPrático.inatel;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaAtendimento {
    ServiçoDeAtendimento  serviçoDeAtendimento;

    public BuscaAtendimento(ServiçoDeAtendimento serviçoDeAtendimento){
        this.serviçoDeAtendimento = serviçoDeAtendimento;
    }

    public Professor buscaAtendimento(String nomeDoProfessor){
        String AtendimentoJson = serviçoDeAtendimento.InformaçõesAtendimento(nomeDoProfessor);
        JsonObject jsonObject = JsonParser.parseString(AtendimentoJson).getAsJsonObject();

        return new Professor(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString(),
                jsonObject.get("sala").getAsInt());
    }

    public boolean atendimentoExistente(String nomeDoProfessor){
        boolean atendimentoExistente = serviçoDeAtendimento.atendimentoExistente(nomeDoProfessor);
        if(atendimentoExistente){
            return true;
        }
        else {
            return false;
        }
    }
}
