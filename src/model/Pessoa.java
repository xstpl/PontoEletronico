package model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Pessoa implements Serializable, Cloneable{
	private Integer codigo;
	private String login;
	private String senha;
	private String matricula;
	private String cpf;
	private String rg;
	private String nome;
	private String sobrenome;
	private String ultimonome;
	private String nomePai;
	private String sobrenomePai;
	private String ultimonomePai;
	private String nomeMae;
	private String sobrenomeMae;
	private String ultimonomeMae;
	private Grupo grupo;

	@Id
	@GeneratedValue
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	@Column
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	@Column
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Column
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Column
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Column
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	@Column
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	@Column
	public String getUltimonome() {
		return ultimonome;
	}
	public void setUltimonome(String ultimonome) {
		this.ultimonome = ultimonome;
	}
	@Column
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	@Column
	public String getSobrenomePai() {
		return sobrenomePai;
	}
	public void setSobrenomePai(String sobrenomePai) {
		this.sobrenomePai = sobrenomePai;
	}
	@Column
	public String getUltimonomePai() {
		return ultimonomePai;
	}
	public void setUltimonomePai(String ultimonomePai) {
		this.ultimonomePai = ultimonomePai;
	}
	@Column
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	@Column
	public String getSobrenomeMae() {
		return sobrenomeMae;
	}
	public void setSobrenomeMae(String sobrenomeMae) {
		this.sobrenomeMae = sobrenomeMae;
	}
	@Column
	public String getUltimonomeMae() {
		return ultimonomeMae;
	}
	public void setUltimonomeMae(String ultimonomeMae) {
		this.ultimonomeMae = ultimonomeMae;
	}
	@ManyToOne
	@JoinColumn(name="codigo_grupo", referencedColumnName="codigo")
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((grupo == null) ? 0 : grupo.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result
				+ ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nomeMae == null) ? 0 : nomeMae.hashCode());
		result = prime * result + ((nomePai == null) ? 0 : nomePai.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result
				+ ((sobrenome == null) ? 0 : sobrenome.hashCode());
		result = prime * result
				+ ((sobrenomeMae == null) ? 0 : sobrenomeMae.hashCode());
		result = prime * result
				+ ((sobrenomePai == null) ? 0 : sobrenomePai.hashCode());
		result = prime * result
				+ ((ultimonome == null) ? 0 : ultimonome.hashCode());
		result = prime * result
				+ ((ultimonomeMae == null) ? 0 : ultimonomeMae.hashCode());
		result = prime * result
				+ ((ultimonomePai == null) ? 0 : ultimonomePai.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (grupo == null) {
			if (other.grupo != null)
				return false;
		} else if (!grupo.equals(other.grupo))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeMae == null) {
			if (other.nomeMae != null)
				return false;
		} else if (!nomeMae.equals(other.nomeMae))
			return false;
		if (nomePai == null) {
			if (other.nomePai != null)
				return false;
		} else if (!nomePai.equals(other.nomePai))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		if (sobrenomeMae == null) {
			if (other.sobrenomeMae != null)
				return false;
		} else if (!sobrenomeMae.equals(other.sobrenomeMae))
			return false;
		if (sobrenomePai == null) {
			if (other.sobrenomePai != null)
				return false;
		} else if (!sobrenomePai.equals(other.sobrenomePai))
			return false;
		if (ultimonome == null) {
			if (other.ultimonome != null)
				return false;
		} else if (!ultimonome.equals(other.ultimonome))
			return false;
		if (ultimonomeMae == null) {
			if (other.ultimonomeMae != null)
				return false;
		} else if (!ultimonomeMae.equals(other.ultimonomeMae))
			return false;
		if (ultimonomePai == null) {
			if (other.ultimonomePai != null)
				return false;
		} else if (!ultimonomePai.equals(other.ultimonomePai))
			return false;
		return true;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}