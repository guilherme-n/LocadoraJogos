package com.ifpe.locadorajogos.bean;

import com.ifpe.locadorajogos.model.Vendedor;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author guilhermenascimento
 */
@ManagedBean(name = "vendedorBean")
public class VendedorBean {
    public VendedorBean() {
        //System.out.println("1");
        //this.vendedor = new Vendedor();
        //System.out.println("2");
    }
    
    private Vendedor vendedor = new Vendedor();

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public void cadastrar(){
        try{
            System.out.println("0");
            System.out.println("Vendedor: " + vendedor.getNome());
            /*EntityManager em = new JPAUtil().createEntityManager();
            em.getTransaction().begin();
            em.persist(vendedor);
            em.getTransaction().commit();
            em.close();*/
        } catch(Exception ex){
            System.err.println("Erro:" + ex);
        }
    }
    
}
