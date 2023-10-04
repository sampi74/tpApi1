package com.utn.tp_api.repositorios;

import com.utn.tp_api.entidades.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}
