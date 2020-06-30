package pert7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * DEWANET
 */
public class read2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream openpath = new FileInputStream (new File("D:\\hasiltes1.xls"));
        HSSFWorkbook thistabel;
        thistabel = new HSSFWorkbook(openpath);
        HSSFSheet thistabel_sheet = thistabel.getSheetAt(0);
        FormulaEvaluator rumusEv = thistabel.getCreationHelper().createFormulaEvaluator();
        for (Row row: thistabel_sheet) {
            for (Cell cell: row) {
                switch (rumusEv.evaluateInCell(cell).getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t\t");
                        break;
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "\t\t");
                        break;
                }
            }
            System.out.println("");
            
        }
    }
            
}
