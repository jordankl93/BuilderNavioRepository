/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.cdp;

/**
 *
 * @author Jordan-Not
 */
public class NavioGraneleiro extends AbstractNavio{

    public NavioGraneleiro() {
    }

    @Override
    public int getCarga() {
        return capacidadeCarga;
    }

    @Override
    public int getPassageiro() {
        return capacidadePessoa;
    }
    
    @Override
    public void setCarga() {
        capacidadeCarga = random.nextInt(200);
    }

    @Override
    public void setPassageiro() {
        capacidadePessoa = random.nextInt(6);
    }
    
}
