package com.ifpe.locadorajogos.bean;

import com.ifpe.locadorajogos.model.FaixaEtariaEnum;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class FaixaEtariaBean {
    
    public FaixaEtariaEnum[] getFaixaEtaria(){
        return FaixaEtariaEnum.values();
    }
    
}
