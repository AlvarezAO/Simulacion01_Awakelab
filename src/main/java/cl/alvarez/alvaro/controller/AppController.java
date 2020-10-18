package cl.alvarez.alvaro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import cl.alvarez.alvaro.entity.Ayudas;
import cl.alvarez.alvaro.entity.Beneficiarios;
import cl.alvarez.alvaro.service.AyudasService;

@Controller
public class AppController {
	
	@Autowired
	AyudasService as;
	
	@RequestMapping({"/", "index"})
	public String mainMethod(Model m) {
		
		final String uriAyuda = "http://localhost:8585/cl.alvarez.olivares/ayudas";
		RestTemplate restTemplateA = new RestTemplate();
		ResponseEntity<List<Ayudas>> postResponseA = restTemplateA.exchange(
				uriAyuda, HttpMethod.GET, null, new ParameterizedTypeReference<List<Ayudas>>() {
		});
		
		List<Ayudas> JListAyudas = postResponseA.getBody();
		m.addAttribute("JListAyudas", JListAyudas);
		
		final String uri = "http://localhost:8585/cl.alvarez.olivares/beneficiarios";
		RestTemplate restTemplateB = new RestTemplate();
		
		ResponseEntity<List<Beneficiarios>> postResponseB = restTemplateB.exchange(uri,
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Beneficiarios>>() {
		});
		
		
		List<Beneficiarios> JListBeneficiarios = postResponseB.getBody();
		m.addAttribute("JListBeneficiarios", JListBeneficiarios);
		
		m.addAttribute("ayuda", new Ayudas());
		
		return "index";
		
	}
	
	@RequestMapping("agregaAyuda")
	public String addMethod(@ModelAttribute("ayuda") Ayudas ayuda) {
		as.addAyudas(ayuda);
		
		return "redirect:/index";
	}

}
