package uia.com.contabilidad.clientes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pago extends InfoUIA {
	
	String status;
	
	public Pago()
	{			
	}
	
    public Pago(@JsonProperty("id")int id, @JsonProperty("name")String name, @JsonProperty("pago")String status) 
	{
		super();
		this.setPago(status);
        super.type =  this. getClass(). getSimpleName();			
	}
	
    public String getPago() {
		return status;
	}

	public void setPago(String status) {
		this.status = status;
	}	

	public Pago(int id, String name) 
	{
        super();
	}

}
