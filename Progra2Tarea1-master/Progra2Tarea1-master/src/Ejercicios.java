public class Ejercicios
{
	//devuelve true si "numero" es par y false de lo contrario
	static boolean esPar(int numero)
	{if(numero%2==0) //Si el residuo es cero es verdadero
	  return true;
     else
	  return false;   
	}
	
	//devuelve "gratis" si lempiras es igual a 0
	//devuelve "barato" si lempiras es menor que 100
	//devuelve "normal" si lempiras es menor que 200
	//de lo contrario devuelve caro
	//nota: solo aceptan minusculas
	static String obtenerPrecio(int lempiras)
	{
		if(lempiras==0)
		    return "gratis";
		else if(lempiras<100)
			return "barato";
		else if(lempiras<200)
			return "normal";
		return "caro";         //Probablemente siempre devuelva "caro"
	}
	
	//devuelve el factorial de "num"
	static int factorial(int num)
	{int fact=1;
		if(num==0)
		return fact;  //Si num es 0 devuelve 1
	else{
		for(int i=1; i<=num; i++)  //Ciclo para calcular el factorial
			 fact*=i;
	}
	return fact; //Devuelve el calculo del factorial
	}
	

	//devuelve el elemento de "arr" en la posicion "pos"
	static int getElemento(int arr[],int pos)
	{ 
		return arr[pos];  //El ejercicio mas facil de mi vida!!!:')
	}
	
	//devuelve el elemento de "arr" en la posicion ["col"] ["fila"]
	static int getElemento(int arr[][],int col,int fila)
	{
		return arr[col][fila];  //El segundo ejercicio mas facil de mi vida!! :'D
	}
	
	//devuelve el atributo "x" de "MiClase"
	static int getX(MiClase mi_clase)
	{
		return mi_clase.x;  //Ya saque 100!!!! Devuelve el atributo "x" de miClase
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXPor2(MiClase mi_clase)
	{
		return mi_clase.getXPor2(); //Devuelve el atributo multiplicado por dos
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXMasY(MiClase mi_clase, int y)
	{
		return mi_clase.getXMasY(y); //Llama la funcion getXMasY de la variable mi_clase
	}
	
	//devuelve la funcion fibonacci de "num"
	//nota: puedes consultar la funcion en http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci
	static int fibonacci(int num)
	{
		if(num==1) return 1; // num es 1 regresa 1
else if (num==0) return 0; // si num es 0 regresa 0
return fibonacci(num-1) + fibonacci(num-2); // si no retorna la suma de la funcion fibonacci del numero -1,
                                            // mas la funcion de fibonacci del numero -2
		}                           

	//realizar la siguiente funcion recursiva:
	//funcionRecursiva(n) = funcionRecursiva(n-1)*2+1
	//donde: funcionRecursiva(0) = 1 y funcionRecursiva(1) = 2
	static int funcionRecursiva(int num)
	{
	if(num==0) return 1; // si num es 0 devuelve 1
else if(num==1) return 2; // si num es 1 devuelve 2
return funcionRecursiva(num-1)*2+1; // y para cualquier otro numero num llama a la misma funcion 
                                    //donde numero es menos uno y multiplicado por 2 y luego se le suma 1
}
public static void main(String[] args)
{
}
}

	}
	
	public static void main(String[] args)
	{

	}

}
