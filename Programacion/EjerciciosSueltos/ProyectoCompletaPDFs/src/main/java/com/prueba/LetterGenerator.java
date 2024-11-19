package com.prueba;

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
import java.io.File;

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
                        line = line.trim(); // Eliminar espacios en blanco
                        if (!line.isEmpty()) { // Proceder solo si la línea no está vacía
                            String[] data = line.split(",", -1); // Separar por coma, permitiendo elementos vacíos

                            // Verificar que hay exactamente 2 elementos
                            if (data.length == 2) {
                                String generatedText = generateLetter(template, data);
                                pdfGenerator.createPDF(generatedText, count);
                                count++;
                            } else {
                                System.err.println("Línea ignorada desde el CSV (debe tener exactamente 2 columnas): " + line);
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Cartas generadas exitosamente.");
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al generar las cartas: " + ex.getMessage());
            }
        }
    }

    private String generateLetter(String template, String[] data) {
        // Asegúrate de limpiar todos los caracteres de control en nombre y dirección
        String name = data[0].replaceAll("[\\r\\n]", "").trim(); // Eliminar CR y LF
        String address = data[1].replaceAll("[\\r\\n]", "").trim(); // Eliminar CR y LF

        // Alternativamente, eliminar todos los caracteres no válidos en el texto
        name = name.replaceAll("[^\\x20-\\x7E]", " ");  // Eliminar caracteres no imprimibles
        address = address.replaceAll("[^\\x20-\\x7E]", " ");

        // Mapeo de los datos
        Map<String, String> placeholders = new HashMap<>();
        placeholders.put("NOMBRE", name);
        placeholders.put("DIRECCION", address);

        for (Map.Entry<String, String> entry : placeholders.entrySet()) {
            template = template.replace("{" + entry.getKey() + "}", entry.getValue());
        }

        System.out.println("Texto generado:\n" + template); // Imprimir para depuración

        return template;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LetterGenerator gui = new LetterGenerator();
            gui.setVisible(true);
        });
    }
}