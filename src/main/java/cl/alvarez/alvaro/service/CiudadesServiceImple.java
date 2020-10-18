package cl.alvarez.alvaro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.alvarez.alvaro.entity.Ciudades;
import cl.alvarez.alvaro.entity.CiudadesRepository;

@Service
public class CiudadesServiceImple implements CiudadesService {

	@Autowired
	CiudadesRepository cr;
	@Override
	public List<Ciudades> getListCiudades() {
		return (List<Ciudades>) cr.findAll();
	}

	@Override
	public Ciudades getCiudadesById(int ciudadid) {
		return cr.findOne(ciudadid);
	}

	@Override
	public void addCiudades(Ciudades ciudades) {
		cr.save(ciudades);
	}

}
