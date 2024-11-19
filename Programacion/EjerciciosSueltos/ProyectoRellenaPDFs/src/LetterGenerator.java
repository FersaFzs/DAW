import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class LetterGenerator extends JFrame {

    private JTextField templatePathField;
    private JTextField dataFilePathField;
    private PDFGenerator pdfGenerator;

    public LetterGenerator() {
        pdfGenerator = new PDFGenerator();
        createUI();
    }

    private void createUI() {
        setTitle("Generador de Cartas");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel templateLabel = new JLabel("Ruta de plantilla PDF:");
        templatePathField = new JTextField();
        JButton browseTemplateButton = new JButton("Buscar");
        browseTemplateButton.addActionListener(e -> selectFile(templatePathField));

        JLabel dataLabel = new JLabel("Ruta de archivo CSV:");
        dataFilePathField = new JTextField();
        JButton browseDataButton = new JButton("Buscar");
        browseDataButton.addActionListener(e -> selectFile(dataFilePathField));

        JButton generateButton = new JButton("Generar Cartas");
        generateButton.addActionListener(new GenerateAction());

        add(templateLabel);
        add(templatePathField);
        add(browseTemplateButton);
        add(dataLabel);
        add(dataFilePathField);
        add(browseDataButton);
        add(generateButton);
    }

    private void selectFile(JTextField textField) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            textField.setText(selectedFile.getAbsolutePath());
        }
    }

    private class GenerateAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String templatePath = templatePathField.getText();
            String dataFilePath = dataFilePathField.getText();

            try {
                String template = new String(Files.readAllBytes(Paths.get(templatePath)));
                try (BufferedReader br = new BufferedReader(new FileReader(dataFilePath))) {
                    String line;
                    int count = 0;

                    while ((line = br.readLine()) != null) {
                        String[] data = line.split(","); // Suponiendo que los datos están separados por comas
                        String generatedText = generateLetter(template, data);
                        pdfGenerator.createPDF(generatedText, count);
                        count++;
                    }

                    JOptionPane.showMessageDialog(null, "Cartas generadas exitosamente.");
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al generar las cartas: " + ex.getMessage());
            }
        }
    }

    private String generateLetter(String template, String[] data) {
        // Mapeo de los datos
        Map<String, String> placeholders = new HashMap<>();
        placeholders.put("NOMBRE", data[0]); // Reemplazar con el nombre
        placeholders.put("DIRECCION", data[1]); // Reemplazar con la dirección

        for (Map.Entry<String, String> entry : placeholders.entrySet()) {
            template = template.replace("{" + entry.getKey() + "}", entry.getValue());
        }

        return template;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LetterGenerator gui = new LetterGenerator();
            gui.setVisible(true);
        });
    }
}