import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Jogos {

    @Id
    private String idJogo;

    private String nomeDoJogo;
    private String desenvolvedores;
    private LocalDate anoDeLancamento;
    private String imagemCapa;
    private int duracaoMedia;
    private String descricao;

    private LocalDateTime created_at;
    private LocalDateTime update_at;

}
