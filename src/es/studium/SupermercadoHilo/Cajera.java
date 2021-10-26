package es.studium.SupermercadoHilo;

import java.util.ArrayList;

public class Cajera extends Thread
{

	private String nombre;
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private long initialTime;
	// Constructor, getter & setter
	public Cajera(String n, ArrayList<Cliente> c, long i)
	{
		nombre = n;
		clientes = c;
		initialTime = i;
	}
	public void run()
	{
		for(Cliente cliente : clientes) 
		{
			System.out.println("La cajera " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre() + " EN EL TIEMPO:" + (System.currentTimeMillis() - this.initialTime) / 1000 + " seg");
			for (int i = 0; i < cliente.getCarroCompra().length; i++)
			{
				this.esperarXsegundos(cliente.getCarroCompra()[i]);
				System.out.println("La cajera " + this.nombre + " está procesando el producto " + (i + 1) + " del cliente " + cliente.getNombre() + "->Tiempo: " + (System.currentTimeMillis() -
						this.initialTime) / 1000 + " seg");
			}
			System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + " seg");
		}
	}
	private void esperarXsegundos(int segundos)
	{
		try
		{
			Thread.sleep(segundos * 1000);
		}
		catch (InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
	}
	public void cambiarCliente() 
	{

	}

}

