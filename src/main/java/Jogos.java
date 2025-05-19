import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Jogos {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = " id_jogo")
    private String idJogo;

    @Column (name = "nomedojogo", length = 100, nullable = false, unique = false)
    private String nomeDoJogo;

    @Column (name = "desenvolvedores")
    private String desenvolvedores;

    @Column (name = "ano_de_lancamento")
    private LocalDate anoDeLancamento;

    @Column (name = "imagem_capa", length = 300, nullable = false)
    private String imagemCapa;

    @Column (name = "duracao_media")
    private int duracaoMedia;

    @Column (name = "descricao")
    private String descricao;

    @Column (name = "created_at")
    private LocalDateTime created_at;
    @Column (name = "updated_at")
    private LocalDateTime update_at;

}
