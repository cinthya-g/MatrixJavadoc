
package m.operators;
import m.matrices.Matrix;
import m.exceptions.*;

 /**
  * Clase abstracta UnaryOperator, de la cual dependen todas aquellas
  * operaciones aplicables a una sola matriz
  * @author Cinthya G, Iker J, Valeria R
  *
  */

public abstract class UnaryOperator extends Matrix {
	public UnaryOperator() {
		super();
	}
	
	/**
	 * Este m�todo es invocado para crear un objeto cuando se desea ejecutar un c�lculo 
	 * a una matriz (transoformaciones lineales)
     (MatrixAdjoint, MatrixInverse, MatrixTranspose)
	 * @param m (Matrix)
	 * @return Una matriz resultante
	 * @throws NegativeNumberFoundException (La creaci�n de una nueva matriz fue con un n�mero negativo)
	 */

	public abstract Matrix calc(Matrix m) throws NegativeNumberFoundException;

}
