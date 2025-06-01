import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table (name = "favoritos")
public class Favoritos extends BaseEntity implements Serializable {

    @EmbeddedId
    private FavoritosId id;

    @ManyToOne
    @MapsId("idUsuario")
    @JoinColumn (name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @MapsId("idJogo")
    @JoinColumn(name = "id_jogo", nullable = false)
    private Jogos jogo;

    public Favoritos () {}

    public FavoritosId getId(){
        return id;
    }

    public void setId (FavoritosId id){
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Jogos getJogo() {
        return jogo;
    }

    public void setJogo(Jogos jogo) {
        this.jogo = jogo;
    }
}
