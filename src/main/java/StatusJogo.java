import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "Status_jogo")
public class StatusJogo extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_status")
    private Long idStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusEnum status;

    @ManyToOne
    @JoinColumn(name = "id_jogo", nullable = false)
    private Jogos jogo;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    public StatusJogo() {}

    public Long getIdStatus(){
        return idStatus;
    }

    public void setIdStatus(Long idStatus){
        this.idStatus = idStatus;
    }

    public StatusEnum getStatus(){
        return status;
    }

    public void setStatus(StatusEnum status){
        this.status = status;
    }

    public Jogos getJogo(){
        return jogo;
    }

    public void setJogo(Jogos jogo){
        this.jogo = jogo;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}
