import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TablaEstudiantes extends JFrame {
    private DefaultTableModel modelo;
    private ArrayList<Estudiante> datosEstudiantes;

    public TablaEstudiantes(){
        datosEstudiantes = Estudiante.generarEstudiantes();
        setTitle("Lista de Estudiantes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Nombre columnas:
        String[] columnas = {"Nombre", "Edad", "Curso"};
        modelo = new DefaultTableModel(columnas, 0);

        for (Estudiante estudiante : datosEstudiantes){
            modelo.addRow(new Object[]{estudiante.getNombre(), estudiante.getEdad(), estudiante.getCurso()});
        }

        //Crear tabla:
        JTable tabla = new JTable(modelo);
        tabla.setFont(new Font("Arial", Font.PLAIN, 16));
        tabla.setRowHeight(30);
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));
        tabla.getTableHeader().setBackground(Color.DARK_GRAY);
        tabla.getTableHeader().setForeground(Color.WHITE);

        //Scroll
        JScrollPane sP = new JScrollPane(tabla);
        add(sP, BorderLayout.CENTER);

        //Boton para aniadir estudiantes
        JButton btnAdd = new JButton("Añadir Estudiante");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEstudiante();
            }
        });

        JPanel panelBoton = new JPanel();
        panelBoton.add(btnAdd);
    add(panelBoton, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void addEstudiante(){
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del estudiante: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la edad del estudiante: "));
        int curso = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el curso del estudiante: "));

        Estudiante nuevo = new Estudiante(nombre, edad, curso);
        datosEstudiantes.add(nuevo);

        //Add a la tabla
        modelo.addRow(new Object[]{nuevo.getNombre(), nuevo.getEdad(), nuevo.getCurso()});
    }
}
