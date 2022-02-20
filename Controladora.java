/* --- CALCULADORA POSTFIX --- ECH */

 /*
 * FileName: Controladora
 * Author: Sara Echeverria
 * ID: 21371
 * Date: 18/02/2022
 * @author Sara Echeverria
 */

import java.io.BufferedReader;
import java.io.FileReader;

 public class Controladora {
 
/**
* Este metodo se encarga de leer el archivo de texto.
* @return void
*/
 public static void main(String[] args) {
     FileReader File;
     BufferedReader Reader;
     
     try {
         File = new FileReader("\\datos.txt");

         if(File.ready()){
         Reader = new BufferedReader(File);
         String Contenido;
         while  ((Contenido = Reader.readLine()) != null);{
             System.out.println(Contenido);
        }
        } else {
            System.out.println("Error, archivo no listo para leerse.");
        }
     } catch (Exception e) {
         System.out.println("Error " + e.getMessage());
     }
 }
}