
public class Testacondicional {
	
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 10;
		int quantidadePessoa = 3;
		
		// if: instrutura de condi??o
		if (idade >= 18) {
			System.out.println("voc? tem mais de 18 anos");
			System.out.println("Seja bem vindo");
		// else: se n?o...fa?a isso
		} else {
			if (quantidadePessoa >= 2) {
				System.out.println("voce n?o tem 18, mas pode entrar, "
						+ "pois est? acompanhado");
			} else {
				System.out.println("Infelimente voce n?o pode entrar");
			}
			
		}
	}
}
