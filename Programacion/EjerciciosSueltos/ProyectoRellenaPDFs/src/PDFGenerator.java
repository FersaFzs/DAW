import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class PDFGenerator {
    public void createPDF(String content, int count) {
        try {
            PDDocument document = new PDDocument();
            PDPage page = new PDPage();
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.setFont(PDType1Font.HELVETICA, 12);
            contentStream.beginText();
            contentStream.newLineAtOffset(100, 700); // Ajusta la posición según sea necesario
            contentStream.showText(content);
            contentStream.endText();
            contentStream.close();

            document.save("Carta_" + count + ".pdf"); // Guardar el documento como nuevo PDF
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
