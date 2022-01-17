package objetos;

public class Password {

	private String password;
	private int longitud;
	
	public Password() {
		this.password = "";
		this.longitud = 8;
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.password = generarPassword(longitud); // Llamo al metodo que genera una contraseña aleatoria segun la longitud que indique el usuario
	}
	
	// METODO PARA GENERAR CONTRASEÑA ALEATORIA
	private String generarPassword(int longitud) {
		String password = "";
		int num;
		
		int min = 32; // 32 es el caracter ascii con numero mas bajo
		int max = 126; // 126 lo mismo pero numero mas alto
		
		int rango = (126 - 32) + 1;

		for (int i = 0; i < longitud; i++) {
			num = (int)(Math.random() * rango) + min;
			password += (char)num; // Hago un cast de int a char para coger el valor ASCII y se lo sumo al String password
		}
		
		return password;
	}

	@Override
	public String toString() {
		return "Password: [" + password + "] - longitud=" + longitud + "]";
	}
	
}
