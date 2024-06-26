package calculadora;

/**
 * Clase producto que se utiliza para realizar operaciones aritmétricas de multiplicación
 * @author Rafa
 * @version 1.0
 * @since 1.0
 */
public class Producto {

	/**
	 * Función que recibe como parámetros dos números reales y devuelve su producto
	 * @param a primer producto real
	 * @param b segundo producto real
	 * @return el resultado del producto de los dos números
	 * @version 1.0
	 */
	public float dosReales(float a, float b) {
		return a*b;
	}
	
	/**
	 * Esta funcion recibe como parámetros dos números enteros y devuelve su producto
	 * @param a primer producto entero
	 * @param b segundo producto entero
	 * @return resultado del producto de los dos enteros
	 * @version 1.0
	*/
	public int dosEnteros(int a, int b) {
		return a*b;
	}
	
	/**
	 * Función que recibe como parámetros tres números reales y devuelve su producto
	 * @param a primer producto real
	 * @param b segundo producto real
	 * @param c tercer producto real
	 * @return el resultado del producto de los tres números
	 * @version 1.1
	 */
	public float tresReales(float a, float b, float c) {
		return a*b*c;
	}
	
	/**
	 * Función que recibe como parámetros tres números entero y devuelve su producto
	 * @param a primer producto entero
	 * @param b segundo producto entero
	 * @param c tercer producto entero
	 * @return el resultado del producto de los tres números
	 * @version 1.1
	 */
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}
}
