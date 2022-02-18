/**
 * FileName: Stack
 * Author: Sara Echeverria
 * ID: 21371
 * Date: 18/02/2022
 * @author Sara Echeverria
 */

public interface Stack<T> {

	void push(T value);

	T pull();

	T peek();

	int count();

	boolean isEmpty();
}
