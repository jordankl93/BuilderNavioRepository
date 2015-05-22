/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp.util;

import br.ifes.edu.poo2.cdp.Navio;

/**
 *
 * @author Jordan-Not
 */
public class NavioCargaBuilder extends NavioBuilder{
    private Navio navioCarga;

    public NavioCargaBuilder(Navio navioCarga) {
        this.navioCarga = navioCarga;
    }
    
    @Override
    public void setCarga(){
        navioCarga.setCarga();
    }
    
    @Override
    public void setPassageiro(){
        navioCarga.setPassageiro();
    }

    @Override
    public Navio getNavio() {
        return navioCarga;
    }    
}
