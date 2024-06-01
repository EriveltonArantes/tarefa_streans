package br.com.welc;


public class Pessoa implements Comparable<Pessoa> {

	public String nome;
	public String sexo; // 1-M ~ 0-F

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
//			return "Pessoa [nome=" + nome + ", sexo=" + sexo + "]";
		return "(nome=" + nome + ", sexo=" + sexo + ")";
	}

	/*
	 * @Override public int compareTo(Pessoa o) { // TODO Auto-generated method stub
	 * return 0; }
	 */

	@Override
	public int compareTo(Pessoa pessoa) {
		// TODO Auto-generated method stub
		// return this.nome.compareTo(pessoa.getNome());
		return this.nome.compareTo(pessoa.getNome());
	}

}
