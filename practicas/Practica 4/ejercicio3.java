

public class ejercicio3{
	

 public static void main (String [] args  ){
		
 		String word="hola,mi buen amigo";
 		String primerPalabra;
 		String primerPalabra1;
    	int pos = word.indexOf(","); 
    	int pos2= word.indexOf(" ");
    	primerPalabra=word.substring(0, pos);
    	primerPalabra1=word.substring(2, pos);
    	System.out.println("La posicion de la primer palabra es:" + pos);
    	System.out.println("La posicion de la primer palabra es:"+ primerPalabra);
    	System.out.println("La posicion de la primer palabra es:" + pos2);
    	System.out.println("La posicion de la primer palabra es:"+ primerPalabra1);

		}
}