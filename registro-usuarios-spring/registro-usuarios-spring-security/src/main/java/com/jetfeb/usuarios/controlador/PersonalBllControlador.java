package com.jetfeb.usuarios.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.jetfeb.usuarios.modelo.PersonalBll;
import com.jetfeb.usuarios.servicio.PersonalBllServicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonalBllControlador {

	@Autowired
	private PersonalBllServicio servicio;

	@GetMapping({ "/personalBll" })
	public String listarPersonalBll(Model modelo) {
		modelo.addAttribute("personal", servicio.listarTodoElPersonal());
		return "personalBll"; // nos retorna al archivo PersonalBelleza
	}

	@GetMapping("/personalBll/nuevo")
	public String MostrarFormularioDeRegistro(Model modelo) {
		PersonalBll personalbll = new PersonalBll();
		modelo.addAttribute("personalbelleza", personalbll);
		return "crear_personalbll";

	}

	@PostMapping("/personalBll")
	public String guardarPersonalBll(@ModelAttribute("personalbll") PersonalBll personalbll) {
		servicio.guardarPersonalBl(personalbll);
		return "redirect:/personalBll";
	}

	@GetMapping("/personalBll/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("personalbelleza", servicio.obtenerPersonalBllporId(id));
		return "editar_personalbll";

	}

	@PostMapping("/personalBll/{id}")
	public String actualizarPersonalbll(@PathVariable Long id, @ModelAttribute("personalbll") PersonalBll personalbll,
			Model modelo) {
		PersonalBll personalbllExistente = servicio.obtenerPersonalBllporId(id);
		personalbllExistente.setId(id);
		personalbllExistente.setCedula(personalbll.getCedula());
		personalbllExistente.setNombre(personalbll.getNombre());
		personalbllExistente.setGerencia(personalbll.getGerencia());
		personalbllExistente.setCtro_costo(personalbll.getCtro_costo());

		servicio.actualizarPersonalBll(personalbllExistente);
		return "redirect:/personalBll";
	}

	@GetMapping("/personalBll/{id}")
	public String eliminarPersonalbll(@PathVariable Long id) {
		servicio.eliminarPersonalBll(id);
		return "redirect:/personalBll";

	}

}
