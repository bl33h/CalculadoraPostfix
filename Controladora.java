/* --- CALCULADORA POSTFIX --- ECH */

 /*
 * FileName: Controladora
 * Author: Sara Echeverria
 * ID: 21371
 * Date: 18/02/2022
 * @author Sara Echeverria
 */
import java.io.File;  
import java.util.Scanner;
import java.io.FileNotFoundException; 
import java.util.ArrayList;

 public class Controladora { // Main class
    /**
     * Lector archivo .TXT
     * @return null
     */
    private static ArrayList<String> readFile(){ // Metodo para leer el archivo .txt

        // --- READER ---
        try {
            File datos = new File("datos.txt");
            ArrayList<String> file = new ArrayList<String>();
            Scanner reader = new Scanner(datos); 
            while (reader.hasNextLine()){
                file.add(reader.nextLine());
            }
            reader.close();
            return file;
        } 

        // --- ERROR ---
        catch (FileNotFoundException e) {
            System.out.println("ERROR, NO ES POSIBLE LEER EL ARCHIVO.");
            return null;
        }
    }

    /** 
     * Ejecucion del programa
     * @param args
     */
    public static void main(String[] args) {
        Interprete calculator = new Interprete();
        System.out.println("\n | - - - CALCULADORA POSTFIX 2022 ECH - - -|");

        // CICLO FOR
        for (int i = 0; i < readFile().size(); i++){
            int result = calculator.Evaluate(readFile().get(i));

            // CICLO IF
            if (result != 000){
                System.out.println("\nEl resultado de la expresion es: " + result);
            } // Llave del if

        }  // Llave del for
        System.out.println("\n Esperamos que el programa le haya sido de utilidad, volver a compilar si se desea utilizar otra vez.");

    } // Llave del void

} // Llave de la clase