public class Calcul2{
	
public static void main(String[] args){
		int T[]=new int[10]; int y;
		for (int i=0; i<=9; i++) {
		T[i]=i;
			//y=1/i;
		}
		    //y=1/0;
	    double x=10,z;
		try{
			System.out.println("Bloc Try 1");
		if(x<0) throw new MonException("SCRT n'est pasdefinie pour des nombres negatifs !");
		    System.out.println("Bloc Try 2");
		z=Math.sqrt(x);
		System.out.println("z="+z);
        }
		catch (MonException e){
			System.out.println("Bloc Catch");
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Bloc Finally");
		}

	}
}
