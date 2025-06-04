package com.firstproject;

import jakarta.persistence.*;

@Entity
public class RecuperacaoSenha extends BaseEntity{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_rec")
    private Long idRec;

    @Column(name = "token", length = 100, nullable = false, unique = true)
    private String token;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column (name = "usado", nullable = false)
    private boolean usado;

    public RecuperacaoSenha() {}

    public Long getIdRec(){
        return idRec;
    }

    public String getToken(){
        return token;
    }

    public void setToken(String token){
        this.token = token;
    }

    public boolean getUsado(){
        return usado;
    }

    public void setUsado(boolean usado){
        this.usado = usado;
    }

    public void setIdRec(Long idRec){
        this.idRec = idRec;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}
