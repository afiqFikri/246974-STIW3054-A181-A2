import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class readTable {
    public static ArrayList<data> studentdata = new ArrayList<data>();
    public static ArrayList<String> info = new ArrayList<String>();

    public static List<String> All() {


        try {
            FileInputStream file = new FileInputStream(new File("E:\\UUM\\RealTime\\chessResultsList.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);  // Create an excel workbook
            XSSFSheet sheet = workbook.getSheetAt(0);   // Retrieve the first sheet of the workbook.

            for(int i = 0 ; i <1; i++){
                XSSFRow line1,line2,line3,line4;
                String a,b,c,d;

                line1 = sheet.getRow(0);
                line2 = sheet.getRow(1);
                line3 = sheet.getRow(2);
                line4 = sheet.getRow(3);

                a = line1.getCell(0).getStringCellValue();
                b = line2.getCell(0).getStringCellValue();
                c = line3.getCell(0).getStringCellValue();
                d = line4.getCell(0).getStringCellValue();

                info.add(new String(a));
                info.add(new String(b));
                info.add(new String(c));
                info.add(new String(d));

                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
            }

            for(int i=4; i<155; i++){
                XSSFRow row = sheet.getRow(i);

                Cell colm1 = row.getCell(0);
                Cell colm2 = row.getCell(2);
                Cell colm3 = row.getCell(3);
                Cell colm4 = row.getCell(4);
                Cell colm5 = row.getCell(5);
                Cell colm6 = row.getCell(6);

                String num = String.valueOf(colm1);
                String nam = String.valueOf(colm2);
                String fidid = String.valueOf(colm3);
                String fed = String.valueOf(colm4);
                String rtg = String.valueOf(colm5);
                String club = String.valueOf(colm6);

                studentdata.add(new data(num,nam,fidid,fed,rtg,club));

                System.out.printf("%4s%40s%5s%5s%10s%25s",num,nam,fidid,fed,rtg,club);
                System.out.println();

            }


        } catch (Exception e) {

        }
        return info;
    }
}