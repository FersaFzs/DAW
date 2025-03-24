import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu extends JFrame {
    private ArrayList<Coche> coches;
    String path = "archivos\\datos.csv";

    //EL ejercicio pide hacer un menú, pero como son solo dos opciones en el menú y va a ser una ventana independiente lo hago con dos JButton en vez de JMenu.
    public Menu(){
        coches = Coche.generarCoches(path);
        setTitle("GestorCoches");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1, 0, 0));

        JButton btnMostrarTabla = new JButton("VER COCHES");
        btnMostrarTabla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TablaCoches(coches);
            }
        });
        add(btnMostrarTabla);

        JButton btnAddCoche = new JButton("AGREGAR COCHE");
        btnAddCoche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FormularioCoches(Menu.this, coches);
            }
        });
        add(btnAddCoche);

        btnAddCoche.setBackground(Color.BLACK);
        btnAddCoche.setForeground(Color.WHITE);
        btnAddCoche.setFont(new Font("Arial", Font.BOLD, 18));
        btnAddCoche.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));

        btnMostrarTabla.setBackground(Color.BLACK);
        btnMostrarTabla.setForeground(Color.WHITE);
        btnMostrarTabla.setFont(new Font("Arial", Font.BOLD, 18));
        btnMostrarTabla.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));

        setBackground(Color.BLACK);
        setVisible(true);
    }
}
