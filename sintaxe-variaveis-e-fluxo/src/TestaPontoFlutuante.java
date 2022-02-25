
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		// temos dois pontos fluantes no java. O mais usado é double
		// double: variáveis do tipo inteiro
		double salario;
		salario = 1250.70;
		System.out.println("My salary is: "+salario);
		
		double idadde = 37;
		
		// fazer uma divisão com a variável double (ponto flutuante)
		double divisao = 3.14 / 2;
		// imprimir no console
		System.out.println(divisao);
		
		// com a variável int (somente número decimal)
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);
		
		// o java faz da direita para a esquerda. Por isso a divisão deu 2.0 e não 2.5
		// a solução seria colocar ( 5 / 2) por (5.0 / 2)
		double novaTentativa = 5.0 / 2;
		System.out.println(novaTentativa+ " ibag");
	}
}
