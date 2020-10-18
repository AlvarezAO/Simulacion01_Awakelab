package cl.alvarez.alvaro.service;

import java.util.List;
import cl.alvarez.alvaro.entity.Ayudas;

public interface AyudasService {
	
	List<Ayudas> getListAyudas();
	Ayudas getAyudasById(int ayudaid);
	void addAyudas(Ayudas ayudas);

}
