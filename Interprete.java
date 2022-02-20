/* --- CALCULADORA POSTFIX --- ECH */

 /*
 * FileName: Interprete
 * @author Sara Echeverria
 * ID: 21371
 * Date: 18/02/2022
 */

public class Interprete implements PostfixCalc { // Clase que implementa una interfaz

	// --- ATRIBUTOS ---
	public int result = 0; // Resultado de la operacion
	public boolean numeric = false; // Evalua si el valor es numerico
	public String txt  = ""; // Texto
	private String[] data; // Data para hacerle split
	private Operadora<String> stack = new Operadora<String>(); // Pila
	private int nA; // Operando 1
	private int nB; // Operando 2


	/**
     * @param expresion
     * @return int
     */
	public int Evaluate(String expresion) { // Metodo de la interfaz PostfixCalc para evaluar la expresion, retorna un int
		System.out.println("La expresion es = " + expresion); // Imprime la expresion
        data = expresion.split(" "); // Split

		// --- CICLO FOR ---
		for (int i = 0; i < data.length; i++){

			// |VERIFICADOR DE VALORES NUMERICOS|
			try {
                Integer.parseInt(txt);
                numeric = true;
            } catch (NumberFormatException Exception) {
                numeric = false;
            }

			// |OPERANDOS|
			if (data[i].matches("\\d")){ 
                stack.push(data[i]);
            }

			// |OPERADORES|
			else if (data[i].matches("+-*/")) 
            {	
				// CICLO IF
                if (stack.count() >= 2){
                    nA = Integer.parseInt(stack.pull());
                    nB = Integer.parseInt(stack.pull());

					// |OPERACIONES|
					// +SUMA+
					if (data[i].equals("+")){ 
                        result = nA + nB;
                        stack.push(String.valueOf(result));
                    }
					// -RESTA-
					if (data[i].equals("-")){ 
                        result = nA - nB;
                        stack.push(String.valueOf(result));
					}
					// *MULTIPLICACION*
					if (data[i].equals("*")){ 
                        result = nA * nB;
                        stack.push(String.valueOf(result));
					}
					// /DIVISION/
					// Caso trivial (division entre 0)
					if (nB == 0){
						System.out.println("ERROR, LA DIVISION ENTRE 0 DA INDEFINIDO COMO RESULTADO.");
						break;
					}
					else{
						result = nA / nB;
						stack.push(String.valueOf(result));
					}

				} // Llave del if 2

			} // Llave del if 1

			// CONTROLADOR DE ERRORES
			// |CANTIDAD OPERANDOS|
			else{
				System.out.println("ERROR, NUMERO DE OPERANDOS INSUFICIENTE.");
				for (int j = 0; j < stack.count(); j++){
					stack.pull();
				}
				break;
			}

		} // Llave que cierra el ciclo for
		
		return result;

	} // Llave que cierra el metodo

} // Llave que cierra clase

    