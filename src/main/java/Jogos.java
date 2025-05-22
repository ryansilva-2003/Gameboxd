import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Jogos extends BaseEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = " id_jogo")
    private Long idJogo;

    @Column (name = "nomedojogo", length = 100, nullable = false, unique = false)
    private String nomeDoJogo;

    @Column (name = "desenvolvedores")
    private String desenvolvedores;

    @Column (name = "ano_de_lancamento")
    private LocalDate anoDeLancamento;

    @Column (name = "imagem_capa", length = 300, nullable = false)
    private String imagemCapa;

    @Column (name = "duracao_media")
    private float duracaoMedia;

    @Column (name = "descricao")
    private String descricao;

}
