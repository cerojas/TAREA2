public class Login
{
	public static boolean usuarioEntrada(String usuario, int password)
	{
		/*visa*/
		for(int a=0; a<Bancos.visaU.length; a++)
		{
			if(Bancos.visaU[a].equals(usuario))
			{
				if(Bancos.visaP[a]== password))
				{	
					break;
					return true;
					
				}
			}
			return false;
		}
	}
}