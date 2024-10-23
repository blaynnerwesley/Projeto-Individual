package poo;


public class Aluno extends Pessoa {
	public String curso; 
	
	public Aluno() {}

	protected Aluno(String curso) {
		super();
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}	
	
	
	

}

