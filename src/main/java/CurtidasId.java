import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CurtidasId implements Serializable {

    private Long idComentario;
    private String idUsuario;

    public CurtidasId(){}

    public CurtidasId(Long idComentario, String idUsuario){
        this.idComentario = idComentario;
        this.idUsuario = idUsuario;
    }

    public Long getIdComentario(){
        return idComentario;
    }

    public void setIdComentario(Long idComentario){
        this.idComentario = idComentario;
    }

    public String getIdUsuario(){
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario){
        this.idUsuario = idUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurtidasId that = (CurtidasId) o;
        return Objects.equals(idComentario, that.idComentario) && Objects.equals(idUsuario, that.idUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComentario, idUsuario);
    }
}
