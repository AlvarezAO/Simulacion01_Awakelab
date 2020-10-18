package cl.alvarez.alvaro.service;

import java.util.List;

import cl.alvarez.alvaro.entity.Ciudades;

public interface CiudadesService {
	
	List<Ciudades> getListCiudades();
	Ciudades getCiudadesById(int ciudadid);
	void addCiudades(Ciudades ciudades);

}
