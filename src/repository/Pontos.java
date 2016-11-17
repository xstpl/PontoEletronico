package repository;

import java.util.List;

import model.Ponto;

public interface Pontos {

	public List<Ponto> todas();
	public Ponto porCodigo(Integer codigo);
	public Ponto salvar(Ponto ponto);
	public void remover(Ponto ponto);
	public void editar(Ponto ponto);
}
