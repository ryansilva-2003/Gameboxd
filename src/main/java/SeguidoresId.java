import java.io.Serializable;
import java.util.Objects;

public class SeguidoresId implements Serializable {

    private Usuario seguidor;
    private Usuario seguindo;

    public SeguidoresId() {
    }

    public SeguidoresId(Usuario seguidor, Usuario seguindo) {
        this.seguidor = seguidor;
        this.seguindo = seguindo;
    }

    public Usuario getSeguidor() {
        return seguidor;
    }

    public void setSeguidor(Usuario seguidor) {
        this.seguidor = seguidor;
    }

    public Usuario getSeguindo() {
        return seguindo;
    }

    public void setSeguindo(Usuario seguindo) {
        this.seguindo = seguindo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeguidoresId that = (SeguidoresId) o;
        return Objects.equals(seguidor, that.seguidor) && Objects.equals(seguindo, that.seguindo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seguidor, seguindo);
    }
}
