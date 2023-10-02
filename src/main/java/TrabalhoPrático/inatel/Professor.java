package TrabalhoPrático.inatel;

public class Professor {
    private String nomeDoProfessor;
    private String horarioDeAtendimento;
    private String periodo;
    private int sala;
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

    public int getSala(){
        return sala;
    }
    public int getPredioEscolhido(int sala) {
        if(sala >= 1 && sala <= 5){
            predioEscolhido = 1;
        }
        else if(sala >= 6 && sala <= 10){
            predioEscolhido = 2;
        }
        else if(sala >= 11 && sala <= 15){
            predioEscolhido = 3;
        } else if (sala >= 16 && sala <= 20) {
            predioEscolhido = 4;
        }
        else if(sala >= 21 && sala <= 25){
            predioEscolhido = 5;
        } else if (sala >= 26 && sala <= 30) {
            predioEscolhido = 6;
        }
        else {
            System.out.println("Escolha um número de sala entre 1 a 30.");
        }
        return predioEscolhido;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
}
