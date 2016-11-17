package view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import model.Ponto;
import repository.Pontos;
import util.Repositorios;

@ManagedBean(name="cadastroPontoBean")
@RequestScoped
public class CadastroPontoBean implements Serializable{

	private Repositorios repositorios = new Repositorios();
	private Ponto ponto = new Ponto();
	private List<Ponto> pontos = new ArrayList<Ponto>();

	@PostConstruct
	public void init(){
		Pontos pontos = this.repositorios.getPontos();
		this.pontos = pontos.todas();

	}

	public void cadastrar(){
		Pontos pontos = this.repositorios.getPontos();
		pontos.salvar(ponto);
		this.ponto = new Ponto();


		String msg = "Cadastro efetuado com sucesso!";
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg));
	}

	public void update(Ponto ponto){
		Pontos pontos = this.repositorios.getPontos();
		pontos.editar(ponto);

	}

	public void excluir(Ponto ponto){
		Pontos pontos = this.repositorios.getPontos();
		pontos.remover(ponto);
		this.init();
	}

	public Ponto getPonto() {
		return ponto;
	}

	public void setPonto(Ponto ponto) throws CloneNotSupportedException {
		this.ponto = ponto;
		if (this.ponto == null) {
			this.ponto = new Ponto();
		}else{
			this.ponto  = (Ponto) ponto.clone();
		}
	}

	public List<Ponto> getPontos() {
		return pontos;
	}

	public void setPontos(List<Ponto> pontos) {
		this.pontos = pontos;
	}



}
