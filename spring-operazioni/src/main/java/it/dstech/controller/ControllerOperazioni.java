package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.view.Operazione;

@Controller
public class ControllerOperazioni {
	@RequestMapping(value = "/scelta")
	public ModelAndView tipoOperazione(@RequestParam("operazione") String operazione, Model model) {
		return new ModelAndView("inserimentoDati", "operazione", operazione);
	}
	@RequestMapping(value = "/calcolo")
	public ModelAndView operazioneNumeri(@RequestParam("operazione")String operazione, @RequestParam("primo") double primoNumero,  @RequestParam("secondo") double secondoNumero, Model model) {
		Operazione calcolo = new Operazione(primoNumero, secondoNumero, operazione);
		ModelAndView view = new ModelAndView("risultato");
		view.addObject("primoNumero", primoNumero);
		view.addObject("secondoNumero", secondoNumero);
		view.addObject("risultato", calcolo.risultato());
		view.addObject("operazione", operazione);
		return view;
	}

}
