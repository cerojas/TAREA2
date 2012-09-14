public class Consulta
{
	static double dosmil= 2;
	static double mil= 2;
	static int quiniento = 3;
	static int dosciento=  5;
	static int cien = 2;
	static double enCaja = dosmil + mil + quiniento + dosciento + cien;
	
	public static boolean probarRetiroDinero(int cantidad)
	{
		
		
		int[] NumeroBilletes= {0,0,0,0,0};
		
		//DOSMILL 2000
		while(cantidad >=2000 && dosmil!=0)
		{
			NumeroBilletes[4]+= 1;
			cantidad-= 2000;

		}

		//MIL 1000
		while(cantidad >=1000  && mil!=0)
		{
			NumeroBilletes[3]+=1;
			cantidad-= 1000;
		}

		//MIL 500
		while(cantidad >=500 && quiniento!=0)
		{
			NumeroBilletes[2]+=1;
			cantidad-= 500;
		}
		
		//MIL 200
		while(cantidad >=200 && dosciento!=0)
		{
			NumeroBilletes[1]+=1;
			cantidad-= 200;
		}
		
		//MIL 100
		while(cantidad >=100 && cien!=0)
		{
			NumeroBilletes[0]+=1;
			cantidad-= 100;
		}
		
		if(
			cien - NumeroBilletes[0]<0 || 
			dosciento - NumeroBilletes[1]<0 ||
			quiniento - NumeroBilletes[2]<0 ||
			mil - NumeroBilletes[3]<0 ||
			dosmil - NumeroBilletes[4]<0
		)
		{
			return false;
		}
		else
		{
			return true;
		}
		
			
	}
	
	
	
	
	public static void retiroDinero(int cantidad)
	{
		
		
		int[] NumeroBilletes= {0,0,0,0,0};
		
		//DOSMILL 2000
		while(cantidad >=2000 && dosmil!=0)
		{
			NumeroBilletes[4]+= 1;
			cantidad-= 2000;

		}

		//MIL 1000
		while(cantidad >=1000  && mil!=0)
		{
			NumeroBilletes[3]+=1;
			cantidad-= 1000;
		}

		//quinientos 500
		while(cantidad >=500 && quiniento!=0)
		{
			NumeroBilletes[2]+=1;
			cantidad-= 500;
		}
		
		//doscientos 200
		while(cantidad >=200 && dosciento!=0)
		{
			NumeroBilletes[1]+=1;
			cantidad-= 200;
		}
		
		//cien 100
		while(cantidad >=100 && cien!=0)
		{
			NumeroBilletes[0]+=1;
			cantidad-= 100;
		}
		
		/*descontar billetes*/
		cien      -= NumeroBilletes[0];
		dosciento -= NumeroBilletes[1];
		quiniento -= NumeroBilletes[2];
		mil       -= NumeroBilletes[3];
		dosmil    -= NumeroBilletes[4];
		
		/*IMPRIME RESULTADO*/
		for(int a=0; a<NumeroBilletes.length; a++)
		{
			if(a==0 && NumeroBilletes[a]!=0)
			{
				System.out.println("Cien: "+ NumeroBilletes[0]);
			}
			
			if(a==1 && NumeroBilletes[a]!=0)
			{
				System.out.println("Doscientos: "+ NumeroBilletes[1]);
			}
			
			if(a==2 && NumeroBilletes[a]!=0)
			{
				System.out.println("Quinientos: "+ NumeroBilletes[2]);
			}
			
			if(a==3 && NumeroBilletes[a]!=0)
			{
				System.out.println("Mil: "+ NumeroBilletes[3]);
			}
			
			if(a==4 && NumeroBilletes[a]!=0)
			{
				System.out.println("Dosmil: "+ NumeroBilletes[4]);
			}
		}
			
	}
}