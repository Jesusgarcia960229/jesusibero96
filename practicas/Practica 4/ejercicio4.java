import java.io.*;

public class ejercicio4{
	
	public static void main (String [] args ){
	
	int matriz[] ={2,8,1,8,3};
	int minimo =matriz[0] ;
	int maximo= matriz[0];
	int raango=0;
	int suma=0;
	int cuenta=0;
	int media=0;
	int mediana=0;
	int modo=0;
	int desviacionestandar=0;
	int varianza=0;
	
		for(int i=0; i < 5; i++) {

		 	if(minimo > matriz [i]  ) {

		 		minimo = matriz [i];

	
		 	}if(maximo < matriz[i] ) {

		 		maximo = matriz [i];

		 	}
		 		
		}
				raango = maximo - minimo; // rango se saca restando el numero mayor del numero menor

				for(int i = 0; i < 5; i++) {

					suma = suma + matriz[i];
					media = suma / matriz[i];

			}

				System.out.println("El minimo es:"+ minimo);
		 		System.out.println("El maximo es:"+ maximo);
		 		System.out.println("El rango es:"+ raango);
		 		System.out.println("La suma  es:"+ suma);
				System.out.println("La media es:"+ media);

				
				
				





	}


}		