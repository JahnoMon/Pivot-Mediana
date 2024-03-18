import java.util.Scanner;

public class sortSystems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos do array separados por espaço:");
        String input = scanner.nextLine(); // Lê a linha inteira

        String[] values = input.split("\\s+"); // Divide a entrada usando espaços como delimitador

        int[] array = new int[values.length];
        
        for (int i = 0; i < values.length; i++) {
            array[i] = Integer.parseInt(values[i]); // Converte cada substring em um inteiro
        }
        
        // ordenando a lista
//        for (int i = 0; i < array.length - 1; i++) {
//            int menor = i;
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[menor] > array[j]) {
//                    menor = j;
//                }
//            }
//            
//            if (menor != i){
//            	int temporario = array[i];
//	            array[i] = array[menor];
//	            array[menor] = temporario;
//            }
//        }
        
        int mediana = array[(array.length-2)/2];
        int maiorValor = array[0];
        int menorValor = array[0];
        
        for (int i = 0; i < array.length; i++){
        	if (array[i] > maiorValor ) {
        		maiorValor = array[i];
        	} 
        	if (array[i] < menorValor ) {
        		menorValor = array[i];
        	}
        }
        
        System.out.println(mediana);
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] < mediana) {
            	System.out.print(array[i] + " ");
            } 
        }
        
        for(int i = 0; i < array.length; i++) {
        	if(array[i] == mediana) {
            	System.out.print(array[i] + " ");
        	}
        }
        for(int i = 0; i < array.length; i++) {
        	if(array[i] > mediana) {
        		System.out.print(array[i] + " ");
        	}
        }
        scanner.close();
    }
}
