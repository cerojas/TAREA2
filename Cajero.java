
import java.util.*;

public class Cajero
{
	public static void main(String[] args)
	{
		Scanner lee= new Scanner(System.in);
		
		
		
		
		boolean salir= true;
		while(salir)
		{
			System.out.print("Introdusca nombre de usuario: ");
			String entrada = lee.next();
			
			/*salir del programa*/
			if(entrada.toLowerCase().equals("s"))
			{salir= false; break;}
		
		
		
		
			boolean salirConsulta= true;
			while(salirConsulta)
			{
				
				int cantidad;
				
				System.out.print("Introdusca un montoo `s` para salir: ");
				entrada = lee.next();
				
				/*salir del Consulta*/
				if(entrada.toLowerCase().equals("s"))
				{salirConsulta= false; break;}
				
				
				if(IsNumero.IsInt(entrada))
				{
					
					cantidad = Integer.parseInt(entrada);
					
					
					if(cantidad % 100==0)
					{
						if(Consulta.probarRetiroDinero(cantidad))
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
				
			}/*end while salirConsulta*/
			
		}/*end while salr*/
	}
}
