package main;

import objetos.Password;

public class mainApp {

	public static void main(String[] args) {
		// Haz una clase llamada Password que siga las siguientes condiciones:
//		� Que tenga los atributos longitud y contrase�a . Por defecto, la longitud ser� de 8.
//		� Los constructores ser�n los siguiente:
//		- Un constructor por defecto.
//		- Un constructor con la longitud que nosotros le pasemos. Generara una 
//		contrase�a aleatoria con esa longitud.

		Password password1 = new Password();
		Password password2 = new Password(5);
		
		System.out.println(password1.toString());
		System.out.println(password2.toString());
		
	}

}
