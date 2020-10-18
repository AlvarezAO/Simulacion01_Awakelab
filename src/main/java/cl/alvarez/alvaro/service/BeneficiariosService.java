package cl.alvarez.alvaro.service;

import java.util.List;

import cl.alvarez.alvaro.entity.Beneficiarios;

public interface BeneficiariosService {
	
	List<Beneficiarios> getListBeneficiarios();
	Beneficiarios getBeneficiariosById(int beneficiarioid);
	void addBeneficiarios(Beneficiarios beneficiarios);

}
