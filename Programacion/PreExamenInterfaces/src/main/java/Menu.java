import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu extends JFrame {
    private ArrayList<Coche> coches;
    String path = "C:\\Users\\Administrator\\Desktop\\DAW\\Programacion\\PreExamenInterfaces\\archivos\\datos.csv";
    public Menu(){
        coches = Coche.generarCoches(path);

        setTitle("Main menu");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1, 10, 10));

        JButton btnMostrarTabla = new JButton("Mostrar Coches");
        btnMostrarTabla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TablaCoches(coches);
            }
        });
        add(btnMostrarTabla);

        JButton btnAddCoche = new JButton("Agregar Coche");
        btnAddCoche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new FormularioCoches(Menu.this, coches);
            }
        });
        add(btnAddCoche);

        setVisible(true);
    }
}
