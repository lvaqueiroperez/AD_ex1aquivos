 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class Arquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //1
        File fArquivosdir = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");

        if (fArquivosdir.exists() == false) {

            fArquivosdir.mkdir();
        } else {
            System.out.println("Directorio arquivosdir existente");
        }

        //2
        File fProducts1 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1");

        if (fProducts1.exists() == false) {

            try {
                fProducts1.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            System.out.println("Archivo Products1 existente");

        }

        //3
        File comprobar1 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");

        System.out.println("Ruta:" + comprobar1.getAbsolutePath());

        //comprobamos si existe mediante el objeto anterior
        if (fProducts1.exists() == false) {

            System.out.println("Archivo NO existente");

        } else {

            System.out.println("Archivo Products1 existente");

        }

        //Podemos utilizar el método "list()" para recorrer un Array que muestre
        //todo el contenido del directorio especificado
        String[]contenido1 = comprobar1.list();
        
        if(contenido1==null){
            
            System.out.println("No hay contenido en este directorio");
            
        }else{
            
            for(int i=0;i<contenido1.length;i++){
                
                System.out.println(contenido1[i]);
                
            }
            
            
        }
        
        
        //4
        File subdir = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir");

        if (subdir.exists() == false) {

            subdir.mkdir();

        } else {

            System.out.println("Directorio  subdir ya existente");

        }

        File fProducts2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir/Products2");

        if (fProducts2.exists() == false) {

            try {
                fProducts2.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

            System.out.println("Archivo Products2 ya existe");

        }

        //5
        //crear 2 objetos con 2 rutas?
        File amosar = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/");

        System.out.println();

        //6
        File amosar2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");

        System.out.println(amosar2.getAbsolutePath());

        //7
        //ya está creado el objeto de ese archivo:
        System.out.println("Nome:" + fProducts1.getName());
        System.out.println("Nome:" + fProducts1.getAbsolutePath());

        if (fProducts1.canWrite() == true) {

            System.out.println("Es posible escribir en él");

        } else {

            System.out.println("No es posible escribir en él");

        }

        if (fProducts1.canRead() == true) {

            System.out.println("Es posible leer en él");

        } else {

            System.out.println("No es posible leer en él");

        }

        System.out.println("Longitud en bytes:" + fProducts1.length());

        //8
        fProducts1.setReadOnly();

        //9
        fProducts1.setWritable(true);

        //10
//        fProducts1.delete();

        //existe "deleteOnExit()" para que, una vez salgamos del IDE o VM, se borren
        //11
    }

}
