package com.firstproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table (name = "jogos")
public class Jogos extends BaseEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = " id_jogo")
    private Long idJogo;

    @Column (name = "nome_do_jogo", length = 100, nullable = false)
    @NotBlank(message = "Esse campo é obrigatório")
    private String nomeDoJogo;

    @Column (name = "desenvolvedores")
    private String desenvolvedores;

    @Column (name = "ano_de_lancamento")
    private LocalDate anoDeLancamento;

    @Column (name = "imagem_capa", length = 300, nullable = false)
    @NotBlank (message = "Esse campo é obrigatório")
    private String imagemCapa;

    @Column (name = "duracao_media")
    private float duracaoMedia;

    @Column (name = "descricao")
    private String descricao;

    @ManyToMany
    @JoinTable(
            name = "jogos_has_genero",
            joinColumns = @JoinColumn(name = "id_jogo"),
            inverseJoinColumns = @JoinColumn(name = "id_genero")
    )
    private List<Genero> generos;


    public String getNomeDoJogo() {
        return nomeDoJogo;
    }

    public void setNomeDoJogo(String nomeDoJogo) {
        this.nomeDoJogo = nomeDoJogo;
    }

    public String getDesenvolvedores() {
        return desenvolvedores;
    }

    public void setDesenvolvedores(String desenvolvedores) {
        this.desenvolvedores = desenvolvedores;
    }

    public Long getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(Long idJogo) {
        this.idJogo = idJogo;
    }

    public LocalDate getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(LocalDate anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getImagemCapa() {
        return imagemCapa;
    }

    public void setImagemCapa(String imagemCapa) {
        this.imagemCapa = imagemCapa;
    }

    public float getDuracaoMedia() {
        return duracaoMedia;
    }

    public void setDuracaoMedia(float duracaoMedia) {
        this.duracaoMedia = duracaoMedia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
