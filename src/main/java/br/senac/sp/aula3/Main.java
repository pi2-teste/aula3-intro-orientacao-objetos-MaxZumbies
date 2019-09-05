/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula3;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas.mendes
 */
public class Main {
    
    public static void assertEqual(int a, int b) {
        if (!(a == b)){
            throw new Error("Esperava que "+a+" fosse igual a "+b);
        }
    }
    public static void assertEqual(String a, String b) {
        if (!a.equals(b)) {
            throw new Error("EU esperava que "+a+" fosse igual a "+b);
        }
    }

/*
    public static void testar_atributos() {
        Carro carro1 =  new Carro();
        Carro carro2 =  new Carro();
        carro1.setModelo("Fiat Uno");
        assertEqual(carro1.getModelo(), "Fiat Uno");
        carro2.setModelo("Ford Escort");
        assertEqual(carro1.getModelo(), "Fiat Uno");
        assertEqual(carro2.getModelo(), "Ford Escort");
        carro2.setCor("prata");
        assertEqual(carro2.getCor(), "prata");
        System.out.println("Parabéns, o teste de atributos está correto!");  
    }
*/
/*
    public static void testar_descricao() {
        Carro carro1 =  new Carro();
        Carro carro2 =  new Carro();
        carro1.setModelo("Fiat Uno");
        carro2.setModelo("Ford Escort");
        carro2.setCor("prata");
        assertEqual(carro2.descreve(), "Um Ford Escort na cor prata");
        assertEqual(carro1.descreve(),"Um Fiat Uno");
        Carro carro3 = new Carro();
        assertEqual(carro3.descreve(), "Um carro");
        System.out.println("Parabéns, o teste da descrição está correto!");
    }
*/
/*    
    public static void testar_gasolina1() {
        Carro carro1 = new Carro();
        assertEqual(carro1.getGasolina(), 20);
        carro1.abastece(10);
        assertEqual(carro1.getGasolina(), 30);
        System.out.println("Parabéns, o teste 1 da gasolina está correto!");
    }
*/
/*  
    public static void testar_gasolina2() {
        Carro carro1 = new Carro();
        assertEqual(carro1.getGasolina(), 20);
        carro1.abastece(15);
        assertEqual(carro1.getGasolina(), 35);
        carro1.abastece(10);
        assertEqual(carro1.getGasolina(), 40);
        System.out.println("Parabéns, o teste 2 da gasolina está correto!");
    }
*/
/*    
    public static void testar_max_gasolina() {
        Carro carro1 = new Carro(30);
        Carro carro2 = new Carro(50);
        assertEqual(carro1.getGasolina(), 20);
        carro1.abastece(15);
        assertEqual(carro1.getGasolina(), 30);
        carro1.abastece(10);
        assertEqual(carro1.getGasolina(), 30);
        assertEqual(carro2.getGasolina(), 20);
        carro2.abastece(15);
        assertEqual(carro2.getGasolina(), 35);
        carro2.abastece(10);
        assertEqual(carro2.getGasolina(), 45);
        System.out.println("Parabéns, o teste max gasolina está correto!");
    }
*/
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //testar_atributos();
        //testar_descricao();
        //testar_gasolina1();
        //testar_gasolina2();
        //testar_max_gasolina();
    }
    
}
