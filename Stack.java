/* --- CALCULADORA POSTFIX --- ECH */

 /*
 * FileName: Stack (interface)
 * Author: Sara Echeverria
 * ID: 21371
 * Date: 18/02/2022
 * @author Sara Echeverria
 */

  // Copia de la interfaz IStack del repositorio https://github.com/malonso-uvg/ADT_Stack/tree/main/src/com/uvg/main

public interface Stack<T> {

	void push(T value);

	T pull();

	T peek();

	int count();

	boolean isEmpty();
}
