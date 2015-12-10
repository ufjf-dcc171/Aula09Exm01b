package aula09exm01;

import java.util.ArrayList;
import java.util.List;

class AlunoDAO {
    private static AlunoDAO instance = null;
    private List<Aluno> alunos = new ArrayList<>();

    public AlunoDAO() {
        alunos.add(new Aluno("Fulano", "2512312", 80.0, 20.0, 90.0));
        alunos.add(new Aluno("Ciclano", "2512313", 70.0, 60.0, 80.0));
        alunos.add(new Aluno("Beltrano", "2512320", 74.0, 80.0, 100.0));
    }
    
    static AlunoDAO getInstance() {
        if(instance == null){
            instance = new AlunoDAO();
        }
        return instance;   
    }

    public List<Aluno> listaTodos() {
        return alunos;
    }

    Aluno get(int rowIndex) {
        return alunos.get(rowIndex);
    }

    void create(Aluno aluno) {
        alunos.add(aluno);
    }
    
}
