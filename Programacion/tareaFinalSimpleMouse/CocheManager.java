import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class CocheManager {
    private final ArrayList<Coche> listaCoches = new ArrayList<>();
    private DefaultTableModel modeloTabla;

    public void abrirFormulario(JFrame parent) {
        JFrame frameFormulario = new JFrame("Añadir Coche");
        frameFormulario.setSize(300, 200);
        frameFormulario.setLocationRelativeTo(parent);
        frameFormulario.setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        JTextField txtMarca = new JTextField();
        JTextField txtAnio = new JTextField();
        JTextField txtColor = new JTextField();

        panel.add(new JLabel("Marca:"));
        panel.add(txtMarca);
        panel.add(new JLabel("Año:"));
        panel.add(txtAnio);
        panel.add(new JLabel("Color:"));
        panel.add(txtColor);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> {
            String marca = txtMarca.getText().trim();
            String anioTexto = txtAnio.getText().trim();
            String color = txtColor.getText().trim();

            if (marca.isEmpty() || anioTexto.isEmpty() || color.isEmpty()) {
                JOptionPane.showMessageDialog(frameFormulario, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                int anio = Integer.parseInt(anioTexto);
                listaCoches.add(new Coche(marca, anio, color));
                JOptionPane.showMessageDialog(frameFormulario, "Coche añadido con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                frameFormulario.dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frameFormulario, "El año debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frameFormulario.add(panel, BorderLayout.CENTER);
        frameFormulario.add(btnGuardar, BorderLayout.SOUTH);
        frameFormulario.setVisible(true);
    }

    public void mostrarTabla(JFrame parent) {
        JFrame frameTabla = new JFrame("Lista de Coches");
        frameTabla.setSize(500, 300);
        frameTabla.setLocationRelativeTo(parent);

        String[] columnas = {"Marca", "Año", "Color", "Acción"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        JTable tabla = new JTable(modeloTabla);

        for (Coche c : listaCoches) {
            modeloTabla.addRow(new Object[]{c.getMarca(), c.getAnio(), c.getColor(), "Eliminar"});
        }

        tabla.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int fila = tabla.rowAtPoint(e.getPoint());
                int columna = tabla.columnAtPoint(e.getPoint());
                if (columna == 3 && fila != -1) {
                    int confirm = JOptionPane.showConfirmDialog(null, "¿Eliminar este coche?", "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        modeloTabla.removeRow(fila);
                        listaCoches.remove(fila);
                    }
                }
            }
        });

        frameTabla.add(new JScrollPane(tabla));
        frameTabla.setVisible(true);
    }
}
