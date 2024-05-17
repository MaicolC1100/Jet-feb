package com.jetfeb.usuarios.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.jetfeb.usuarios.modelo.Personal;
import com.jetfeb.usuarios.servicio.PersonalServicio;

@Controller
public class PersonalControlador {

    @Autowired
    private PersonalServicio personalServicio;

    @GetMapping("/personal")
    public String listarPersonal(Model modelo) {
        modelo.addAttribute("personal", personalServicio.listarTodoElPersonal());
        return "personal"; // suponiendo que "personal" es el nombre de la vista
    }

    @GetMapping("/personal/nuevo")
    public String mostrarFormularioDeRegistro(Model modelo) {
        Personal personal = new Personal();
        modelo.addAttribute("personal", personal);
        return "crear_personal";
    }

    @PostMapping("/personal")
    public String guardarPersonal(@ModelAttribute("personal") Personal personal) {
        personalServicio.guardarPersonalBl(personal);
        return "redirect:/personal";
    }

    @GetMapping("/personal/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("personal", personalServicio.obtenerPersonalporId(id));
        return "editar_personal";
    }

    @PostMapping("/personal/{id}")
    public String actualizarPersonal(@PathVariable Long id, @ModelAttribute("personal") Personal personal,
            Model modelo) {
        Personal personalExistente = personalServicio.obtenerPersonalporId(id);
        personalExistente.setId(id);
        personalExistente.setCedula(personal.getCedula());
        personalExistente.setPlaca(personal.getPlaca());
        personalExistente.setCargo(personal.getCargo());
        personalExistente.setCelular(personal.getCelular());
        personalExistente.setCorreo(personal.getCorreo());

        personalServicio.actualizarPersonal(personalExistente);
        return "redirect:/personal";
    }

    @GetMapping("/personal/{id}/eliminar")
    public String eliminarPersonal(@PathVariable Long id) {
        personalServicio.eliminarPersonalBll(id);
        return "redirect:/personal";
    }
}
