package com.eventoapp.controllers;

import com.eventoapp.models.Evento;
import com.eventoapp.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "http://localhost")
public class EventoController {

    @Autowired
    private EventoRepository acoes;
    @RequestMapping(value="/cadastrarEvento", method = RequestMethod.GET)
    public String form(){
        return "/formEvento";
    }
    @RequestMapping(value="/cadastrarEvento", method = RequestMethod.POST)
    public String form(Evento evento){
        acoes.save(evento);
        return "redirect:/cadastrarEvento";
    }
}
