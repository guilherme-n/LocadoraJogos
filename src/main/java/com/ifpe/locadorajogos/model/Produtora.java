package com.ifpe.locadorajogos.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity(name = "TB_PRODUTORA")
@NamedQueries(
        {
            @NamedQuery(
                    name = Produtora.PRODUTORA_POR_NOME,
                    query = "SELECT i FROM Produtora i WHERE i.nome_produtora like ?1"
            ),
                @NamedQuery(
                    name = Produtora.PRODUTORA_POR_ID,
                    query = "SELECT i FROM Produtora i WHERE i.id like ?1"
            )
        }
)
public class Produtora implements Serializable {
    
    public static final String PRODUTORA_POR_NOME = "ProdutoraPorNomeIdioma";
    public static final String PRODUTORA_POR_ID = "ProdutoraPorId";

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Column (length = 100, name = "nome_produtora")
    private String nomeProdutora;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProdutora() {
        return nomeProdutora;
    }

    public void setNomeProdutora(String nomeProdutora) {
        this.nomeProdutora = nomeProdutora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produtora)) {
            return false;
        }
        Produtora other = (Produtora) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dsclocadora.entities.Produtora[ id=" + id + " ]";
    }
    
}
