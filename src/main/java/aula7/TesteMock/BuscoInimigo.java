package aula7.TesteMock;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscoInimigo {
    InimigoService inimigoService;
    public BuscoInimigo(InimigoService service){
        this.inimigoService = service;
    }

    public Inimigo buscaInimigo(int id){
        String inimigoJson = inimigoService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(inimigoJson).getAsJsonObject();
        return new Inimigo(jsonObject.get("nome").getAsString(),
                jsonObject.get("qtdVida").getAsDouble(),
                jsonObject.get("arma").getAsString());
    }

    public boolean verificaArrayListExistente(int id){
        boolean inimigoExistente = inimigoService.inimigoExistente(id);

        if (inimigoExistente){
            return true;
        }else{
            return false;
        }
    }
}
