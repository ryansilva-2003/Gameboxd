import jakarta.persistence.*;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Usuario extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_usuario", length = 36)
    private String idUsuario;

    @Column (name = "nome_completo", length = 90, nullable = false)
    private String nomeCompleto;

    @Column (name = "email", length = 45, nullable = false, unique = true)
    private String email;

    @Column (name = "celular", length = 20, nullable = false)
    private String celular;

    @Column (name = "senha", length = 50, nullable = false, unique = true)
    private String senha;

    @Column (name = "data_de_nascimento")
    private LocalDate dataDeNascimento;

    @Column (name = "foto_usuario", length = 300)
    private String fotoUsuario;

    @Column (name = "nickname", length = 45, nullable = false, unique = true)
    private String nickname;

}
