package uia.com.contabilidad.gestor;

public class DecoradorPagos extends Decorador{
	
	public DecoradorPagos(IGestor gestor, String tipo)
	{
		super(gestor, tipo);
	}
	
	
	public DecoradorPagos()
	{		
	}
	
	public void validaPagos()
	{
		super.Print();
	}
	
}
