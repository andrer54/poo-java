

public class Pessoa {
    //atributos
    protected String nome, nacionalidade, naturalidade;

    //construtor
    public Pessoa (String nome, String nacionalidade, String naturalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }

    //Métodos
    public void atualizarNome (String nome ){
        this.nome = nome;
    }
    public String recuperarNome (){
        return this.nome;
    }

    public String recuperarNacionalidade(){
        return this.nacionalidade;
    }
    public String recuperarNaturalidade(){
        return this.naturalidade;
    }

}
