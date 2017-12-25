package com.ifpe.locadorajogos.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author guilhermenascimento
 */
public class JPAUtil {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("LocadoraJogos");
    
    public EntityManager createEntityManager(){
        return emf.createEntityManager();
    }
}
