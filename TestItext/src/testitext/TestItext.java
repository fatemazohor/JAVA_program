package testitext;

import InvoiceGenerate.InvoiceCreate;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.FontSelector;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPRow;
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
//        TestItext generateInvoice = new TestItext();
//        generateInvoice.createPdf(fileName);
        InvoiceCreate invoiceCreate = new InvoiceCreate();
        try {
            OutputStream os = new FileOutputStream(new File("Testfile.pdf"));
            Document doc = new Document(PageSize.A4, 20, 20, 30, 30);
            PdfWriter.getInstance(doc, os);
            PdfPTable irdTable = new PdfPTable(2);
            irdTable.addCell(invoiceCreate.getIrdCell("Invoice"));
            irdTable.addCell(invoiceCreate.getIrdCell("Date"));
            irdTable.addCell(invoiceCreate.getIrdCell("gfrt5451"));
            irdTable.addCell(invoiceCreate.getIrdCell("14-15-23"));
            doc.open();
            doc.add(irdTable);
            doc.close();
            System.out.println("test file create");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestItext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(TestItext.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

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
//            irhTable.setSpacingBefore(20.0f);
//            irhTable.setSpacingAfter(10.0f);
            irhTable.addCell(getIrhCell("", PdfPCell.ALIGN_RIGHT));
            irhTable.addCell(getIrhCell("", PdfPCell.ALIGN_RIGHT));
            irhTable.addCell(getIrhCell("Invoice", PdfPCell.ALIGN_RIGHT));
            irhTable.addCell(getIrhCell("", PdfPCell.ALIGN_RIGHT));
            irhTable.addCell(getIrhCell("", PdfPCell.ALIGN_RIGHT));
            PdfPCell invoiceTable = new PdfPCell(irdTable);

            irhTable.addCell(invoiceTable);
            //image
            Image imge = Image.getInstance("image/text.JPG");
            imge.scaleAbsolute(540f, 72f);
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
           
            billTable.addCell(summeryl);

            //account total, tax ,discount
            PdfPTable account = new PdfPTable(2);
            account.setWidthPercentage(100);
            account.addCell(getAccountCell("SubTotal"));
            account.addCell(getAccountCellDigit("SubTotal"));
            account.addCell(getAccountCell("Tax"));
            account.addCell(getAccountCellDigit("SubTotal"));
            account.addCell(getAccountCell("Discount"));
            account.addCell(getAccountCellDigit("SubTotal"));
            account.addCell(getAccountCell("Total"));
            account.addCell(getAccountCellDigit("SubTotal"));
            PdfPCell summeryAcc = new PdfPCell(account);
            summeryAcc.setColspan(3);
            summeryAcc.setPadding(1.0f);
            billTable.addCell(summeryAcc);

            //description
            PdfPTable description = new PdfPTable(1);
            description.setWidthPercentage(100);
            description.addCell(getDescripCell(" "));
            description.addCell(getDescripCell("Goods once sold will not be taken back or exchanged || Subject to product justification || Product damage no one responsible || "
                    + " Service only at concarned authorized service centers"));

            //Shop address.
            PdfPTable shopname = new PdfPTable(1);
            shopname.addCell(getshopNamecell("SM Gift Shop", PdfPCell.ALIGN_CENTER));
            shopname.addCell(getshopaddcell("Address: Shop No.85,New Market,Dhaka-1205"));
            shopname.addCell(getshopaddcell("Cell No: 0125325788, Email: galaxygiftshop@gmail.com"));
           
             // shop logo 
            Image logo = Image.getInstance("image/white.png");
            logo.scaleAbsolute(130.0f, 130.0f);
            PdfPCell imgCell = new PdfPCell(logo);
            imgCell.setBorder(0);
            
            //logo, shop name , address
            PdfPTable logoTable = new PdfPTable(2);
            logoTable.setWidthPercentage(100);
            logoTable.setWidths(new float[]{25f, 80f});
   
            logoTable.addCell(imgCell);
            PdfPCell shopCell = new PdfPCell(shopname);
            shopCell.setPadding(10.0f);
            shopCell.setBorder(0);
            logoTable.addCell(shopCell);

            //pdf doc open.
            d.open();
            d.add(logoTable);
//            d.add(imge);
            d.add(irhTable);
            d.add(bill);
            d.add(name);
            d.add(contact);
            d.add(address);
            d.add(billTable);
            d.add(description);

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

    public static PdfPCell getshopNamecell(String text, int alignment) {
        FontSelector sf = new FontSelector();
        Font shopfont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 24);
        sf.addFont(shopfont);
        Phrase shopphrase = sf.process(text);
        PdfPCell cell = new PdfPCell(shopphrase);
        cell.setHorizontalAlignment(alignment);
        cell.setBorder(PdfPCell.NO_BORDER);
        cell.setPadding(5.0f);
        return cell;

    }
    public static PdfPCell getshopaddcell(String text){
        PdfPCell pCell = new PdfPCell(new Paragraph(text));
        pCell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
        pCell.setBorder(PdfPCell.NO_BORDER);
        pCell.setPadding(5.0f);
        return pCell;
    
    
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

    public static PdfPCell getvalidityRowCell(String text) {
        FontSelector fontSelector = new FontSelector();
        Font f = FontFactory.getFont(FontFactory.HELVETICA, 10);
        f.setColor(BaseColor.GRAY);
        fontSelector.addFont(f);
        Phrase phrase = fontSelector.process(text);
        PdfPCell pCell = new PdfPCell(phrase);
        pCell.setBorder(0);
        return pCell;

    }

    public static PdfPCell getAccountCell(String text) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.HELVETICA, 10);
        fs.addFont(font);
        Phrase phrase = fs.process(text);
        PdfPCell pCell = new PdfPCell(phrase);
        pCell.setBorderWidthLeft(0);
        pCell.setBorderWidthTop(0);
        pCell.setPadding(5.0f);
        return pCell;

    }

    public static PdfPCell getAccountCellDigit(String text) {
        FontSelector selector = new FontSelector();
        Font f = FontFactory.getFont(FontFactory.HELVETICA, 10);
        selector.addFont(f);
        Phrase phrase = selector.process(text);
        PdfPCell cell = new PdfPCell(phrase);
        cell.setBorderWidthRight(0);
        cell.setBorderWidthTop(0);
        cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell.setPadding(5.0f);
        cell.setPaddingRight(20.0f);
        return cell;
    }

    public static PdfPCell getDescripCell(String text) {
        FontSelector fs = new FontSelector();
        Font font = FontFactory.getFont(FontFactory.HELVETICA, 10);
        font.setColor(BaseColor.GRAY);
        fs.addFont(font);
        Phrase p = fs.process(text);
        PdfPCell cell = new PdfPCell(p);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setBorder(0);

        return cell;

    }

}
