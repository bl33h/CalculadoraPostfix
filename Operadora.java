/* --- CALCULADORA POSTFIX --- ECH */

 /*
 * FileName: Operadora
 * @author Sara Echeverria
 * ID: 21371
 * Date: 18/02/2022
 */

 // Copia de la clases Stack del repositorio https://github.com/malonso-uvg/ADT_Stack/tree/main/src/com/uvg/main

import java.util.ArrayList; // Se importa ArrayList
public class Operadora implements Stack { // Clase que implementa una interfaz
    
    private ArrayList<T> coreList;
	
	public Stack() {
		coreList = new ArrayList<T>();
	}
	
	/** 
	 * Ingresa un valor a la pila
	 * @param value
	 */
	@Override
	public void push(T value) {		
		coreList.add(0, value);
	}

	/** 
	 * Saca el ultimo elemento de la pila
	 * @return T
	 */
	@Override
	public T pull() {
		return coreList.remove(0);
	}

	/** 
	 * Saca el primer elemento de la pila
	 * @return T
	 */
	@Override
	public T peek() {
		return coreList.get(0);
	}

	/** 
	 * Hace un count de los elementos de la pila
	 * @return int
	 */
	@Override
	public int count() {
		return coreList.size();
	}

	/** 
	 * Evalua si hay elementos en la pila
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {		
		return coreList.isEmpty();
	}
}
