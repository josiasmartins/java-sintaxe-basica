
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		// temos dois pontos fluantes no java. O mais usado ? double
		// double: vari?veis do tipo inteiro
		double salario;
		salario = 1250.70;
		System.out.println("My salary is: "+salario);
		
		double idadde = 37;
		
		// fazer uma divis?o com a vari?vel double (ponto flutuante)
		double divisao = 3.14 / 2;
		// imprimir no console
		System.out.println(divisao);
		
		// com a vari?vel int (somente n?mero decimal)
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		// o java faz da direita para a esquerda. Por isso a divis?o deu 2.0 e n?o 2.5
		// a solu??o seria colocar ( 5 / 2) por (5.0 / 2)
		double novaTentativa = 5.0 / 2;
		System.out.println(novaTentativa+ " ibag");
	}
}
