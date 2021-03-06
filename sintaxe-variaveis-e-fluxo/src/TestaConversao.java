
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		
		// o f no final ? float
		float pontoFlutuante = 3.14f;
		
		// vari?vel inteiro - int
		// (int): casting do tipo int. Ele vai for?ar a variavel salario a ser do tipo int
		int valor = (int) salario;
		System.out.println(valor);
		
		// o int pode guardar at? 2 bilh?es de n?meros. Se passar disso, d? overflow (numero n?o esperado)
		int x = 200000;
		
		// long: vari?vel para guardar n?meros grande. Ele guarda 2^63;
		// o (l) diz que n?o ? do tipo int
		long numeroGrande = 600000000000000000l;
		// sort: vari?vel de n?mero pequeno. Guarda valor de 32bits. At? 32 mil
		short valorPequeno = 2131;
		// byte: vari?vel que guarda at? 256;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}
}
