package aula3maven.musicas.main;
import java.io.FileWriter;
import aula3maven.musicas.Musicas;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Musicas> musicas = new ArrayList<Musicas>();
        musicas.add(new Musicas("Really Don't Care",3));
        musicas.add(new Musicas("29",5));

        //instanciando o gson com PrettyPrinting()
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // criando o json a partir da lista de musicas com a dependencia gson
        String json = gson.toJson(musicas);
        //criando o json no arquivo musicas.json
        FileWriter writer;
        try {
            writer = new FileWriter("musicas.json");
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
