package com.utn.tp_api.servicios;

import com.utn.tp_api.entidades.BaseEntidad;
import com.utn.tp_api.repositorios.BaseRepository;

import java.io.Serializable;

public abstract class BaseServicioImpl<E extends BaseEntidad, ID extends Serializable> implements BaseServicio<E, ID> {

    protected BaseRepository baseRepository;

    public BaseServicioImpl(BaseRepository baseRepository) {
        this.baseRepository = baseRepository;
    }
}
