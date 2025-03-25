import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FormularioCoches {
    public FormularioCoches(JFrame parent, ArrayList<Coche> coches){
        JFrame frameFormulario = new JFrame("CREAR COCHE");
        frameFormulario.setSize(450,300);
        frameFormulario.setLocationRelativeTo(parent);
        frameFormulario.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(3,2,5,10));

        JLabel labelMarca = new JLabel("  MARCA:");
        panel.add(labelMarca);
        JTextField txtMarca = new JTextField();
        panel.add(txtMarca);
        JLabel labelAnio = new JLabel("  AÑO:");
        panel.add(labelAnio);
        JTextField txtAnio = new JTextField();
        panel.add(txtAnio);
        JLabel labelColor = new JLabel("  COLOR:");
        panel.add(labelColor);
        JTextField txtColor = new JTextField();
        panel.add(txtColor);

        JButton btnAdd = new JButton("AÑADIR");

        //Estilos
        labelMarca.setFont(new Font("Arial", Font.BOLD, 18));
        labelAnio.setFont(new Font("Arial", Font.BOLD, 18));
        labelColor.setFont(new Font("Arial", Font.BOLD, 18));
        labelMarca.setForeground(Color.WHITE);
        labelAnio.setForeground(Color.WHITE);
        labelColor.setForeground(Color.WHITE);

        btnAdd.setFont(new Font("Arial", Font.BOLD, 18));
        btnAdd.setBackground(Color.BLACK);
        btnAdd.setForeground(Color.WHITE);
        btnAdd.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        panel.setBackground(Color.BLACK);

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
