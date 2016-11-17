package repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import model.Pessoa;
import repository.Pessoas;

public class PessoasImpl implements Pessoas{
	private Session sessao;

	public PessoasImpl(Session sessao){
		this.sessao = sessao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pessoa> todas() {
		return sessao.createCriteria(Pessoa.class).addOrder(Order.asc("nome")).list();
	}

	@Override
	public Pessoa porCodigo(Integer codigo) {
		return (Pessoa) sessao.get(Pessoa.class, codigo);
	}

	@Override
	public Pessoa salvar(Pessoa pessoa) {
		return (Pessoa) sessao.merge(pessoa);
	}

	@Override
	public void remover(Pessoa pessoa) {
		this.sessao.delete(pessoa);
	}

	@Override
	public void editar(Pessoa pessoa) {
		this.sessao.update(pessoa);
	}

	@Override
	public Pessoa login(String login, String senha) {
		Criteria c = this.sessao.createCriteria(Pessoa.class);
		c.add(Restrictions.ilike("login", login));
		c.add(Restrictions.ilike("senha", senha));
		FacesContext fc = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
		session.setAttribute("usuario", login);
		session.setAttribute("senha", senha);
		return (Pessoa) c.uniqueResult();
	}

	@Override
	public void logout() {
		FacesContext fc = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
		session.removeAttribute("usuario");
		session.removeAttribute("senha");
		session.invalidate();
		
	}

	
}