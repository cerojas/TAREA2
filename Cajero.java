
import java.util.*;

public class Cajero
{
	public static void main(String[] args)
	{
		Scanner lee= new Scanner(System.in);
		boolean salir= true;
		
		while(salir)
		{
			int cantidad;
			
			System.out.print("Introdusca un monto: ");
			String entrada = lee.next();
			
			/*SALIR*/
			if(entrada.toLowerCase().equals("s"))
			{salir= false; break;}
			
			
			if(IsNumero.IsInt(entrada)==true)
			{
				cantidad = Integer.parseInt(entrada);
				
				
				if(cantidad % 100==0)
				{
					if(Consulta.probarRetiroDinero(cantidad)==true)
					{
						Consulta.retiroDinero(cantidad);
					}
					else
					{
						System.out.println("Intentalo con otro monto !");
					}
				}			
				else
				{
					System.out.println("El monto debe ser multiplo de 100 !");
				}
			}
			else
			{
				System.out.println("Digite un numero !");
			}
			
		}
	}
}
