import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class Menu extends JFrame {
    private ArrayList<Libro> libros = new ArrayList<>();
    private String path = "src\\libros.csv";

    public Menu(){
        setTitle("GESTOR LIBROS");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu opciones = new JMenu("Opciones");

        JMenuItem itemAdd = new JMenuItem("CREAR");
        JMenuItem itemView = new JMenuItem("VER");
        JMenuItem itemLoad = new JMenuItem("CARGAR");

        itemAdd.addActionListener(e -> new FormularioLibros(this, libros));
        itemView.addActionListener(e -> new TablaLibros(this, libros));
        itemLoad.addActionListener(e -> {
            cargarLibros();
            JOptionPane.showMessageDialog(this, "Libros cargados con éxito", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        });

        opciones.add(itemAdd);
        opciones.add(itemView);
        opciones.add(itemLoad);

        menuBar.add(opciones);
        setJMenuBar(menuBar);

        //Estilos
        menuBar.setBackground(Color.BLACK);
        opciones.setFont(new Font("Arial", Font.BOLD, 18));
        opciones.setForeground(Color.WHITE);
        itemAdd.setFont(new Font("Arial", Font.PLAIN, 16));
        itemView.setFont(new Font("Arial", Font.PLAIN, 16));
        itemLoad.setFont(new Font("Arial", Font.PLAIN, 16));
        itemAdd.setBackground(Color.DARK_GRAY);
        itemView.setBackground(Color.DARK_GRAY);
        itemLoad.setBackground(Color.DARK_GRAY);
        itemAdd.setForeground(Color.WHITE);
        itemLoad.setForeground(Color.WHITE);
        itemView.setForeground(Color.WHITE);

        setVisible(true);
    }

    public void cargarLibros(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(this.path));
            String linea;
            while((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                Libro l = new Libro(datos[0], datos[1], Integer.parseInt(datos[2]));
                this.libros.add(l);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
