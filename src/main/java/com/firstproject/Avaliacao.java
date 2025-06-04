package com.firstproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table (name = "avaliacao")
public class Avaliacao extends BaseEntity{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_avaliacao")
    private Long idAvaliacao;

    @Column (name = "nota", nullable = false)
    @NotBlank (message = "Este campo é obrigatório")
    private int nota;

    @Column (name = "resenha", columnDefinition = "LONGTEXT")
    private String resenha;

    @Column (name = "recomendacao", nullable = false)
    private boolean recomendacao;

    @ManyToOne
    @JoinColumn(name = "id_jogo", nullable = false)
    private Jogos jogo;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    public Long getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(Long idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public int nota(){
        return nota;
    }

    public void setNota(int nota){
        this.nota = nota;
    }

    public String getResenha(){
        return resenha;
    }

    public void setResenha(String resenha){
        this.resenha = resenha;
    }

    public boolean recomendacao(){
        return recomendacao;
    }

    public void setRecomendacao(boolean recomendacao){
        this.recomendacao = recomendacao;
    }

    public Jogos getJogo() {
        return jogo;
    }

    public void setJogo(Jogos jogo) {
        this.jogo = jogo;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
