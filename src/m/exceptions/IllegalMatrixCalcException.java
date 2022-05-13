package m.exceptions;
/**
 * La clase IllegalMatrixCalcException extiende a Exception de java.lang
 * Esta excepci�n indica que una operaci�n no puede
 * ser calculada. Por ejemplo, esta excepci�n seria lanzada
 * si los indices de una matriz no
 * son los suficinetes  para realizar una operaci�n.
 * @author Cinthya G, Iker J, Valeria R
 *
 */
public class IllegalMatrixCalcException extends Exception {
	public IllegalMatrixCalcException() {
		super("IllegalMatrixCalcException");  
	}
	
	@Override
	public String toString() {
		return String.format("%s\nMatrixCalc can't be performed, they have different sizes",getMessage());
	}

}
