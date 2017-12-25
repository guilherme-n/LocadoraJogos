/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteBanco;

import com.ifpe.locadorajogos.model.Vendedor;
import com.ifpe.locadorajogos.util.JPAUtil;
import javax.persistence.EntityManager;

/**
 *
 * @author guilhermenascimento
 */
public class TesteBanco {
    public static void main(String []args){
        EntityManager em = new JPAUtil().createEntityManager();
        
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Guilherme");
        vendedor.setLogin("guilherme.nascimento");
        vendedor.setSenha("12345");
        vendedor.setCpf("084.991.144-31");
        vendedor.setSalario(2000);
        
        em.getTransaction().begin();
        
        em.persist(vendedor);
        
        em.getTransaction().commit();
        
        em.close();
    }
}
