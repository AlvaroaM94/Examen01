package uia.com.contabilidad.cuentas;

import uia.com.contabilidad.cheques.GestorCheques;
import uia.com.contabilidad.clientes.Cliente;
import uia.com.contabilidad.clientes.InfoUIA;

public class registraCuentasXPagar extends InfoUIA{
	private GestorCheques miGestorCheques = new GestorCheques();
	private Cuenta miCCheques;
	private Cliente miCliente;
	
	
	public registraCuentasXPagar(Cliente cliente, String nomCuentaCheques, String nomCheque) 
	{

		this.miCliente = cliente;
		if(this.miGestorCheques != null && miCliente != null)
		{
			for(int i = 0; i < this.miCliente.getItems().size(); i++)
			{
			    miCCheques = (Cuenta) this.miCliente.getItems().get(i);
			    if(miCCheques.getName().contains(nomCuentaCheques.toString()))
			    	break;
			}
			
			if(miCCheques != null)
				miGestorCheques.registraCheque(miCCheques,  nomCuentaCheques, nomCheque);
			else
				System.out.println("Error: Cuenta de cheques no encontrada");
		}
	}
	
	

}
