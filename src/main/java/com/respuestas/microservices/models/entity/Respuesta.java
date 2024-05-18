package com.respuestas.microservices.models.entity;

import com.commons.alumnos.models.entity.Alumno;
import com.commonsexamns.entity.Question;

import javax.persistence.*;

@Entity
@Table(name = "respuestas")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;

    @ManyToOne(fetch = FetchType.LAZY)
    private Alumno alumno;

    @OneToOne(fetch = FetchType.LAZY)
    private Question pregunta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Question getPregunta() {
        return pregunta;
    }

    public void setPregunta(Question pregunta) {
        this.pregunta = pregunta;
    }
}
