import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablaEstudiantesApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            crearYMostrarGUI();
        });
    }

    private static void crearYMostrarGUI() {
        // Crear el modelo de tabla
        ModeloTablaEstudiantes modelo = new ModeloTablaEstudiantes();

        // Añadir algunos datos de ejemplo
        modelo.agregarEstudiante(new Estudiante("Juan Pérez", 20, "Matemáticas"));
        modelo.agregarEstudiante(new Estudiante("María García", 22, "Historia"));
        modelo.agregarEstudiante(new Estudiante("Carlos López", 21, "Programación"));

        // Crear la tabla con el modelo
        JTable tabla = new JTable(modelo);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 200));
        tabla.setFillsViewportHeight(true);

        // Personalizar la tabla
        tabla.setRowHeight(25);
        tabla.setFont(new Font("Arial", Font.PLAIN, 14));
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

        // Crear el panel de botones
        JPanel panelBotones = new JPanel();
        JButton btnAgregar = new JButton("Agregar Estudiante");
        panelBotones.add(btnAgregar);

        // Configurar el botón de agregar
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarEstudianteDialog(modelo);
            }
        });

        // Crear el marco principal
        JFrame frame = new JFrame("Lista de Estudiantes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Añadir componentes al marco
        frame.add(new JScrollPane(tabla), BorderLayout.CENTER);
        frame.add(panelBotones, BorderLayout.SOUTH);

        // Mostrar la ventana
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void agregarEstudianteDialog(ModeloTablaEstudiantes modelo) {
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTextField txtNombre = new JTextField();
        JTextField txtEdad = new JTextField();
        JTextField txtCurso = new JTextField();

        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Edad:"));
        panel.add(txtEdad);
        panel.add(new JLabel("Curso:"));
        panel.add(txtCurso);

        int result = JOptionPane.showConfirmDialog(
                null, 
                panel, 
                "Agregar Nuevo Estudiante", 
                JOptionPane.OK_CANCEL_OPTION, 
                JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            try {
                String nombre = txtNombre.getText();
                int edad = Integer.parseInt(txtEdad.getText());
                String curso = txtCurso.getText();
                
                modelo.agregarEstudiante(new Estudiante(nombre, edad, curso));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null, 
                        "Por favor ingrese una edad válida", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}