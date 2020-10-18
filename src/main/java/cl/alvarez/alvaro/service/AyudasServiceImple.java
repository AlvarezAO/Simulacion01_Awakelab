package cl.alvarez.alvaro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.alvarez.alvaro.entity.Ayudas;
import cl.alvarez.alvaro.entity.AyudasRepository;

@Service
public class AyudasServiceImple implements AyudasService {

	@Autowired
	AyudasRepository ar;
	
	@Override
	public List<Ayudas> getListAyudas() {		
		return (List<Ayudas>) ar.findAll() ;
	}

	@Override
	public Ayudas getAyudasById(int ayudaid) {
		return ar.findOne(ayudaid);
	}

	@Override
	public void addAyudas(Ayudas ayudas) {
		ar.save(ayudas);

	}

}
