import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo3Numeros {
	
	/*
	* Crea un programa de nombre Ejemplo3Numeros que pida 3 valores decimales y que:
		• Muestre el resultado de multiplicar los 3
		• Muestre el resultado de sumar los 3
		• Muestre por consola si el 1er número es mayor que el 2o
		• Muestre por consola si los 3 números son iguales
		• Muestre por consola si el 1er número es múltiple de 2
	*/

	public static void main (String[] args) throws IOException {
		
		// Pido al usuario que introduzca 3 valosres decimales
		System.out.println("Necesito que introduzcas 3 números decimales.");
		System.out.println("Introduce el primer valor decimal");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String valor1 = br.readLine();
		
		System.out.println("Introduce el segundo valor decimal");
		
		String valor2 = br.readLine();
		
		System.out.println("Introduce el tercer valor decimal");
		
		String valor3 = br.readLine();
		// Muestro al usuario los valores introducidos
		System.out.println("Los valores introducidos son: " + valor1 + " - " + valor2 + " - " + valor3);
		
		// Convierto los valores de tipo String a tipo Double
		Double num1 = Double.parseDouble(valor1);
		Double num2 = Double.parseDouble(valor2);
		Double num3 = Double.parseDouble(valor3);
		
		// Muestro al usuario las operaciones requeridas
		System.out.println("La multiplicación de los tres númemeros es: " + num1*num2*num3);
		System.out.println("La suma de los tres números es: " + num1+num2+num3);
		
		// Muestro al usuario si el 1er número es mayor que el 2o
		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else {
			System.out.println(num1 + " no es mayor que " + num2);
		}
		
		// Muestro al usuario por consola si los 3 números son iguales
		if (num1==num2 && num2==num3) {
			System.out.println("Los tres números son iguales");
		} else {
			System.out.println("Los tres números no son iguales");
		}
		
		// Muestro al usuario por consola si el 1er número es múltiplo de 2
		
		boolean multiplo = (num1 % 2 == 0);
		
		if (multiplo = true) {
			System.out.println(num1 + " es múltiplo de 2");
		} else {
			System.out.println(num1 + " no es múltiplo de 2");
		}
		
		
	}
	
}
