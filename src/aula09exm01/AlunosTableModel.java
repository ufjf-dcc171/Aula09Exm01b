package aula09exm01;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author igor
 */
class AlunosTableModel extends AbstractTableModel {
    private final AlunoDAO dao;

    public AlunosTableModel(AlunoDAO instance) {
        this.dao = instance;
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Matrícula";
            case 1: return "Aluno";
            case 2: return "Nota 1";
            case 3: return "Nota 2";
            case 4: return "Nota 3";
        }
        return "??";
    }
    
    

    @Override
    public int getRowCount() {
        return dao.listaTodos().size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dao.get(rowIndex).getMatricula();
            case 1: return dao.get(rowIndex).getNome();
            case 2: return dao.get(rowIndex).getNota1();
            case 3: return dao.get(rowIndex).getNota2();
            case 4: return dao.get(rowIndex).getNota3();
        }
        return "??";
    }
    
}
