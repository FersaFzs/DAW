import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioEstudiante extends JFrame {

    private JTextField nombreField;
    private JTextField edadField;
    private JTextField cursoField;
    private JButton guardarButton;

    public FormularioEstudiante() {

        setTitle("Formulario de Estudiante");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Aplicar estilos
        aplicarEstilo();

        //Crear panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        // Crear y agregar etiquetas y campos de texto
        panel.add(new JLabel("Nombre del estudiante:\n"));
        nombreField = new JTextField();
        panel.add(nombreField);

        panel.add(new JLabel("Edad del estudiante:"));
        edadField = new JTextField();
        panel.add(edadField);

        panel.add(new JLabel("Curso matriculado:"));
        cursoField = new JTextField();
        panel.add(cursoField);

        //Boton de guardar
        guardarButton = new JButton("Guardar");
        guardarButton.setFocusPainted(false);
        guardarButton.setBackground(new Color(59, 89, 182));
        guardarButton.setForeground(Color.BLACK);
        guardarButton.setFont(new Font("Arial", Font.BOLD, 16));

        panel.add(guardarButton);

        //Agregar el panel
        add(panel);


        setVisible(true);

        //Configurar el boton e guardar
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarDatos();
            }
        });
    }

    private void guardarDatos() {
        //Guardar los datos
        Estudiante e1 = new Estudiante(nombreField.getText(), Integer.parseInt(edadField.getText()), cursoField.getText());

        // Mostrar los datos en un JOptionPane
        String mensaje = e1.toString();
        JOptionPane.showMessageDialog(this, mensaje, "Datos del Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }

    private void aplicarEstilo(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            //Colores y fuentes
            UIManager.put("Panel.background", new Color(50, 50, 50));
            UIManager.put("Label.font", new Font("Arial", Font.BOLD, 18));
            UIManager.put("Label.foreground", Color.WHITE);
            UIManager.put("Label.background", Color.BLACK);
            UIManager.put("TextField.font", new Font("Arial", Font.PLAIN, 16));
            UIManager.put("Button.background", new Color(59, 89, 182));
            UIManager.put("Button.foreground", Color.BLACK);
            UIManager.put("Button.font", new Font("Arial", Font.BOLD, 14));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}