
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		String ibag = "new ibag";
		System.out.println("Testando condicionais"+ ibag);
		
		int idade = 20;
		int quantidadePessoa = 3;
		// boolean: verdadeiro ou falso
		boolean acompanhado = quantidadePessoa >= 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		// condicionais
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente voc� n�o pode entrar");
		}
	}
}
