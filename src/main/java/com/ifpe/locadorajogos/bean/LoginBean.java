package com.ifpe.locadorajogos.bean;

import com.ifpe.locadorajogos.model.Vendedor;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
        System.out.println("senha: " + senha);
        
        Vendedor vendedor = new Vendedor();
        vendedor.setLogin(login);
        vendedor.setSenha(senha);
        EntityManager em = null;
        
        try{
            EntityManagerFactory emf;
            emf = Persistence.createEntityManagerFactory("LocadoraJogos");
            em = emf.createEntityManager();
        
            em.getTransaction().begin();
            em.persist(vendedor);
            em.getTransaction().commit();
        } catch(Exception ex){
            em.getTransaction().rollback();
        }
        
        System.out.println("Teste 2");

    }
}