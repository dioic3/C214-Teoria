package TrabalhoPráticoTeste.Inatel;

import TrabalhoPrático.inatel.BuscaAtendimento;
import TrabalhoPrático.inatel.Professor;
import TrabalhoPrático.inatel.ServiçoDeAtendimento;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteBuscaAtendimento {
    ServiçoDeAtendimento serviçoDeAtendimento;
    BuscaAtendimento buscaAtendimento;

    @Before
    public void setup(){
        serviçoDeAtendimento = new MockServiçoDeAtendimento();
        buscaAtendimento = new BuscaAtendimento(serviçoDeAtendimento);
    }

    //primeiro cenário
    @Test
    public void buscaPorJoyce(){
        Professor Joyce = buscaAtendimento.buscaAtendimento("Joyce");
        assertEquals("Joyce",Joyce.getNomeDoProfessor());
        assertEquals("18h", Joyce.getHorarioDeAtendimento());
        assertEquals("Noturno", Joyce.getPeriodo());
        assertEquals(1, Joyce.getSala());
        assertEquals(1, Joyce.getPredioEscolhido());
    }
}
