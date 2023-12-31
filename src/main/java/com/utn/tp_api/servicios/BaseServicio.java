package com.utn.tp_api.servicios;

import com.utn.tp_api.entidades.BaseEntidad;

import java.io.Serializable;
import java.util.List;

public interface BaseServicio <E extends BaseEntidad, ID extends Serializable>{

    public List<E> findAll() throws Exception;
    public E findById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public boolean delete(ID id) throws Exception;
}
