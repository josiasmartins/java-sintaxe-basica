
public class TestaSwitch {
	public static void main(String[] args) {
		System.out.println("tesntando switch");
		
		int mes = 10;
		// mensagens
		String messages = "O m?s ? ";
		// quando tem muitos casos, usa o switch
		switch (mes) {
			case 1:
				System.out.println(messages+"janeiro");
				// break: serve para interromper o fluxo
				break;
			case 2: 
				System.out.println(messages+"fevereiro");
				break;
			case 3: 
				System.out.println(messages+"mar?o");
				break;
			case 4: 
				System.out.println(messages+"abril");
				break;
			case 5: 
				System.out.println(messages+"maio");
				break;
			case 6:
				System.out.println(messages+"junho");
				break;
			case 7: 
				System.out.println(messages+"julho");
				break;
			case 8:
				System.out.println(messages+"agosto");
				break;
			case 9: 
				System.out.println(messages+"setembro");
				break;
			case 10:
				System.out.println(messages+"outubro");
				break;
			case 11:
				System.out.println(messages+"novembro");
				break;
			case 12: 
				System.out.println(messages+"dezembro");
				break;
				// se nenhum caso for satisfeito, o default ser? executado
			default:
				System.out.println("M?s inv?lido");
				break;
		}
	}
}
