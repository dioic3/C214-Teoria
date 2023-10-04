package TrabalhoPráticoTeste.Inatel;

import TrabalhoPrático.inatel.ServiçoDeAtendimento;

import java.util.ArrayList;

public class MockServiçoDeAtendimento implements ServiçoDeAtendimento {

    @Override
    public String InformaçõesAtendimento(String nomeDoProfessor) {
        if (nomeDoProfessor == "Joyce"){
            return ProfessorJson.DIOICE;
        } else if(nomeDoProfessor == "Julia"){
            return ProfessorJson.JULIA;
        } else if (nomeDoProfessor == "Jaqueline") {
            return ProfessorJson.JAQUELINE;
        } else if (nomeDoProfessor == "José") {
            return ProfessorJson.JOSE;
        } else if (nomeDoProfessor == "Pedro") {
            return ProfessorJson.PEDRO;
        } else if (nomeDoProfessor == "Usuário Inválido") {
            return ProfessorJson.INVALIDO;
        }
        else if(nomeDoProfessor == "Inexistente"){
            return ProfessorJson.INEXISTENTE;
        }
        return nomeDoProfessor;
    }

    @Override
    public boolean atendimentoExistente(String nomeDoProfessor) {
        ArrayList<String> listaDeProfessor = new ArrayList<String>();
        listaDeProfessor.add("Usuário Inválido");
        listaDeProfessor.add("Pedro");
        listaDeProfessor.add("José");
        listaDeProfessor.add("Jaqueline");
        listaDeProfessor.add("Julia");
        listaDeProfessor.add("Joyce");

        for (int i = 0; i < listaDeProfessor.size(); i++) {
            if (listaDeProfessor.get(i).equals(nomeDoProfessor)) {
                return true;
            }
        }
        return false;
    }
}
