package testitext;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.FontSelector;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestItext {
    
    public static void main(String[] args) {
        String fileName = "first.pdf";
        TestItext generateInvoice = new TestItext();
        generateInvoice.createPdf(fileName);
        
    }
    
    private void createPdf(String fileName) {
        try {
            OutputStream file = new FileOutputStream(new File(fileName));
            Document d = new Document();
            PdfWriter.getInstance(d, file);
            //Invoice No. , Date table at right corner.
            PdfPTable irdTable = new PdfPTable(2);
            irdTable.addCell(getIrdCell("Invoice No."));
            irdTable.addCell(getIrdCell("Date"));
            irdTable.addCell(getIrdCell("X5435"));
            irdTable.addCell(getIrdCell("01-10-23"));
            PdfPTable irhTable = new PdfPTable(3);
            irhTable.addCell(getIrhCell("", PdfPCell.ALIGN_RIGHT));
            irhTable.addCell(getIrhCell("", PdfPCell.ALIGN_RIGHT));
            irhTable.addCell(getIrhCell("Invoice", PdfPCell.ALIGN_RIGHT));
            irhTable.addCell(getIrhCell("", PdfPCell.ALIGN_RIGHT));
            irhTable.addCell(getIrhCell("", PdfPCell.ALIGN_RIGHT));
            PdfPCell invoiceTable = new PdfPCell(irdTable);
            
            irhTable.addCell(invoiceTable);
            //Customer info 
            FontSelector fontSelector = new FontSelector();
            Font billToFont = FontFactory.getFont(FontFactory.TIMES_ROMAN, 13, Font.BOLD);
            fontSelector.addFont(billToFont);
            Phrase bill = fontSelector.process("Bill To"); //customer info
            Paragraph name = new Paragraph("Md. Ahmed");
            name.setIndentationLeft(20);
            Paragraph contact = new Paragraph("012536");
            contact.setIndentationLeft(20);
            Paragraph address = new Paragraph("Kakrail");
            address.setIndentationLeft(20);
            //bill details
            PdfPTable billTable = new PdfPTable(6);
            billTable.setWidthPercentage(100);
            billTable.setWidths(new float[]{1, 2, 5, 2, 1, 2});
            billTable.setSpacingBefore(30.0f);
            billTable.addCell(getbillHeaderCell("Index"));
            billTable.addCell(getbillHeaderCell("Item"));
            billTable.addCell(getbillHeaderCell("Description"));
            billTable.addCell(getbillHeaderCell("Unit Price"));
            billTable.addCell(getbillHeaderCell("Qty"));
            billTable.addCell(getbillHeaderCell("Amount"));
            
            billTable.addCell(getbillRowCell("1"));
            billTable.addCell(getbillRowCell("Mobile"));
            billTable.addCell(getbillRowCell("Samsang 25re"));
            billTable.addCell(getbillRowCell("10000"));
            billTable.addCell(getbillRowCell("1"));
            billTable.addCell(getbillRowCell("10000"));
            
            billTable.addCell(getbillRowCell("2"));
            billTable.addCell(getbillRowCell("Mobile"));
            billTable.addCell(getbillRowCell("Samsang 25re"));
            billTable.addCell(getbillRowCell("10000"));
            billTable.addCell(getbillRowCell("1"));
            billTable.addCell(getbillRowCell("10000"));

            //validity
            PdfPTable validity = new PdfPTable(1);
            validity.setWidthPercentage(100);
            validity.addCell(getvalidityRowCell(""));
            validity.addCell(getvalidityRowCell("Warranty"));
            validity.addCell(getvalidityRowCell("* Products purchased comes with 1 year national warranty \\n   (if applicable)\""));
            validity.addCell(getvalidityRowCell("* Warranty should be claimed only from the respective manufactures\""));
            
            PdfPCell summeryl = new PdfPCell(validity);
            summeryl.setColspan(3);
            summeryl.setPadding(1.0f);
            billTable.addCell(getbillRowCell(" "));
            billTable.addCell(getbillRowCell(" "));
            billTable.addCell(getbillRowCell(" "));
            billTable.addCell(getbillRowCell(" "));
            billTable.addCell(getbillRowCell(" "));
            billTable.addCell(summeryl);
            
            d.open();
            d.add(irhTable);
            d.add(bill);
            d.add(name);
            d.add(contact);
            d.add(address);
            d.add(billTable);
            
            d.close();
            file.close();
            System.out.println("File generated");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestItext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(TestItext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestItext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static PdfPCell getIrdCell(String text) {
        PdfPCell pCell = new PdfPCell(new Paragraph(text));
        pCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        pCell.setPadding(5.0f);
        pCell.setBorderColor(BaseColor.LIGHT_GRAY);
        return pCell;
    }
    
    public static PdfPCell getIrhCell(String text, int alignment) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.HELVETICA, 16);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setHorizontalAlignment(alignment);
        cell.setPadding(5);
        cell.setBorder(PdfPCell.NO_BORDER);
        return cell;
        
    }

    public static PdfPCell getbillHeaderCell(String text) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.HELVETICA, 11);
        font.setColor(BaseColor.GRAY);
        fs.addFont(font);
        Phrase p = fs.process(text);
        PdfPCell cell = new PdfPCell(p);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setPadding(5.0f);
        return cell;
        
    }

    public static PdfPCell getbillRowCell(String text) {
        PdfPCell pCell = new PdfPCell(new Paragraph(text));
        pCell.setHorizontalAlignment(Element.ALIGN_CENTER);
        pCell.setPadding(5.0f);
        pCell.setBorderWidthBottom(0);
        pCell.setBorderWidthTop(0);
        return pCell;
        
    }
    
    public static PdfPCell getvalidityRowCell(String text){
        FontSelector fontSelector = new FontSelector();
        Font f =FontFactory.getFont(FontFactory.HELVETICA, 10);
        f.setColor(BaseColor.GRAY);
        fontSelector.addFont(f);
        Phrase phrase =fontSelector.process(text);
        PdfPCell pCell = new PdfPCell(phrase);
        pCell.setBorder(0);
        return pCell;
        
        
    
    }
    
}
