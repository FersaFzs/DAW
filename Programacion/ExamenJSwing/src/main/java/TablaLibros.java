import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class TablaLibros {
    private final DefaultTableModel modelo;
    public TablaLibros(JFrame parent, ArrayList<Libro> libros){
        JFrame frameTabla = new JFrame("LISTA LIBROS");
        frameTabla.setSize(450,300);
        frameTabla.setLocationRelativeTo(parent);

        String[] columnas = {"Título", "Autor", "Año", "  "};
        modelo = new DefaultTableModel(columnas, 0);

        for(Libro l : libros){
            modelo.addRow(new Object[]{l.getTitulo(), l.getAutor(), l.getAnio(), "ELIMINAR"});
        }

        JTable tabla = new JTable(modelo);

        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int columna = tabla.columnAtPoint(e.getPoint());
                int fila = tabla.rowAtPoint(e.getPoint());
                if(columna == 3){
                    int confirma = JOptionPane.showConfirmDialog(frameTabla, "Eliminar Libro?", "AVISO", JOptionPane.YES_NO_OPTION);
                    if(confirma == JOptionPane.YES_OPTION){
                        modelo.removeRow(fila);
                        libros.remove(fila);
                        JOptionPane.showMessageDialog(frameTabla, "Libro Eliminado correctamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });

        //Estilos
        tabla.getTableHeader().setBackground(Color.BLACK);
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
        tabla.getTableHeader().setForeground(Color.WHITE);
        tabla.getTableHeader().setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        tabla.setBackground(Color.DARK_GRAY);
        tabla.setFont(new Font("Arial", Font.PLAIN, 16));
        tabla.setForeground(Color.WHITE);
        frameTabla.add(new JScrollPane(tabla));
        frameTabla.setVisible(true);
    }
}
