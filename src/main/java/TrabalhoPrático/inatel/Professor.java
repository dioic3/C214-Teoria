package TrabalhoPrático.inatel;

public class Professor {
    private String nomeDoProfessor;
    private String horarioDeAtendimento;
    private String periodo;
    private int sala;
    private int[] predioEscolhido = new int[5];

    public Professor(String nomeDoProfessor, String horarioDeAtendimento, String periodo, int sala, int predio) {
        this.nomeDoProfessor = nomeDoProfessor;
        this.horarioDeAtendimento = horarioDeAtendimento;
        this.periodo = periodo;
        this.sala = sala;
        if(this.sala >= 1 && this.sala <= 5){
            this.predioEscolhido[0] = 1;
        }
        else if(sala >= 6 && sala <= 10){
            this.predioEscolhido[0] = 2;
        }
        else if(sala >= 11 && sala <= 15){
            this.predioEscolhido[0] = 3;
        } else if (sala >= 16 && sala <= 20) {
            this.predioEscolhido[0] = 4;
        }
        else if(sala >= 21 && sala <= 25){
            this.predioEscolhido[0] = 5;
        } else if (sala >= 26 && sala <= 30) {
            this.predioEscolhido[0] = 6;
        }
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
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getPredioEscolhido() {
        return predioEscolhido[0];
    }

    public void setPredioEscolhido(int[] predioEscolhido) {
        this.predioEscolhido = predioEscolhido;
    }
}
