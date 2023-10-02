package Aula7.testeMock.mockito;
import Aula7.testeMock.InimigoConst;
import aula7.TesteMock.BuscoInimigo;
import aula7.TesteMock.Inimigo;
import aula7.TesteMock.InimigoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaInimigo {
    @Mock
    private InimigoService service;
    private BuscoInimigo buscoInimigo;

    @Before
    public void setup(){
        buscoInimigo = new BuscoInimigo(service);
    }

    @Test
    public void testeBuscaInimigoSkeleton(){
        Mockito.when(service.busca(55)).thenReturn(InimigoConst.SKELETON);
        Inimigo skeleton = buscoInimigo.buscaInimigo(55);
        assertEquals("Skeleton", skeleton.getNome());
        assertEquals(200.0, skeleton.getQtdVida(), 0.1);
        assertEquals("Espada do Skeleton", skeleton.getArma());
    }

    @Test
    public void testeBuscaInimigoInvalido(){
        Mockito.when(service.busca(56)).thenReturn(InimigoConst.INEXISTENTE);
        Inimigo skeleton = buscoInimigo.buscaInimigo(56);
        //Faz assertion
        assertEquals("Inexistente", skeleton.getNome());
        assertEquals(0, skeleton.getQtdVida(), 0.1);
        assertEquals("Inexistente", skeleton.getArma());
    }

    @Test
    public void testeBuscaInimigoValido(){
        Mockito.when(service.inimigoExistente(10)).thenReturn(true);
        //Faz a busca de um inimigo válido (id = 10 ou id = 20 ou ID positivo)
        boolean inimigoValido = service.inimigoExistente(10);
        assertTrue(inimigoValido);
    }
}
