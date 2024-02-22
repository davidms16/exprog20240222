package fp.dam.examen.ejercicio1;

import java.util.Scanner;

public class Automovil {

	public static void main(String[] args) throws IllegalArgumentException{
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese la marca del automovil: ");
		String marca = s.nextLine();
		
		System.out.println("Ingrese el modelo del automovil: ");
		String modelo = s.nextLine();
		
		System.out.println("Ingrese la matricula del automovil: ");
		String matricula = s.nextLine();
		
		System.out.println("Ingrese el año de fabricacion del automovil: ");
		Integer añoFabricacion = s.nextInt();
		if (añoFabricacion < 0 || añoFabricacion > 2024 ) {
			System.out.println("Año de fabricacion no valido. Intentalo de nuevo: ");
		}
		
		System.out.println("Ingrese el tipo de motor del automovil. Solo de Gasolina, Diesel, Hibrido o Electrico: ");
		String motor = s.nextLine();
		if (motor != "Gasolina" || motor != "Diesel" || motor != "Hibrido" || motor != "Electrico") {
			System.out.println("Tipo de combustible del motor no valido. Intentalo de nuevo: ");
		}
		
		System.out.println("Ingrese la potencia del automovil: ");
		Integer potencia = s.nextInt();
		if (potencia <= 0) {
			System.out.println("Numero de potencia no valido. Intentalo de nuevo: ");
		}
		
		System.out.println(marca + " , " + modelo + " , " + matricula + " , " + añoFabricacion + " , " + motor + " , " 
		+ potencia);
		
		s.close();

	}

}
