package poo;

public class Professor extends Pessoa { 
	protected String formacao;
	private float salario; 
	
	
	  public Professor() {}

	protected Professor(String formacao, float salario) {
		super();
		this.formacao = formacao;
		this.salario = salario;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	  
	  

	
		
	

  




	
	

}
