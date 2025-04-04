import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ModeloTablaEstudiantes extends AbstractTableModel {
    private final String[] columnNames = {"Nombre", "Edad", "Curso"};
    private List<Estudiante> estudiantes;

    public ModeloTablaEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        fireTableRowsInserted(estudiantes.size() - 1, estudiantes.size() - 1);
    }

    @Override
    public int getRowCount() {
        return estudiantes.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estudiante estudiante = estudiantes.get(rowIndex);
        switch (columnIndex) {
            case 0: return estudiante.getNombre();
            case 1: return estudiante.getEdad();
            case 2: return estudiante.getCurso();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0: return String.class;
            case 1: return Integer.class;
            case 2: return String.class;
            default: return Object.class;
        }
    }
}