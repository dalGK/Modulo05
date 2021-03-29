/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Dalvi
 */
public class Modulo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\prueba");
        File fich = new File(dir, "datos.dat");
        //System.out.println("Dir es: "+dir);
        if (!dir.exists()) {
            dir.mkdir();
            System.out.println("Creado");
        } else if(dir.exists())
        {
          
            String resultado = dir +"Copia";
            
            dir.mkdir();
            System.out.println("Ya estaba creado");
        }

    }
}
