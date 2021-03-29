/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo05;

import java.io.File;

/**
 *
 * @author Dalvi
 */
public class Ejemplo {
    public static void main(String[] args) {
       
      //  File f = new File("C:\\micarpeta\\personas.txt");
        
        String pathtrabajo="C:\\sesion1";
        File directorio = new File (pathtrabajo);
        if(directorio.exists()){
            System.out.println("Esta Vaina existe");
        }else {
            System.out.println("Pues va a ser que no existe");
        }
        
    }
}
