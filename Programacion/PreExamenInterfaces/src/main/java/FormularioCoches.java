import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioCoches extends JFrame {
    private JTextField inputMarca;
    private JTextField inputAnio;
    private JTextField inputColor;
    private JButton btnAdd;
    private Coche nuevo;

    public FormularioCoches(JFrame parent){
        setTitle("Añadir Coche");
        setSize(400, 400);
        setLocationRelativeTo(parent);
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Marca: "));
        inputMarca = new JTextField();
        add(inputMarca);

        add(new JLabel("Anio: "));
        inputAnio = new JTextField();
        add(inputAnio);
        
    }
}
