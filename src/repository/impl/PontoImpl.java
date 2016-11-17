package repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Order;

import model.Grupo;
import model.Ponto;
import repository.Grupos;
import repository.Pontos;

public class PontoImpl implements Pontos{
	private Session sessao;

	public PontoImpl(Session sessao){
		this.sessao = sessao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ponto> todas() {
		return sessao.createCriteria(Ponto.class).addOrder(Order.asc("id")).list();
	}

	@Override
	public Ponto porCodigo(Integer codigo) {
		return (Ponto) sessao.get(Ponto.class, codigo);
	}

	@Override
	public Ponto salvar(Ponto ponto) {
		return (Ponto) sessao.merge(ponto);
	}

	@Override
	public void remover(Ponto ponto) {
		this.sessao.delete(ponto);
	}

	@Override
	public void editar(Ponto ponto) {
		this.sessao.update(ponto);

	}

}
