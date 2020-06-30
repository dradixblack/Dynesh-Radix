
package pert4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author DEWANET
 */
public class TXTreader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String lokasi_file = "D://input.txt"; 
        String line = null; 
        
        FileReader baca = 
                new FileReader(lokasi_file); 
        
        BufferedReader ambil =
                new BufferedReader(baca); 
        
        int jumlahbaris = 0;
        
        
        while ((line=ambil.readLine()) != null) {
            System.out.println(line);
            System.out.println(jumlahbaris);
        }
        
        ambil.close();
        
    }
}
