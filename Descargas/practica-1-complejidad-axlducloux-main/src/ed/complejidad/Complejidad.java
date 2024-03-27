
package ed.complejidad;

public class Complejidad implements IComplejidad{

	private int contador;
    
    /**
     * Devuelve el número de operaciones acumuladas desde la última vez
     * que se reinició el contador.
     * @return número de operaciones.
     */
	public long leeContador(){
		return contador;
	}
	
    /**
     * Método que calcula recursivamente la función de Fibonacci.
     * @param n Entrada de tipo entero para el cálculo de Fibonacci.
     * @return El n-ésimo término de la secuencia de Fibonacci.
     * @throws IndexOutOfBoundsException Si n es un número negativo.
     */
	public int fibonacciRec(int n){
		contador = 0;
		if (n < 0) throw new IndexOutOfBoundsException();
		else return fibonacciAux(n);
	}

	private int fibonacciAux(int n){
		contador ++;
		if (n == 0) return 0;
		if (n == 1) return 1;
		else return fibonacciAux(n-1) + fibonacciAux(n-2);
	}
    
    /**
     * Método que calcula iterativamente la función de Fibonacci.
     * @param n Entrada de tipo entero para el cálculo de Fibonacci.
     * @return El n-ésimo término de la secuencia de Fibonacci.
     * @throws IndexOutOfBoundsException Si n es un número negativo.
     */
	public int fibonacciIt(int n){
		contador++;
		if (n < 0) throw new IndexOutOfBoundsException();
		if (n == 0) return 0;
		if (n == 1) return 1;

		int fibonacci0 = 0;
		int fibonacci1 = 1;
		for (int i = 0; i < n-1 ; i++){
			int aux = fibonacci0;
			fibonacci0 = fibonacci1;
			fibonacci1 += aux;
			contador ++;
		}
		return fibonacci1;
	}

	/**
     * Método que calcula recursivamente el elemento en la fila 'ren' y la columna 'col'
     * del triángulo de Pascal.
     * @param ren Número de fila.
     * @param col Número de columna.
     * @return El elemento en la fila 'ren' y la columna 'col' del triángulo de Pascal.
     * @throws IndexOutOfBoundsException Si los índices 'ren' o 'col' son inválidos.
     */
	public int tPascalRec(int ren, int col){
		contador = 0;
		if (col < 0 || ren < 0 || col > ren) throw new IndexOutOfBoundsException();
		else return tPascalAux(ren, col);
	} 


	private int tPascalAux(int ren, int col){
		contador ++;
		if (col == 0 || ren == col) return 1;
		else return tPascalAux(ren-1 , col-1) + tPascalAux(ren-1, col);
	}

    /**
     * Método que calcula iterativamente el elemento en la fila 'ren' y la columna 'col'
     * del triángulo de Pascal.
     * @param ren Número de fila.
     * @param col Número de columna.
     * @return El elemento en la fila 'ren' y la columna 'col' del triángulo de Pascal.
     * @throws IndexOutOfBoundsException Si los índices 'ren' o 'col' son inválidos.
     */
	public int tPascalIt(int ren, int col){
		contador = 1;
		if(col == 0 || ren == col) return 1;
		if (col < 0 || ren < 0 || col > ren) throw new IndexOutOfBoundsException();
		
		int [][] tPascal = new int[ren+1][col+1];
		tPascal [0][0] = 1;
		tPascal [1][0] = 1;
		tPascal [1][1] = 1;

		for (int i=0;i<ren+1;i++ ) {
			for (int j=0; j<col+1 && j <= i ;j++ ) {
				
				if(j == 0){
					tPascal[i][j] = 1;	
				}else{
					if(i==j){
						tPascal[i][j] = 1;
						
					}else{
						contador ++;
						tPascal[i][j] = tPascal[i-1][j-1] + tPascal[i-1][j];
					}
				}
				
			}			
		}
		return tPascal[ren][col];
	}

}
	
