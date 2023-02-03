
public class TesteWhile {

	public static void main(String[] args) {
		int contador = 0;

		while (contador <= 10) {
			System.out.println(contador);
			// Velha guarda
			// contador += 1;
			// Javaitarde
			contador++;
		}

		System.out.println(contador);
	}
}
