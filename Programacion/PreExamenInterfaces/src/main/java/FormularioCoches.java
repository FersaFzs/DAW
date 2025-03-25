import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.FileNameMap;
import java.util.ArrayList;

public class FormularioCoches {
    private JTextField inputMarca;
    private JTextField inputAnio;
    private JTextField inputColor;
    private JButton btnAdd;
    private ArrayList<Coche> coches;

    public FormularioCoches(JFrame parent, ArrayList<Coche> coches){
        this.coches = coches;
        JFrame frameFormulario = new JFrame("NUEVO COCHE");
        frameFormulario.setSize(400, 400);
        frameFormulario.setLocationRelativeTo(parent);
        frameFormulario.setLayout(new GridLayout(4, 2, 0, 0));
        frameFormulario.setFont(new Font("Arial", Font.BOLD, 18));

        JPanel panel = new JPanel(new GridLayout(4,2,5,5));
        JLabel labelMarca = new JLabel("  MARCA: ");
        labelMarca.setForeground(Color.BLACK);
        labelMarca.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(labelMarca);
        inputMarca = new JTextField();
        inputMarca.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        inputMarca.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inputMarca);

        JLabel labelAnio = new JLabel("  AÑO: ");
        labelAnio.setForeground(Color.BLACK);
        labelAnio.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(labelAnio);
        inputAnio = new JTextField();
        inputAnio.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        inputAnio.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inputAnio);

        JLabel labelColor = new JLabel("  COLOR: ");
        labelColor.setForeground(Color.BLACK);
        labelColor.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(labelColor);
        inputColor = new JTextField();
        inputColor.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        inputColor.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(inputColor);

        btnAdd = new JButton("AÑADIR");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarCoche();
            }
        });

        btnAdd.setBackground(Color.BLACK);
        btnAdd.setForeground(Color.WHITE);
        btnAdd.setBorder(BorderFactory.createLineBorder(Color.BLUE, 3));
        btnAdd.setFont(new Font("Arial", Font.BOLD, 18));

        frameFormulario.add(panel, BorderLayout.CENTER);
        frameFormulario.add(btnAdd, BorderLayout.SOUTH);
        frameFormulario.setVisible(true);
        
    }

    private void agregarCoche(){
        try {
            String marca = inputMarca.getText();
            int anio = Integer.parseInt(inputAnio.getText());
            String color = inputColor.getText();

            if (marca.isBlank() || color.isBlank()){
                JOptionPane.showMessageDialog(new Menu(), "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            } else {

                Coche.addCoche(coches, marca, anio, color);

                JOptionPane.showMessageDialog(new Menu(), "Coche agregado correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);

                inputMarca.setText("");
                inputAnio.setText("");
                inputColor.setText("");
            }


        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(new Menu(), "El año debe ser un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
