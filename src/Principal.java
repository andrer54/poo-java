public class Principal{
    //Atributos
	private static Aluno aluno1 , aluno2 , aluno3 , aluno4 , aluno5 , aluno6 , aluno7 , aluno8 , aluno9;
	private static Escola escola;
	
	//Método main
    public static void main (String args[]){
        escola = new Escola ("Escola Pedro Álvares Cabral" , "42.336.174/0006-13");
        criarAlunos ();
        matricularAlunos();
        escola.agruparAlunos();
    }

    //metodos
    private static void criarAlunos ( ) {
		aluno1 = new Aluno ( "Marco Antônio" , "Rio de Janeiro" );
		aluno2 = new Aluno ( "Clara Silva" , "Rio de Janeiro" );
		aluno3 = new Aluno ( "Marcos Cintra" , "Sorocaba" );
		aluno4 = new Aluno ( "Ana Beatriz" , "Barra do Pirai" );
		aluno5 = new Aluno ( "Marcio Gomes" , "São Paulo" );
		aluno6 = new Aluno ( "João Carlos" , "Sorocaba" );
		aluno7 = new Aluno ( "César Augusto" ,  "São Paulo" );
		aluno8 = new Aluno ( "Alejandra Gomez" , "Madri" );
		aluno9 = new Aluno ( "Castelo Branco" , "São Paulo" );
	}
    private static void matricularAlunos (){
        escola.matricularAlunos(aluno1);
        escola.matricularAlunos(aluno2);
        escola.matricularAlunos(aluno3);
        escola.matricularAlunos(aluno4);
        escola.matricularAlunos(aluno5);
        escola.matricularAlunos(aluno6);
        escola.matricularAlunos(aluno7);
        escola.matricularAlunos(aluno8);
        escola.matricularAlunos(aluno9);

    }
}