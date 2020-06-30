package pert6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * DEWANET
 */
public class write2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BasicConfigurator.configure();
        String kalimat = "Nama saya Whatziitooya."
                + "Coba Tanya Lagi. "
                + "Tidak Tahu. "
                + "Login Lagi. "
                + "Coba Lagi. ";
        
        String savepath = "D://hasiltes1.docx";
        XWPFDocument file_docx = new XWPFDocument();
        FileOutputStream tampil; 
        tampil = new FileOutputStream(new File(savepath));
        XWPFParagraph teks_prgrf = file_docx.createParagraph();
        XWPFRun starting = teks_prgrf.createRun();
        starting.setText(kalimat);
        file_docx.write(tampil);
        tampil.close();
        
        System.out.println("Sudah selesai");
    }
}
