/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculTva;

/**
 *
 * @author Agu
 */
public class Calcul {

    private int pret;
    private int tva;

    public Calcul(int pret, int tva) {
        this.pret = pret;
        this.tva = tva;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getTva() {
        return tva;
    }

    public void setTva(int tva) {
        this.tva = tva;
    }

    public double calculezTva() {
        double tvap;
        tvap = pret * tva / 100;
        return tvap;
    }
}
