package cl.alvarez.alvaro.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ciudades {

	@Id
	private int ciudadid;
	private String nombreciudad;
	
	@JsonIgnore
	@OneToMany(mappedBy="ciudades", fetch = FetchType.EAGER)
	private List<Beneficiarios> beneficiariosList;

	//Constructor
	public Ciudades() {
		
	}
	
	public Ciudades(int ciudadid, String nombreciudad, List<Beneficiarios> beneficiariosList) {
		this.ciudadid = ciudadid;
		this.nombreciudad = nombreciudad;
		this.beneficiariosList = beneficiariosList;
	}

	
	//Getters and Setters
	public int getCiudadid() {
		return ciudadid;
	}

	public void setCiudadid(int ciudadid) {
		this.ciudadid = ciudadid;
	}

	public String getNombreciudad() {
		return nombreciudad;
	}

	public void setNombreciudad(String nombreciudad) {
		this.nombreciudad = nombreciudad;
	}

	public List<Beneficiarios> getBeneficiariosList() {
		return beneficiariosList;
	}

	public void setBeneficiariosList(List<Beneficiarios> beneficiariosList) {
		this.beneficiariosList = beneficiariosList;
	}

	@Override
	public String toString() {
		return "Ciudades [ciudadid=" + ciudadid + ", nombreciudad=" + nombreciudad + ", beneficiariosList="
				+ beneficiariosList + "]";
	}
	
	
}
