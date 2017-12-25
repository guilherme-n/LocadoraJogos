package com.ifpe.locadorajogos.model;

import java.io.Serializable;

/**
 *
 * @author guilhermenascimento
 */
public class Vendedor extends Usuario implements Serializable{
    private String cpf;
    private double salario;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
