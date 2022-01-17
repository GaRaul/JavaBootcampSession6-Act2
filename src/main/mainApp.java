package main;

import objetos.Password;

public class mainApp {

	public static void main(String[] args) {
		// Haz una clase llamada Password que siga las siguientes condiciones:
//		• Que tenga los atributos longitud y contraseña . Por defecto, la longitud será de 8.
//		• Los constructores serán los siguiente:
//		- Un constructor por defecto.
//		- Un constructor con la longitud que nosotros le pasemos. Generara una 
//		contraseña aleatoria con esa longitud.

		Password password1 = new Password();
		Password password2 = new Password(5);
		
		System.out.println(password1.toString());
		System.out.println(password2.toString());
		
	}

}
