
public class MiClase {
	int x;
	MiClase(int x)
	{
		this.x = x;  //De aqui obtiene la variable x
	}
	
	//devuelve "x" multiplicado por dos
	int getXPor2()
	{
		return (x*2); //Devuelve x multiplicado por 2
	}
	
	//devuelve la suma de "x" y "y"
	int getXMasY(int y)
	{
		return (x+y);  //suma variables x + y
	}
}
