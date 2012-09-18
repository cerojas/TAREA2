public class Login
{	

	

	/*identifica si esta registrado*/
	public static boolean usuarioEntrada(String usuario, int password)
	{
		
	
		/*visa*/
		boolean retornar=false;
		for(int a=0; a<Bancos.visaU.length; a++)
		{
			if(Bancos.visaU[a].equals(usuario))
			{
				if(Bancos.visaB[a]>=3)
				{
					retornar= false;
					System.out.println("ha excedido los intentos !");
					break;
				}
				if(Bancos.visaP[a]== password)
				{	
					
					
					retornar= true;
					break;
				}
				else
				{
					Bancos.visaB[a]+=1;
					if(Bancos.visaB[a]>=3)
					{
						retornar= false;
						System.out.println("ha excedido los intentos !");
						break;
					}
				}
			}
			
		}
		
		/*MASTERCARD*/
		for(int a=0; a<Bancos.mastercardU.length; a++)
		{
			if(Bancos.mastercardU[a].equals(usuario))
			{
				if(Bancos.mastercardB[a]>=3)
				{
					retornar= false;
					System.out.println("ha excedido los intentos !");
					break;
				}
				if(Bancos.mastercardP[a]== password)
				{	
					
					
					retornar= true;
					break;
				}
				else
				{
					Bancos.mastercardB[a]+=1;
					if(Bancos.mastercardB[a]>=3)
					{
						retornar= false;
						System.out.println("ha excedido los intentos !");
						break;
					}
				}
			}
			
		}
		
		/*MAESTRO*/
		for(int a=0; a<Bancos.maestroU.length; a++)
		{
			if(Bancos.maestroU[a].equals(usuario))
			{
				if(Bancos.maestroB[a]>=3)
				{
					retornar= false;
					System.out.println("ha excedido los intentos !");
					break;
				}
				if(Bancos.maestroP[a]== password)
				{	
					
					
					retornar= true;
					break;
				}
				else
				{
					Bancos.maestroB[a]+=1;
					if(Bancos.maestroB[a]>=3)
					{
						retornar= false;
						System.out.println("ha excedido los intentos !");
						break;
					}
				}
			}
			
		}
		
		/*AMERICANSPRESS*/
		for(int a=0; a<Bancos.americanExpressU.length; a++)
		{
			if(Bancos.americanExpressU[a].equals(usuario))
			{
				if(Bancos.americanExpressB[a]>=3)
				{
					retornar= false;
					System.out.println("ha excedido los intentos !");
					break;
				}
				if(Bancos.americanExpressP[a]== password)
				{	
					
					
					retornar= true;
					break;
				}
				else
				{
					Bancos.americanExpressB[a]+=1;
					if(Bancos.americanExpressB[a]>=3)
					{
						retornar= false;
						System.out.println("ha excedido los intentos !");
						break;
					}
				}
			}
			
		}
		
		return retornar;
	}
	

	
	
		
	
	/*identifica de que COMPANIA es el usuario*/
	/*****************************************/
	public static int numeroUsuario;
	public static int idBanco(String entrada)
	{
		
		/*visa*/
		int retornar=0;
		for(int a=0; a<Bancos.visaU.length; a++)
		{
			if(Bancos.visaU[a].equals(entrada))
			{
					
				
				numeroUsuario=a;
				retornar= 1;
				
			
			}
			
		}
		
		/*MASTERCARD*/
		for(int a=0; a<Bancos.mastercardU.length; a++)
		{
			if(Bancos.mastercardU[a].equals(entrada))
			{
					
				
				numeroUsuario=a;
				retornar= 2;
				
			
			}
			
		}
		
		/*MAESTRO*/
		for(int a=0; a<Bancos.maestroU.length; a++)
		{
			if(Bancos.maestroU[a].equals(entrada))
			{
					
				
				numeroUsuario=a;
				retornar= 3;
				
			
			}
			
		}
		
		/*AMERICANEXPRESS*/
		for(int a=0; a<Bancos.americanExpressU.length; a++)
		{
			if(Bancos.americanExpressU[a].equals(entrada))
			{
					
				
				numeroUsuario=a;
				retornar= 4;
				
			
			}
			
			
		}
		
		return retornar;
		
	}
	
	

}