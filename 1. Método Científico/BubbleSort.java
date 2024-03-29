package practica;

public class BubbleSort {
	/**
	 * This method the BubbleSort method. Returns
	 * the array in increasing order.
	 *
	 * @param array The array to be sorted
	 * @param size The count of total number of elements in array
	 **/
	public static void main(String[] args) {
		int []datos={8,7,6,5,4,9};
		System.out.println("Datos antes de ejecucion");
		imprimir (datos);
		BS(datos, datos.length);
		System.out.println("\nDatos despues de ejecucion");
		imprimir(datos);
	}
	
	public static <T extends Comparable<T>> void BS(int array[], int size) {
		int last = size;

			for (int count = 0; count < last-1; count++)
			{
				for(int j=0;j<last-count-1;j++)
				if (array[j]>array[j+1])
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
	}
	
	public static void imprimir(int []datos){
		for(int i=0;i<datos.length;i++){
			System.out.print(datos[i]);
		}
	} 
}
