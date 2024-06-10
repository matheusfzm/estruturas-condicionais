public class PlanoOperadora {
    public static void main(String[] args) {
        /*Utilizando Switch Case da melhor forma, algoritmo abaixo faz o proposto, porem com switch case fica mais performatico */
        /*/        
        String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
        */

        String plano = "M"; 
        /* Desta forma fica mais compreensivel já que o esperado é imprimir:

        BASIC: 100 minutos de ligação;

        MíDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;

        TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
        
        sem utilizar o break, como é a adição de um pelo outro, desta forma ele imprime a condição adicional.
        */

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}       



    }
    
}
