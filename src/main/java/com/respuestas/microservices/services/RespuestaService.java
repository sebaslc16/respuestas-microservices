package com.respuestas.microservices.services;

import com.respuestas.microservices.models.entity.Respuesta;

public interface RespuestaService {
    public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas);

    public Iterable<Respuesta> findRespuestaByAlumnoByExamen(Long alumnoId, Long examenId);

    public Iterable<Long> findExamenesIdsConRespuestasByAlumno(Long alumnoId);

}
