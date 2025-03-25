import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FormularioLibros {
    public FormularioLibros(JFrame parent, ArrayList<Libro> libros){
        JFrame frameFormulario = new JFrame("CREAR LIBRO");
        frameFormulario.setSize(500,200);
        frameFormulario.setLocationRelativeTo(parent);

        JPanel panel = new JPanel(new GridLayout(3,3,10,10));

        JLabel labelTitle = new JLabel(" TÍTULO:");
        JTextField txtTitle = new JTextField();
        JLabel labelAutor = new JLabel(" AUTOR:");
        JTextField txtAutor = new JTextField();
        JLabel labelAnio = new JLabel(" AÑO DE PUBLICACIÓN:");
        JTextField txtAnio = new JTextField();

        panel.add(labelTitle);
        panel.add(txtTitle);
        panel.add(labelAutor);
        panel.add(txtAutor);
        panel.add(labelAnio);
        panel.add(txtAnio);

        JButton btnAdd = new JButton("AÑADIR");
        btnAdd.addActionListener(e -> {
            if(txtTitle.getText().isEmpty() || txtAutor.getText().isEmpty() || txtAnio.getText().isEmpty()){
                JOptionPane.showMessageDialog(frameFormulario, "Todos los campos son obligatorios", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            try{
                int anio = Integer.parseInt(txtAnio.getText());
                Libro l = new Libro(txtTitle.getText(), txtAutor.getText(), anio);
                libros.add(l);
                JOptionPane.showMessageDialog(frameFormulario, "Libro agregado con exito", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                txtTitle.setText("");
                txtAutor.setText("");
                txtAnio.setText("");
            } catch (NumberFormatException e1){
                JOptionPane.showMessageDialog(frameFormulario, "Error en el formato del año", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        });
        frameFormulario.add(panel);
        frameFormulario.add(btnAdd, BorderLayout.SOUTH);

        //Estilos
        //Estilos labels formulario
        labelTitle.setFont(new Font("Arial", Font.BOLD, 18));
        labelAutor.setFont(new Font("Arial", Font.BOLD, 18));
        labelAnio.setFont(new Font("Arial", Font.BOLD, 18));
        labelTitle.setForeground(Color.WHITE);
        labelAutor.setForeground(Color.WHITE);
        labelAnio.setForeground(Color.WHITE);

        //Estilo para los input
        txtTitle.setFont(new Font("Arial", Font.PLAIN, 18));
        txtAutor.setFont(new Font("Arial", Font.PLAIN, 18));
        txtAnio.setFont(new Font("Arial", Font.PLAIN, 18));
        txtTitle.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        txtAutor.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        txtAnio.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));

        //Estilo para el panel
        panel.setBackground(Color.BLACK);

        //Estilo para el botón
        btnAdd.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        btnAdd.setFont(new Font("Arial", Font.BOLD, 18));
        btnAdd.setBackground(Color.WHITE);

        frameFormulario.setVisible(true);
    }
}
