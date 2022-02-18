/**
 * FileName: PostfixCalc
 * Author: Sara Echeverria
 * ID: 21371
 * Date: 18/02/2022
 * @author Sara Echeverria
 */

public interface IPosfixCalc {

	/***
	 * This method is used to evaluate a postfix expression
	 * @param expresion this is a single expression like: 1 2 + 4 * 3 +
	 * @return the evaluation of the expression
	 */
	int Evaluate(String expresion);
}
