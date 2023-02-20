package consola;

import modelo.Pedido;
import modelo.Restaurante;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class aplicacion {

	

	public void ejecutarOpcion()
	{
		System.out.println("Rappi");

		boolean continuar = true;
		while (continuar)
			try
			{
				mostrarmenu();
				int seleccion = Integer.parseInt(input(("Seleccione una opción")));
				if (seleccion == 1)
					cargarDatos();
				else if (seleccion == 2)
					ejecutarIniciarPedido();
				else if (seleccion == 3)
					ejecutarPedidoEnCurso();
				else if (seleccion == 4)
					ejecutarIngredientesProducto();
				else if (seleccion == 5)
					ejecutarConsultarMenu();
				else if (seleccion == 6)
					ejecutarInfoRestaurante();
				else if (seleccion == 7)
					ejecutarCerrarGuardar();
				else if (seleccion == 8)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
	}
			
	



	/**
	 * Muestra al usuario el menú con las opciones para que escoja la siguiente
	 * acción que quiere ejecutar.
	 */
	public void mostrarmenu()
	{
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Cargar Datos");
		System.out.println("2. Iniciar un pedido");
		System.out.println("3. Consultar un pedido en curso");
		System.out.println("4. Consultar Ingredientes de un producto");
		System.out.println("5. Consultar menu");
		System.out.println("6. Consultar informacion sobre el restaurante");
		System.out.println("7. Cerrar y guardar pedido");
		System.out.println("8. Salir de la aplicación\n");
	}
	public static String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	private void ejecutarIniciarPedido()
	{
	String cliente = input("Nombre del cliente ");
	String direccion = input("Direccion del cliente∫ ");
	Restaurante.iniciarPedido(cliente, direccion);
	}
	
	private void cargarDatos() 
	{
		// TODO Auto-generated method stub
		
	}
	
	private void ejecutarPedidoEnCurso()
	{
		
	}
	
	private void ejecutarIngredientesProducto()
	{
		
	}
	
	private void ejecutarConsultarMenu()
	{
		
	}
	
	private void ejecutarInfoRestaurante()
	{
		
	}
	
	private void ejecutarCerrarGuardar()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aplicacion app = new aplicacion();
		app.ejecutarOpcion();
	}

}
