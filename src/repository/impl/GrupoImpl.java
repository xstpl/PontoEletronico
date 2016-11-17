package repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Order;

import model.Grupo;
import repository.Grupos;

public class GrupoImpl implements Grupos{
	private Session sessao;

	public GrupoImpl(Session sessao){
		this.sessao = sessao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Grupo> todas() {
		return sessao.createCriteria(Grupo.class).addOrder(Order.asc("nome")).list();
	}

	@Override
	public Grupo porCodigo(Integer codigo) {
		return (Grupo) sessao.get(Grupo.class, codigo);
	}

	@Override
	public Grupo salvar(Grupo grupo) {
		return (Grupo) sessao.merge(grupo);
	}

	@Override
	public void remover(Grupo grupo) {
		this.sessao.delete(grupo);
	}

	@Override
	public void editar(Grupo grupo) {
		this.sessao.update(grupo);

	}

}
