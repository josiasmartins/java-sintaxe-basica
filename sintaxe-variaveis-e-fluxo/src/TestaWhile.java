
public class TestaWhile {
	public static void main(String[] args) {
		int contador = 0;
		// la�o while. Recebe uma express�o booleana
		while (contador <= 10) {
			System.out.println(contador);
			// contador = contador + 1; outra forma de fazer: contador += 1;
			contador++;
		}
		System.out.println(contador);
	}
}
