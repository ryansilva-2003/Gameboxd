package com.firstproject;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table (name  = "usuario")
public class Usuario extends BaseEntity {

    @Id
    @Column (name = "id_usuario", length = 36)
    private String idUsuario;

    @Column (name = "nome_completo", length = 90, nullable = false)
    @NotBlank (message = "Esse campo é obrigatório")
    private String nomeCompleto;

    @Column (name = "email", length = 45, nullable = false, unique = true)
    @Email(message = "Email deve ser válido")
    @NotBlank (message = "Esse campo é obrigatório")
    private String email;

    @Column (name = "celular", length = 20, nullable = false)
    @NotBlank (message = "Esse campo é obrigatório")
    private String celular;

    @Column (name = "senha", length = 255, nullable = false)
    @NotBlank (message = "Esse campo é obrigatório")
    private String senha;

    @Column (name = "data_de_nascimento")
    private LocalDate dataDeNascimento;

    @Column (name = "foto_usuario", length = 300)
    private String fotoUsuario;

    @Column (name = "nickname", length = 45, nullable = false, unique = true)
    private String nickname;

    public Usuario(){
        this.idUsuario = UUID.randomUUID().toString();
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getFotoUsuario() {
        return fotoUsuario;
    }

    public void setFotoUsuario(String fotoUsuario) {
        this.fotoUsuario = fotoUsuario;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
