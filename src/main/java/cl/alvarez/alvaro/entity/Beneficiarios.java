package cl.alvarez.alvaro.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Beneficiarios {

	@Id
	private int beneficiarioid;
	private String nombre;
	private int edad;
	
	@JsonIgnore
	@OneToMany(mappedBy="beneficiarios", fetch = FetchType.EAGER)
	private List<Ayudas> ayudaLista;

	@ManyToOne
	@JoinColumn(name="ciudadid")
	private Ciudades ciudades;
	

	//Constructor
	public Beneficiarios() {
		
	}
	
	public Beneficiarios(int beneficiarioid, String nombre, int edad, Ciudades ciudades, List<Ayudas> ayudaLista) {
		this.beneficiarioid = beneficiarioid;
		this.nombre = nombre;
		this.edad = edad;
		this.ciudades = ciudades;
		this.ayudaLista = ayudaLista;
	}

	//Getters and Setters
	public int getBeneficiarioid() {
		return beneficiarioid;
	}

	public void setBeneficiarioid(int beneficiarioid) {
		this.beneficiarioid = beneficiarioid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Ciudades getCiudades() {
		return ciudades;
	}

	public void setCiudades(Ciudades ciudades) {
		this.ciudades = ciudades;
	}

	public List<Ayudas> getayudaLista() {
		return ayudaLista;
	}

	public void setayudaLista(List<Ayudas> ayudaLista) {
		this.ayudaLista = ayudaLista;
	}

	@Override
	public String toString() {
		return "Beneficiarios [beneficiarioid=" + beneficiarioid + ", nombre=" + nombre + ", edad=" + edad
				+ ", ciudades=" + ciudades + ", ayudaLista=" + ayudaLista + "]";
	}
	
	
}
