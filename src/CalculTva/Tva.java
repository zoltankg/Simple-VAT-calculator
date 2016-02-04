/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculTva;

import java.util.Scanner;


/**
 *
 * @author Agu
 */
public class Tva {
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Introduceti pretul produsului: ");
        int price = sc.nextInt();
        System.out.println("Valoare TVA: ");
        int vat = sc.nextInt();
        
        Calcul t = new Calcul(price, vat);
        System.out.println("Pretul produsului este " + t.getPret() + " lei, din care tva "
                + t.calculezTva() + " lei");
    };
};
