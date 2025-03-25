import javax.swing.*;
import java.util.ArrayList;

public class Menu extends JFrame {
    private ArrayList<Coche> coches = new ArrayList<>();
    private String path = "src\\datos.csv";

    public Menu(){
        setTitle("GestorCoches");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opciones");

        JMenuItem itemAdd = new JMenuItem("Crear Coche");
        JMenuItem itemView = new JMenuItem("Ver Coches");
        JMenuItem itemFile = new JMenuItem("Cargar Coches");

        itemAdd.addActionListener(e -> new FormularioCoches(this, coches));
        itemView.addActionListener(e -> new TablaCoches(this, coches));
        itemFile.addActionListener(e -> {
            int confirma = JOptionPane.showConfirmDialog(this, "Deseas cargar desde el archivo?", "AVISO", JOptionPane.YES_NO_OPTION);
            if(confirma == JOptionPane.YES_OPTION){
                TablaCoches.cargarDatos(path, coches);
            }
        });

        menu.add(itemAdd);
        menu.add(itemView);
        menu.add(itemFile);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        setVisible(true);
    }
}
