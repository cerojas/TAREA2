
import java.util.*;

public class Cajero
{
	public static void main(String[] args)
	{
		Scanner lee= new Scanner(System.in);
		
		double mil= 35000;
		int quiniento = 25000;
		int dociento=  20000;
		int cien = 20000;
		
		int numero;
		int[] operacion= {0,0,0,0,0};
		int acumulado;
		
		System.out.print("Introdusca un monto: ");
		numero = Integer.parseInt(lee.next());
		acumulado= numero;
		if(numero%100==0)
		{
			
			//DOSMILL 2000
			while(acumulado >=2000)
			{
				operacion[4]+= 1;
				acumulado-= 2000;

			}

			//MIL 1000
			while(acumulado >=1000)
			{
				operacion[3]+=1;
				acumulado-= 1000;
			}

			//MIL 500
			while(acumulado >=500)
			{
				operacion[2]+=1;
				acumulado-= 500;
			}
			
			//MIL 200
			while(acumulado >=200)
			{
				operacion[1]+=1;
				acumulado-= 200;
			}
			
			//MIL 100
			while(acumulado >=100)
			{
				operacion[0]+=1;
				acumulado-= 100;
			}
			
			System.out.println("dos mil: "+ operacion[4]);
			System.out.println("mil: "+ operacion[3]);
			System.out.println("quinientos: "+ operacion[2]);
			System.out.println("doscientos: "+ operacion[1]);
			System.out.println("cien: "+ operacion[0]);
		}
		else
		{
			System.out.println("hasta 500 el monto debe ser en multiplos de cien");
		}
		
	}
}
