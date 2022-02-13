import java.util.UUID;

public class Aluno extends Pessoa{
	//Atributos    
	private String matricula;
		
	//Métodos
	public Aluno ( String nome , String nacionalidade , String naturalidade ) {
		super ( nome , nacionalidade , naturalidade );
		this.matricula = UUID.randomUUID().toString();
	}
	
} 