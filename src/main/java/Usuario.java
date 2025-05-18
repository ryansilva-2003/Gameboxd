import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Usuario {

    @Id
    private String idUsuario;

    private String nomeCompleto;
    private String email;
    private String celular;
    private String senha;
    private LocalDate dataDeNascimento;
    private String fotoUsuario;
    private String nickname;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
