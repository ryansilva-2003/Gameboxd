package com.firstproject;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "curtidas")
public class Curtidas extends BaseEntity implements Serializable {

    @EmbeddedId
    private CurtidasId id;

    @ManyToOne
    @MapsId("idComentario")
    @JoinColumn(name = "id_comentario", nullable = false)
    private Comentario comentario;

    @ManyToOne
    @MapsId("idUsuario")
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    public Curtidas (){}

    public CurtidasId getId(){
        return id;
    }

    public void setId(CurtidasId id){
        this.id = id;
    }

    public Comentario getComentario(Comentario comentario){
        return comentario;
    }

    public void setComentario(Comentario comentario){
        this.comentario = comentario;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}
