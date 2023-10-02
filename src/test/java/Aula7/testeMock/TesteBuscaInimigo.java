package Aula7.testeMock;
import aula7.TesteMock.BuscoInimigo;
import aula7.TesteMock.Inimigo;
import aula7.TesteMock.InimigoService;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TesteBuscaInimigo {
    InimigoService service;
    BuscoInimigo buscaInimigo;
    @Before
    public void setup(){
        //Criando o contexo do meu teste com o Mock (serviço mock)
        service = new MockInimigoService();
        buscaInimigo = new BuscoInimigo(service);
    }

    @Test
    public void testeBuscaInimigoSkeleton(){
        InimigoService service = null;
        BuscoInimigo buscaInimigo = new BuscoInimigo(service);
        Inimigo skeleton = buscaInimigo.buscaInimigo(10);
    }


}
