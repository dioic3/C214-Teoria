package TrabalhoPráticoTeste.Inatel;

import TrabalhoPrático.inatel.BuscaAtendimento;
import TrabalhoPrático.inatel.Professor;
import TrabalhoPrático.inatel.ServiçoDeAtendimento;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    //segundo cenário
    @Test
    public void buscaPorJulia(){
        Professor Julia = buscaAtendimento.buscaAtendimento("Julia");
        assertEquals("Julia",Julia.getNomeDoProfessor());
        assertEquals("19h", Julia.getHorarioDeAtendimento());
        assertEquals("Noturno", Julia.getPeriodo());
        assertEquals(6, Julia.getSala());
        assertEquals(2, Julia.getPredioEscolhido());
    }
    //terceiro cenário
    @Test
    public void buscaPorJaqueline(){
        Professor Jaqueline = buscaAtendimento.buscaAtendimento("Jaqueline");
        assertEquals("Jaqueline", Jaqueline.getNomeDoProfessor());
        assertEquals("15h", Jaqueline.getHorarioDeAtendimento());
        assertEquals("Integral", Jaqueline.getPeriodo());
        assertEquals(10, Jaqueline.getSala());
        assertEquals(2, Jaqueline.getPredioEscolhido());
    }
    //quarto cenário
    @Test
    public void buscaPorJose(){
        Professor Jose = buscaAtendimento.buscaAtendimento("José");
        assertEquals("José", Jose.getNomeDoProfessor());
        assertEquals("17h", Jose.getHorarioDeAtendimento());
        assertEquals("Integral", Jose.getPeriodo());
        assertEquals(30, Jose.getSala());
        assertEquals(6, Jose.getPredioEscolhido());
    }

    //quinto cenario
    @Test
    public void buscaPorPedro(){
        Professor Pedro = buscaAtendimento.buscaAtendimento("Pedro");
        assertEquals("Pedro", Pedro.getNomeDoProfessor());
        assertEquals("17h", Pedro.getHorarioDeAtendimento());
        assertEquals("Integral", Pedro.getPeriodo());
        assertEquals(20, Pedro.getSala());
        assertEquals(4, Pedro.getPredioEscolhido());
    }

    //Sexto cenário
    @Test
    public void buscandoPorUsuarioInvalido(){
        Professor Invalido = buscaAtendimento.buscaAtendimento("Usuário Inválido");
        assertEquals("Usuário Inválido", Invalido.getNomeDoProfessor());
        assertEquals("null", Invalido.getHorarioDeAtendimento());
        assertEquals("null", Invalido.getPeriodo());
        assertEquals(0, Invalido.getSala());
        assertEquals(0, Invalido.getPredioEscolhido());
    }

    //Sétima cenário
    @Test
    public void buscandoPorUsuarioInexistente(){
        Professor Inexistente = buscaAtendimento.buscaAtendimento("Inexistente");
        assertEquals("Não existe", Inexistente.getNomeDoProfessor());
        assertEquals("null", Inexistente.getHorarioDeAtendimento());
        assertEquals("null", Inexistente.getPeriodo());
        assertEquals(0, Inexistente.getSala());
        assertEquals(0, Inexistente.getPredioEscolhido());
    }

    //Oitavo Cenário
    @Test
    public void buscandoAtendimentoInexistente(){
        boolean Joyce = buscaAtendimento.atendimentoExistente("Dioice");
        assertFalse(Joyce);
    }

    //Nono cenário
    @Test
    public void buscandoAtendimentodaJoyce(){
        boolean Joyce = buscaAtendimento.atendimentoExistente("Joyce");
        assertTrue(Joyce);
    }

    //Décimo Cenário
    @Test
    public void buscandoAtendimentoDaJulia(){
        boolean Julia = buscaAtendimento.atendimentoExistente("Julia");
        assertTrue(Julia);
    }

    //Decimo primeiro cenário
    @Test
    public void testendoRetornoDePeriodoErradoDaJaqueline() {
        Professor Jaqueline = buscaAtendimento.buscaAtendimento("Jaqueline");
        assertEquals("Jaqueline", Jaqueline.getNomeDoProfessor());
        assertNotEquals("Noturno", Jaqueline.getPeriodo());
    }

    //Décimo segundo cenário
    @Test
    public void testendoRetornoDeSalaErradoDaJaqueline() {
        Professor Jaqueline = buscaAtendimento.buscaAtendimento("Jaqueline");
        assertEquals("Jaqueline", Jaqueline.getNomeDoProfessor());
        assertNotEquals(5, Jaqueline.getPredioEscolhido());
    }

    //Décimo Terceiro cenário
    @Test
    public void testendoRetornoDeHorarioErradoDaJaqueline() {
        Professor Jaqueline = buscaAtendimento.buscaAtendimento("Jaqueline");
        assertEquals("Jaqueline", Jaqueline.getNomeDoProfessor());
        assertNotEquals("16h", Jaqueline.getHorarioDeAtendimento());
    }
    //Décimo quarto cenário
    @Test
    public void testendoRetornoDeSalaErradaDaJaqueline() {
        Professor Jaqueline = buscaAtendimento.buscaAtendimento("Jaqueline");
        assertEquals("Jaqueline", Jaqueline.getNomeDoProfessor());
        assertNotEquals(30, Jaqueline.getSala());
    }
    //Decimo quinto cenário
    @Test
    public void buscandoNomeErradoDaJaqueline(){
        Professor Jaqueline = buscaAtendimento.buscaAtendimento("Jaqueline");
        assertNotEquals("Jaquelineeee", Jaqueline.getNomeDoProfessor());
        assertEquals("15h", Jaqueline.getHorarioDeAtendimento());
        assertEquals("Integral", Jaqueline.getPeriodo());
        assertEquals(10, Jaqueline.getSala());
        assertEquals(2, Jaqueline.getPredioEscolhido());
    }
    //Décimo sexto cenário
    @Test
    public void buscandoNomeErradoDoPedro(){
        Professor Pedro = buscaAtendimento.buscaAtendimento("Pedro");
        assertNotEquals("Pedroca", Pedro.getNomeDoProfessor());
        assertEquals("17h", Pedro.getHorarioDeAtendimento());
        assertEquals("Integral", Pedro.getPeriodo());
        assertEquals(20, Pedro.getSala());
        assertEquals(4, Pedro.getPredioEscolhido());
    }
    //Décimo sétimo cenário
    @Test
    public void buscandoHorárioErradoDoPedro(){
        Professor Pedro = buscaAtendimento.buscaAtendimento("Pedro");
        assertNotEquals("19h", Pedro.getHorarioDeAtendimento());

    }
    //Décimo Oitavo cenário
    @Test
    public void buscandoPorPeriodoErradoDoPedro(){
        Professor Pedro = buscaAtendimento.buscaAtendimento("Pedro");
        assertNotEquals("Noturno", Pedro.getPeriodo());
    }
    //Décimo novo cenário
    @Test
    public void buscandoPorSalaErradaDoPedro(){
        Professor Pedro = buscaAtendimento.buscaAtendimento("Pedro");
        assertNotEquals(50, Pedro.getSala());
    }
    //Vigésimo cenário
    @Test
    public void buscandoPorPredioErradoDoPedro(){
        Professor Pedro = buscaAtendimento.buscaAtendimento("Pedro");
        assertNotEquals(1, Pedro.getPredioEscolhido());
    }
}