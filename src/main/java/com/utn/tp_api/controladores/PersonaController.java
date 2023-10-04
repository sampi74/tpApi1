package com.utn.tp_api.controladores;

import com.utn.tp_api.entidades.Persona;
import com.utn.tp_api.servicios.PersonaServicioImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServicioImpl> {
}
