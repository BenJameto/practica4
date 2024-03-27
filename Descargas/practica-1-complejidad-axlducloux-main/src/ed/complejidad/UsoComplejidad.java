package ed.complejidad;
public class UsoComplejidad{
	public static void main(String [] args){

		Complejidad c = new Complejidad();

		for(int i=0; i<6; i++){
			int fib = c.fibonacciIt(i);
			System.out.println("Para fibonacci de " + i + " se realizaron las siguientes operaciones " + c.leeContador());
			try{
				IComplejidad.escribeOperaciones("dataFibonacciIt.dat",i,c.leeContador());	
			}catch(Exception e){

			}	
		}

		for(int i=0; i<6; i++){
			int fib = c.fibonacciRec(i);
			System.out.println("Para fibonacci de " + i + " se realizaron las siguientes operaciones " + c.leeContador());
			try{
				IComplejidad.escribeOperaciones("dataFibonacciRec.dat",i,c.leeContador());	
			}catch(Exception e){

			}	
		}
		
		int contador = 1;
		for(int i = 0; i<4; i++){
			for (int j = 0; j<i+1 ; j++){
				c.tPascalIt(i,j);
				System.out.println("Para la coordendada: (" + i + ","+ j + ")" +  " se realizaron las siguientes operaciones " + c.leeContador());
				try{
					IComplejidad.escribeOperaciones("dataPascalIt.dat", i, j, c.leeContador());
					if (contador%3 == 0) {
						IComplejidad.escribeLineaVacia("dataPascalIt.dat");
					}
					contador ++;
				}catch(Exception e){

				}
			}
		}

		int contador1 = 1;
		for(int i = 0; i<4; i++){
			for (int j = 0; j<i+1 ; j++){
				c.tPascalRec(i,j);
				System.out.println("Para la coordendada: (" + i + ","+ j + ")" +  " se realizaron las siguientes operaciones " + c.leeContador());
				try{
					IComplejidad.escribeOperaciones("dataPascalRec.dat", i, j, c.leeContador());
					if (contador1%3 == 0) {
						IComplejidad.escribeLineaVacia("dataPascalRec.dat");
					}
					contador1 ++;
				}catch(Exception e){

				}
			}
		}
	}
}