/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malu;

/**
 *
 * @author maria62977236
 */
public class Carro {

    String modelo;
    String cor;
    double velocidade;
    
    public Carro (String modeloInformado, String corInformada){
    modelo = modeloInformado;
    cor = corInformada;
    velocidade = 0;
    }
    
    public void acelerar(){
        velocidade = velocidade + 10;
    } 
    
    public void frear(){
        velocidade = velocidade - 10;
        System.out.println("velocidade é :" + velocidade);
    }
    
    public static void main (String[] arga){
        
    Carro carro1 = new Carro("BMW", "Preto");
    Carro carro2 = new Carro("Fiat","Roxo");
     
      
     carro1.acelerar();
     carro2.acelerar();
     carro1.acelerar();
     carro1.acelerar();
     carro1.frear();
     
     System.out.println("Modelo do carro: " + carro1.modelo);
     System.out.println("Cor do  carro: " + carro1.cor);
     System.out.println("Velocidade carro1: " + carro1.velocidade);
     
     System.out.println("Modelo do carro: " + carro2.modelo);
     System.out.println("Cor do  carro: " + carro2.cor);
     System.out.println("Velocidade carro: " + carro2.velocidade);
     
    }    
}