package aula09exm01;

public class Aluno {
    private String nome;
    private String matricula;
    private Double nota1;
    private Double nota2;
    private Double nota3;

    public Aluno() {
    }

    
    public Aluno(String nome, String matricula, Double n1, Double n2, Double n3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return matricula + "  " +nome+" ["+ nota1 + ", " + nota2 + ", " + nota3 + "]";
    }
    
    
    
}
