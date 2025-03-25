import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TablaCoches {
    private DefaultTableModel modeloTabla;
    public TablaCoches(JFrame parent, ArrayList<Coche> coches){
        JFrame frameTabla = new JFrame("COCHES");
        frameTabla.setSize(400,300);
        frameTabla.setLocationRelativeTo(parent);

        String[] columnas = {"Marca", "Año", "Color", "  "};
        modeloTabla = new DefaultTableModel(columnas, 0);
        JTable tabla = new JTable(modeloTabla);

        for(Coche c : coches){
            modeloTabla.addRow(new Object[]{c.getMarca(), c.getAnio(), c.getColor(), "ELIMINAR"});
        }

        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tabla.rowAtPoint(e.getPoint());
                int columna = tabla.columnAtPoint(e.getPoint());

                if(columna == 3){
                    int confirmacion = JOptionPane.showConfirmDialog(frameTabla, "Eliminar Coche?", "AVISO", JOptionPane.YES_NO_OPTION);
                    if(confirmacion == JOptionPane.YES_OPTION){
                        modeloTabla.removeRow(fila);
                        coches.remove(fila);
                    }
                }
            }
        });

        frameTabla.add(new JScrollPane(tabla));
        frameTabla.setVisible(true);
    }

    public static void cargarDatos(String path, ArrayList<Coche> coches){
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            String linea;
            while((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                coches.add(new Coche(datos[0], Integer.parseInt(datos[1]), datos[2]));
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
