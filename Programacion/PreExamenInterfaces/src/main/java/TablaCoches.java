import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class TablaCoches extends JFrame {
    private DefaultTableModel modelo;
    private ArrayList<Coche> datosCoches;

    public TablaCoches(ArrayList<Coche> datosCoches){
        this.datosCoches = datosCoches;
        setTitle("LISTA COCHES");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        //Nombre columnas
        String[] columnas = {"Marca", "Año", "Color", ""};
        modelo = new DefaultTableModel(columnas, 0);

        actualizarTabla();

        //Crear tabla
        JTable tabla = new JTable(modelo);
        tabla.setFont(new Font("Arial", Font.PLAIN, 14));
        tabla.setRowHeight(25);
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
        tabla.getTableHeader().setBackground(Color.BLACK);
        tabla.getTableHeader().setForeground(Color.WHITE);
        tabla.getTableHeader().setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        tabla.setBackground(Color.DARK_GRAY);
        tabla.setForeground(Color.WHITE);
        tabla.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));

        //Evento mouse para eliminar filas
        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int columna = tabla.columnAtPoint(e.getPoint());
                int fila = tabla.rowAtPoint(e.getPoint());
                if(columna == 3){
                    eliminarFila(fila);
                }
            }
        });

        //Scroll
        JScrollPane sP = new JScrollPane(tabla);
        add(sP, BorderLayout.CENTER);


        setVisible(true);

    }
    private void actualizarTabla(){
        modelo.setRowCount(0);
        for (Coche coche : datosCoches){
            modelo.addRow(new Object[]{coche.getMarca(), coche.getAnio(), coche.getColor(), "Eliminar"});
        }
    }

    private void eliminarFila(int fila){
        if(fila > 0 && fila <= datosCoches.size()){
            datosCoches.remove(fila);
            actualizarTabla();
            JOptionPane.showMessageDialog(this, "Coche eliminado correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
