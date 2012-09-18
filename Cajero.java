
import java.util.*;


public class Cajero
{
	public static void main(String[] args)
	{
		Scanner lee= new Scanner(System.in);
		
		
		
		
		boolean salir= true;
		inicio:
		while(salir)
		{
			
			/*recoger datos USUARIO*/
			System.out.print("Introdusca nombre de usuario: ");
			String entrada = lee.next().toLowerCase();
			String usuario= entrada;
			/*salir del programa*/
			if(entrada.toLowerCase().equals("s"))
			{salir= false; break;}
			/*PASSWORD*/
			System.out.print("Introdusca password: ");
			String entrada2=lee.next();
			if(IsNumero.IsInt(entrada2))
			{
				int password = Integer.parseInt(entrada2);
				boolean sientrar= Login.usuarioEntrada(entrada,password);
				
				if(!sientrar){System.out.println("Usuario o password incorrecto!"); continue inicio;}
		
			}
			
			
			boolean salirConsulta= true;
			recibirMonto:
			while(salirConsulta)
			{
				
				int cantidad;
				
				System.out.print("Introdusca un montoo 's' para salir: ");
				entrada = lee.next();
				
				/*salir del Consulta*/
				if(entrada.toLowerCase().equals("s"))
				{salirConsulta= false; break;}
				
				int numeroBanco= Login.idBanco(usuario);
						
				
				if(IsNumero.IsInt(entrada))
				{
					
					cantidad = Integer.parseInt(entrada);
					
					
					if(cantidad % 100==0)
					{	
						
						/*RETIRO MAXIMO POR DIA*/
						if(numeroBanco!=1 && cantidad>2000){System.out.println("Retiros maximo: 2000 !"); continue recibirMonto;}
						if(cantidad>20000){System.out.println("Retiros maximo: 20000 !"); continue recibirMonto;}
						
						
						if(Consulta.probarRetiroDinero(cantidad,numeroBanco))
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
