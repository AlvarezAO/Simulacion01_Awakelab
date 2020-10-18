package cl.alvarez.alvaro.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.alvarez.alvaro.entity.Beneficiarios;
import cl.alvarez.alvaro.entity.BeneficiariosRepository;

@Service
public class BeneficiariosServiceImple implements BeneficiariosService {

	@Autowired
	BeneficiariosRepository br;

	@Override
	public List<Beneficiarios> getListBeneficiarios() {
		return (List<Beneficiarios>) br.findAll();
	}

	@Override
	public Beneficiarios getBeneficiariosById(int beneficiarioid) {
		return br.findOne(beneficiarioid);
	}

	@Override
	public void addBeneficiarios(Beneficiarios beneficiarios) {
		br.save(beneficiarios);
		
	}

	

}
