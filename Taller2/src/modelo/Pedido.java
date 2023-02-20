package modelo;

public class Pedido {

	private int numeroPedidos;
	
	private int idPedido;
	
	private String nombreCliente;
	
	private String direccionCliente;
	
	public Pedido(String nombreCliente, String direccionCliente) 
	{
	
	}
	
	public int getIdPedido() 
	{
		return idPedido;
	}
	
	public void agregarProducto(Producto nuevoItem) 
	{
	}
	
	private int getPrecioNetoPedido() 
	{
		return 0;
	}
	
	private int getPrecioTotalIva() 
	{
		return 0;
	}
	
	private int PrecioIVAPedido() 
	{
		return 0;
	}
	
	private String generarTextoFactura() 
	{
		return null;
	}
	
	public void guardarFactura() 
	{
		
	}

	
	
}
