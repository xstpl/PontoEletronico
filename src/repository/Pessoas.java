package repository;

import java.util.List;

import model.Pessoa;

public interface Pessoas {

	public List<Pessoa> todas();
	public Pessoa porCodigo(Integer codigo);
	public Pessoa salvar(Pessoa pessoa);
	public void remover(Pessoa pessoa);
	public void editar(Pessoa pessoa);
	public Pessoa login(String usuario, String senha);
	public void logout();
}
