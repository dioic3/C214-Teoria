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

        // Obtenha o vetor "predio" como um array de inteiros
        int[] predioArray = new Gson().fromJson(jsonObject.get("predio").getAsJsonArray(), int[].class);


        return new Professor(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horárioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString(),
                jsonObject.get("sala").getAsInt()
        );
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
