package cl.alvarez.alvaro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;


@Entity
public class Ayudas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AYUDAS_SEQ")
	@SequenceGenerator(name = "AYUDAS_SEQ", sequenceName = "AYUDAS_SEQ", allocationSize = 1, initialValue = 1)
	private int ayudaid;
	private int monto;
	private String motivo;
	
	
	@ManyToOne
	@JoinColumn(name="beneficiarioid")
	private Beneficiarios beneficiarios;

	
	//Constructor
	public Ayudas() {
		
	}
	
	public Ayudas(int ayudaid, int monto, String motivo, Beneficiarios beneficiarios) {
		this.ayudaid = ayudaid;
		this.monto = monto;
		this.motivo = motivo;
		this.beneficiarios = beneficiarios;
	}

	//Getters and Setters
	public int getAyudaid() {
		return ayudaid;
	}

	public void setAyudaid(int ayudaid) {
		this.ayudaid = ayudaid;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Beneficiarios getBeneficiarios() {
		return beneficiarios;
	}

	public void setBeneficiarios(Beneficiarios beneficiarios) {
		this.beneficiarios = beneficiarios;
	}

	@Override
	public String toString() {
		return "Ayudas [ayudaid=" + ayudaid + ", monto=" + monto + ", motivo=" + motivo + ", beneficiarios="
				+ beneficiarios + "]";
	}

}
