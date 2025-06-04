package com.firstproject;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FavoritosId extends BaseEntity implements Serializable {

    private String idUsuario;
    private int idJogo;

    public FavoritosId () {}

    public FavoritosId(String idUsuario, int idJogo){
        this.idJogo = idJogo;
        this.idUsuario = idUsuario;
    }

    public String getIdUsuario(){
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario){
        this.idUsuario = idUsuario;
    }

    public int getIdJogo(){
        return idJogo;
    }

    public void setIdJogo(int idJogo){
        this.idJogo = idJogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FavoritosId that = (FavoritosId) o;
        return idJogo == that.idJogo && Objects.equals(idUsuario, that.idUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idJogo);
    }
}
