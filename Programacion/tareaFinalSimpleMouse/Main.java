import javax.swing.*;

public class Main extends JFrame {
    private final CocheManager manager = new CocheManager();

    public Main() {
        setTitle("Gestión de Coches");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opciones");

        JMenuItem itemNuevo = new JMenuItem("Añadir Coche");
        JMenuItem itemVer = new JMenuItem("Mostrar Coches");
        JMenuItem itemSalir = new JMenuItem("Salir");

        itemNuevo.addActionListener(e -> manager.abrirFormulario(this));
        itemVer.addActionListener(e -> manager.mostrarTabla(this));
        itemSalir.addActionListener(e -> System.exit(0));

        menu.add(itemNuevo);
        menu.add(itemVer);
        menu.addSeparator();
        menu.add(itemSalir);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        JLabel label = new JLabel("Usa el menú para gestionar coches", JLabel.CENTER);
        add(label);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
