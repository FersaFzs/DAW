import javax.swing.*;
import java.awt.*;
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

        JMenuItem itemAdd = new JMenuItem("Crear");
        JMenuItem itemView = new JMenuItem("Ver");
        JMenuItem itemFile = new JMenuItem("Cargar");

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

        //Estilos
        ImageIcon icon = new ImageIcon("src\\icono.png");
        setIconImage(icon.getImage());

        ImageIcon fondo = new ImageIcon("src\\fondo.jpg");
        JLabel imgFondo = new JLabel(fondo, SwingConstants.CENTER);
        imgFondo.setSize(fondo.getIconWidth(), fondo.getIconHeight());
        setContentPane(imgFondo);

        menuBar.setBackground(Color.BLACK);
        menu.setFont(new Font("Arial", Font.BOLD, 18));
        menu.setForeground(Color.WHITE);
        itemAdd.setFont(new Font("Arial", Font.PLAIN, 18));
        itemView.setFont(new Font("Arial", Font.PLAIN, 18));
        itemFile.setFont(new Font("Arial", Font.PLAIN, 18));
        itemAdd.setForeground(Color.WHITE);
        itemAdd.setBackground(Color.DARK_GRAY);
        itemView.setForeground(Color.WHITE);
        itemView.setBackground(Color.DARK_GRAY);
        itemFile.setForeground(Color.WHITE);
        itemFile.setBackground(Color.DARK_GRAY);
        setVisible(true);
    }
}
