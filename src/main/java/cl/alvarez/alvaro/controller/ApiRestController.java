package cl.alvarez.alvaro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.alvarez.alvaro.entity.Ayudas;
import cl.alvarez.alvaro.entity.Beneficiarios;
import cl.alvarez.alvaro.service.AyudasService;
import cl.alvarez.alvaro.service.BeneficiariosService;

@RestController
public class ApiRestController {
	
	@Autowired
	BeneficiariosService bs;
	@Autowired
	AyudasService as;
	
	@GetMapping(value = "/beneficiarios", headers = "Accept=application/json")
	public List<Beneficiarios> getJsonBeneficiarios(){
		List<Beneficiarios> JsonBeneficiarios = bs.getListBeneficiarios();
		return JsonBeneficiarios;
	}
	
	@GetMapping(value = "/ayudas", headers = "Accept=application/json")
	public List<Ayudas> getJsonAyudas(){
		List<Ayudas> JsonAyudas = as.getListAyudas();
		return JsonAyudas;
	}

}
