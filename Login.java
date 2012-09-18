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
				System.out.println("usuario correcto");
				if(Bancos.visaP[a]== password)
				{	
					System.out.println("contrasena correcto");
					
					retornar= true;
					break;
				}
				else
				{
					System.out.println("contrasena incorrecto");
				}
			}
			
		}
		
		/*MASTERCARD*/
		for(int a=0; a<Bancos.mastercardU.length; a++)
		{
			if(Bancos.mastercardU[a].equals(usuario))
			{
				System.out.println("usuario correcto");
				if(Bancos.mastercardP[a]== password)
				{	
					System.out.println("contrasena correcto");
					
					retornar= true;
					break;
				}
				else
				{
					System.out.println("contrasena incorrecto");
				}
			}
			
		}
		
		/*MAESTRO*/
		for(int a=0; a<Bancos.maestroU.length; a++)
		{
			if(Bancos.maestroU[a].equals(usuario))
			{
				System.out.println("usuario correcto");
				if(Bancos.maestroP[a]== password)
				{	
					System.out.println("contrasena correcto");
					
					retornar= true;
					break;
				}
				else
				{
					System.out.println("contrasena incorrecto");
				}
			}
			
		}
		
		/*AMERICANSPRESS*/
		for(int a=0; a<Bancos.americanExpressU.length; a++)
		{
			if(Bancos.americanExpressU[a].equals(usuario))
			{
				System.out.println("usuario correcto");
				if(Bancos.americanExpressP[a]== password)
				{	
					System.out.println("contrasena correcto");
					
					retornar= true;
					break;
				}
				else
				{
					System.out.println("contrasena incorrecto");
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