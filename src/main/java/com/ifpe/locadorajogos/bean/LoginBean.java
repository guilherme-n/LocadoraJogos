package com.ifpe.locadorajogos.bean;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author guilhermenascimento
 */
@ManagedBean
public class LoginBean {
    private String login;
    private String senha;
    
    public LoginBean(){
        login = "";
        senha = "";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void logar(){
        System.out.println("login: " + login);
    }
}
