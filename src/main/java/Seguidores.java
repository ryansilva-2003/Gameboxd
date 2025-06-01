import jakarta.persistence.*;

@Entity
@Table (name = "seguidores")
public class Seguidores extends BaseEntity{

    @EmbeddedId
    private SeguidoresId id;

    @ManyToOne
    @MapsId("idUsuarioSeguidor")
    @JoinColumn(name = "id_usuario_seguidor", nullable = false)
    private Usuario seguidor;

    @ManyToOne
    @MapsId("idUsuarioSeguindo")
    @JoinColumn(name = "id_usuario_seguindo", nullable = false)
    private Usuario seguindo;

    public Seguidores(){}

    public Usuario getSeguidor(){
        return seguidor;
    }

    public void Seguidor(Usuario Seguidor){
        this.seguidor = seguidor;
    }

    public String getSeguindo(){
        return seguindo;
    }

    public void setSeguindo(Usuario seguindo){
        this.seguindo = seguindo;
    }
}
