/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htlgrieskirchen.pos.dreia.eongun18;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author eongu
 */
public class Einlesen {
    
     public void dateiLaden(String datName) {

        File file = new File("weapons.csv");

        if (!file.canRead() || !file.isFile()) {
            System.exit(0);
        }

        FileReader fr = null;
        int c;
        StringBuffer buff = new StringBuffer();
        try {
            fr = new FileReader(file);
            while ((c = fr.read()) != -1) {
                buff.append((char) c);
            }
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(buff.toString());
    }
    
}
