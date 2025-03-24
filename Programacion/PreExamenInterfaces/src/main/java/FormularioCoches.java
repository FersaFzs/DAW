import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class FormularioCoches extends JFrame {
    private JTextField inputMarca;
    private JTextField inputAnio;
    private JTextField inputColor;
    private JButton btnAdd;
    private ArrayList<Coche> coches;

    public FormularioCoches(JFrame parent, ArrayList<Coche> coches){
        this.coches = coches;

        setTitle("Añadir Coche");
        setSize(400, 400);
        setLocationRelativeTo(parent);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Marca: "));
        inputMarca = new JTextField();
        add(inputMarca);

        add(new JLabel("Anio: "));
        inputAnio = new JTextField();
        add(inputAnio);

        add(new JLabel("Color: "));
        inputColor = new JTextField();
        add(inputColor);

        btnAdd = new JButton("Añadir: ");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarCoche();
            }
        });
        add(btnAdd);

        setVisible(true);
        
    }

    private void agregarCoche(){
        try {
            String marca = inputMarca.getText();
            int anio = Integer.parseInt(inputAnio.getText());
            String color = inputColor.getText();

            if (marca.isBlank() || color.isBlank()){
                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            }

            Coche.agregarCoche(coches, marca, anio, color);

            JOptionPane.showMessageDialog(this, "Coche agregado correctamente", "Exito", JOptionPane.INFORMATION_MESSAGE);

            inputMarca.setText("");
            inputAnio.setText("");
            inputColor.setText("");

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "El anio debe ser un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
