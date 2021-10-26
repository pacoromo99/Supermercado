package es.studium.SupermercadoHilo;

import java.util.ArrayList;

public class Prueba 
{
	public static void main(String[] args)
	{
		Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });
		Cliente cliente3 = new Cliente("Cliente 3", new int[] { 2, 2, 1});
		Cliente cliente4 = new Cliente("Cliente 4", new int[] { 2, 6, 1, 5, 8, 3 });
		ArrayList<Cliente>ClientesCajera1 = new ArrayList<Cliente>();
		ArrayList<Cliente>ClientesCajera2 = new ArrayList<Cliente>();
		ClientesCajera1.add(cliente1);
		ClientesCajera1.add(cliente3);
		ClientesCajera2.add(cliente2);
		ClientesCajera2.add(cliente4);
		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();
		Cajera cajera1 = new Cajera("Cajera 1", ClientesCajera1,initialTime);
		Cajera cajera2 = new Cajera("Cajera 2", ClientesCajera2,initialTime);
		cajera1.start();
		cajera2.start();
	}


}
