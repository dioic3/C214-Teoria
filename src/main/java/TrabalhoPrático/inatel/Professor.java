package TrabalhoPrático.inatel;

public class Professor {
    private String nomeDoProfessor;
    private String horarioDeAtendimento;
    private String periodo;
    private int sala;
    private int[] predio = {1,2,3,4,5,6};
    private int predioEscolhido;

    public Professor(String nomeDoProfessor, String horarioDeAtendimento, String periodo, int sala) {
        this.nomeDoProfessor = nomeDoProfessor;
        this.horarioDeAtendimento = horarioDeAtendimento;
        this.periodo = periodo;
        this.sala = sala;
    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public String getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }

    public void setHorarioDeAtendimento(String horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getSala() {
        if(sala >= 1 && sala <= 5){
            predioEscolhido = predio[0];
        }
        else if(sala >= 6 && sala <= 10){
            predioEscolhido = predio[1];
        }
        else if(sala >= 11 && sala <= 15){
            predioEscolhido = predio[2];
        } else if (sala >= 16 && sala <= 20) {
            predioEscolhido = predio[3];
        }
        else if(sala >= 21 && sala <= 25){
            predioEscolhido = predio[4];
        } else if (sala >= 26 && sala <= 30) {
            predioEscolhido = predio[5];
        }
        else {
            System.out.println("As salas são do número 1 até 30. Por favor, selecione uma opção dentro da faixa de número apresentado.");
        }
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
}
