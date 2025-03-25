import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FormularioCoches {
    public FormularioCoches(JFrame parent, ArrayList<Coche> coches){
        JFrame frameFormulario = new JFrame("CREAR COCHE");
        frameFormulario.setSize(450,300);
        frameFormulario.setLocationRelativeTo(parent);
        frameFormulario.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(4,4,5,5));

        panel.add(new JLabel("MARCA:"));
        JTextField txtMarca = new JTextField();
        panel.add(txtMarca);
        panel.add(new JLabel("ANIO:"));
        JTextField txtAnio = new JTextField();
        panel.add(txtAnio);
        panel.add(new JLabel("COLOR:"));
        JTextField txtColor = new JTextField();
        panel.add(txtColor);

        JButton btnAdd = new JButton("AÑADIR");
        btnAdd.addActionListener(e -> {
            if(txtMarca.getText().isEmpty() || txtAnio.getText().isEmpty() || txtColor.getText().isEmpty()){
                JOptionPane.showMessageDialog(frameFormulario, "Todos los campos son obligatorios", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            try {
                int anio = Integer.parseInt(txtAnio.getText());
                coches.add(new Coche(txtMarca.getText(), anio, txtColor.getText()));
                JOptionPane.showMessageDialog(frameFormulario, "Coche creado con exito", "AVISO", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e1){
                JOptionPane.showMessageDialog(frameFormulario, "Fallo en el formato del año", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        });


        frameFormulario.add(panel, BorderLayout.CENTER);
        frameFormulario.add(btnAdd, BorderLayout.SOUTH);
        frameFormulario.setVisible(true);
    }
}
