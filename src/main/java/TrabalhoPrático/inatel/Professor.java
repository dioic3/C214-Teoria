package TrabalhoPrático.inatel;

public class Professor {
    private String nomeDoProfessor;
    private String horarioDeAtendimento;
    private String periodo;
    private int sala;
    private int predio;

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
            this.predio = 1;
            getPredio();
        }
        else if(sala >= 6 && sala <= 10){
            this.predio = 2;
            getPredio();
        }
        else if(sala >= 11 && sala <= 15){
            this.predio = 3;
            getPredio();
        } else if (sala >= 16 && sala <= 20) {
            this.predio = 4;
            getPredio();
        }
        else if(sala >= 21 && sala <= 25){
            this.predio = 5;
            getPredio();
        } else if (sala >= 26 && sala <= 30) {
            this.predio = 6;
            getPredio();
        }
        else {
            System.out.println("As salas são do número 1 até 30. Por favor, selecione uma opção dentro da faixa de número apresentado.");
        }
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getPredio() {
        return predio;
    }

    public void setPredio(int predio) {
        this.predio = predio;
    }
}
