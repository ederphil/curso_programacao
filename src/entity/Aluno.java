package entity;

public class Aluno {

	public String nome;
	public int primeiraNota;
	public int segundaNota;
	public int terceiraNota;

	public int gradeFinal() {
		return primeiraNota + segundaNota + terceiraNota;
	}

	public String verificaSePassou() {

		return gradeFinal() >= 60 ? "Passou!" : "Não Passou! \nFaltou " + (60 - gradeFinal()) + " Pontos. ";

	}

	public String toString() {

		String retorno;
		retorno = "Grade Final: " + gradeFinal() + "\n" + verificaSePassou() + "\n";
		return retorno;
	}

}
