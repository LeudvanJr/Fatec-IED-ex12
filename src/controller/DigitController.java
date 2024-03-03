package controller;

public class DigitController {
	public DigitController() {
		// TODO Auto-generated constructor stub
	}
	
	//Funcao para contar quanto de um digito(de 0-9) aparece em um inteiro
	public int digitContains(int number, int digit) {
		
		//quando nao restar mais digitos a serem verificados, a funcao encerra
		if(number == 0)
			return 0;
		
		/*
		 * Compara o ultimo digito do numero com o digito do parametro
		 * Se for igual soma 1 e chama a funcao para o mesmo
		 * numero, mas sem o ultimo digito (aquele verificado)
		*/
		int lastDigit = number % 10; 
		int aux=0;
		
		if(lastDigit == digit)
			aux++;
		
		return aux + digitContains((number/10), digit);
	}
}
