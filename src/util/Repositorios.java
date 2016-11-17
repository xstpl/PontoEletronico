package util;

import java.io.Serializable;

import org.hibernate.Session;

import repository.Grupos;
import repository.Pessoas;
import repository.Pontos;
import repository.impl.GrupoImpl;
import repository.impl.PessoasImpl;
import repository.impl.PontoImpl;


public class Repositorios implements Serializable {

	public Pessoas getPessoas() {
		return new PessoasImpl(this.getSession());
	}

	public Grupos getGrupos(){
		return new GrupoImpl(this.getSession());
	}

	public Pontos getPontos(){
		return new PontoImpl(this.getSession());
	}

	private Session getSession() {
		return (Session) FacesUtil.getRequestAttribute("session");
	}

}
