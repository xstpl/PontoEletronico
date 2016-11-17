package model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class Ponto implements Serializable{
	private Integer id;
	private Date data;
	private Time Hora_entrada;
	private Time Hora_saida;
	private Pessoa pessoa;

	@Id
	@GeneratedValue
	@Column(name="id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="data")
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	@Column(name="hora_entrada")
	public Time getHora_entrada() {
		return Hora_entrada;
	}
	public void setHora_entrada(Time hora_entrada) {
		Hora_entrada = hora_entrada;
	}
	@Column(name="hora_saida")
	public Time getHora_saida() {
		return Hora_saida;
	}
	public void setHora_saida(Time hora_saida) {
		Hora_saida = hora_saida;
	}
	@ManyToOne
	@JoinColumn(name="codigo_pessoa", referencedColumnName="codigo")
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((Hora_entrada == null) ? 0 : Hora_entrada.hashCode());
		result = prime * result
				+ ((Hora_saida == null) ? 0 : Hora_saida.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
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
		Ponto other = (Ponto) obj;
		if (Hora_entrada == null) {
			if (other.Hora_entrada != null)
				return false;
		} else if (!Hora_entrada.equals(other.Hora_entrada))
			return false;
		if (Hora_saida == null) {
			if (other.Hora_saida != null)
				return false;
		} else if (!Hora_saida.equals(other.Hora_saida))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}