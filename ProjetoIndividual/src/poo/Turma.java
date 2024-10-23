package poo;


public class Turma {
    private String codigo;
    private Professor professor;
    	
    public Turma() {}

	protected Turma(String codigo, Professor professor) {
		super();
		this.codigo = codigo;
		this.professor = professor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
    
 
    
	

}
