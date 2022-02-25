
public class TestaConversao {
	
	public static void main(String[] args) {
		double salario = 1270.50;
		
		// o f no final é float
		float pontoFlutuante = 3.14f;
		
		// variável inteiro - int
		// (int): casting do tipo int. Ele vai forçar a variavel salario a ser do tipo int
		int valor = (int) salario;
		System.out.println(valor);
		
		// o int pode guardar até 2 bilhões de números. Se passar disso, dá overflow (numero não esperado)
		int x = 200000;
		
		// long: variável para guardar números grande. Ele guarda 2^63;
		// o (l) diz que não é do tipo int
		long numeroGrande = 600000000000000000l;
		// sort: variável de número pequeno. Guarda valor de 32bits. Até 32 mil
		short valorPequeno = 2131;
		// byte: variável que guarda até 256;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}
}
