package com.example.demo.infrastructure.controller;

import com.example.demo.application.UsuarioService;
import com.example.demo.domain.model.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("usuarios", service.listar());
        return "usuarios"; // Nome da view (usuarios.html)
    }

    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Usuario usuario) {
        service.salvar(usuario);
        return "redirect:/usuarios";
    }
}
