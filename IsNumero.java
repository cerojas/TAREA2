// determina si un dato es numerico o no

public class IsNumero
{
	public static boolean IsInt(String cadena)
	{
		
		try
		{
			int numero = Integer.parseInt(cadena);
			return true;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		
		
	}
	
	public static boolean IsDouble(String cadena)
	{
		try
		{
			double numero = Double.parseDouble(cadena); 
			return true;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
	}
}