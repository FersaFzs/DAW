import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class TablaCoches extends JFrame {
    public TablaCoches(){
        ArrayList<Coche> datosCoches = Coche.generarCoches();
        setTitle("Lista Coches");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Nombre columnas
        String[] columnas = {"Marca", "Año", "Color"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for(Coche coche : datosCoches){
            modelo.addRow(new Object[]{coche.getMarca(), coche.getAnio(), coche.getColor()});
        }

        //Crear tabla
        JTable tabla = new JTable(modelo);
        tabla.setFont(new Font("Arial", Font.PLAIN, 14));
        tabla.setRowHeight(25);
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 16));
        tabla.getTableHeader().setBackground(new Color(50, 50, 150));
        tabla.getTableHeader().setBackground(Color.LIGHT_GRAY);

        //Scroll
        JScrollPane sP = new JScrollPane(tabla);
        add(sP, BorderLayout.CENTER);


        setVisible(true);
    }
}
