package com.firstproject;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table (name = "administrador")
public class Admin extends BaseEntity implements Serializable {

    @Id
    @Column(name = "id_admin")
    private String idAdmin;

    @Column(name = "username", length = 45, nullable = false, unique = true)
    private String username;

    @Column(name = "senha", length = 255, nullable = false)
    private String senha;

    @Column(name = "first_login", nullable = false)
    private boolean firstLogin;

    public Admin(){
        this.idAdmin = UUID.randomUUID().toString();
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(boolean firstLogin) {
        this.firstLogin = firstLogin;
    }
}
