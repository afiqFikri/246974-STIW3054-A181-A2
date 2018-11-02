import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class writetoPDF {
    
    public static void convert() {

        readTable test= new readTable();//call class
        List<String>infom = test.All();

        try {

            Document document = new Document(PageSize.A4);
            PdfWriter.getInstance(document, new FileOutputStream("E:\\UUM\\RealTime\\chessResultsList.pdf"));
            document.open();

            for(int i = 0; i < 4; i++){
                document.add(new Paragraph(""+infom.get(i)));
            }

            PdfPTable table = new PdfPTable(new float[]{4f, 18f, 3f, 4f, 3f, 10f});

            for (int j=0;j<readTable.studentdata.size();j++){

                table.addCell(readTable.studentdata.get(j).getNo());
                table.addCell(readTable.studentdata.get(j).getName());
                table.addCell(readTable.studentdata.get(j).getFieldid());
                table.addCell(readTable.studentdata.get(j).getFed());
                table.addCell(readTable.studentdata.get(j).getRtg());
                table.addCell(readTable.studentdata.get(j).getClub());

            }
            document.add(table);
            document.close();

        } catch (DocumentException e)
        {
            e.printStackTrace();

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
