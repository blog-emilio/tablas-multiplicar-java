import java.util.*;

public class Tablas_de_Multiplicar{

	public static void main(String[] args) {


		Scanner leer = new Scanner (System.in);
		System.out.println("Iniciando programa........");
		System.out.println("Elija la opcion que prefiera.");
		System.out.println("1. Tabla de multiplicar especifica");
		System.out.println("2. Varias tablas de multiplicar");
		System.out.println("3. Salir del programa");
		int opciones = leer .nextInt();

		switch(opciones){
			case 1:
			System.out.println("has elegido la primera opcion");
			System.out.println("favor de ingresar el numero maximo por el que quieres multiplicar");
			int n;
			int c;
			n=leer .nextInt();
			System.out.println("favor de ingresar el numero a multiplicar");
			c=leer .nextInt();
			for(int i=1; i<=n; i++){
				System.out.println(c+"*"+i+"="+c*i);
			}

			break;
			case 2:
			System.out.println("Has elegido la segunda opcion");
			System.out.println("favor de ingresar hasta la tabla de multiplicar que desea");
			int b;
			b= leer.nextInt();
			System.out.println("favor de ingresar hasta que numero desea que llegue su tabla de multiplicar");
			int h;
			h = leer .nextInt();
			
			for( int i=b; i <= h; i++){
				System.out.println("La tabla de multiplicar del:"+ i);

				for(int j=1;j<=10;j++){
					System.out.println(j+"*"+ i +"="+ j* i);
				}
				System.out.println();
			}
			break;

			case 3:
			System.out.println("que tenga buen dia");
			break;

			default:
			System.out.println("opcion no valida");
			break;
		}
		
		
	}
}