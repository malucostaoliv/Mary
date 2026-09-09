/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malu;

/**
 *
 * @author maria62977236
 */
public class Escola {
    
    public static void main(String[] args) {
        
       Aluno aluno1 = new Aluno("Marcos", "Gomes", "Pardo", "Noturno", 2006,"Ceilândia-DF");
        
       Aluno aluno2 = new Aluno ("Marina", "Barbosa", "Branca", "Vespertino", 2012,"São Paulo-SP");
       
       Aluno aluno3 = new Aluno ("Marcia", "Silva", "Negra", "Matutino", 2010, "Nova York-EUA");
       
       Aluno aluno4 = new Aluno ("Felix", "Almeida", "Pardo", "Noturno", 2000,"Seul-Coreia do Sul");
   
       aluno1.calcularidade();
       aluno2.calcularidade();
       aluno3.calcularidade();
       aluno4.calcularidade();
       
       System.out.println("Nome do aluno: " + aluno1.nome);
       System.out.println("Sobrenome do aluno: " + aluno1.sobrenome);
       System.out.println("Cor do aluno: " + aluno1.cor);
       System.out.println("Turno do aluno: " + aluno1.turno);
       System.out.println("Data de nascimento do aluno: " + aluno1.datadenascimento);
       System.out.println("Idade do aluno: " + aluno1.idade);
       System.out.println("Endereço do aluno: " + aluno1.endereco);
       
       System.out.println("Nome do aluno: " + aluno2.nome);
       System.out.println("Sobrenome do aluno: " + aluno2.sobrenome);
       System.out.println("Cor do aluno: " + aluno2.cor);
       System.out.println("Turno do aluno: " + aluno2.turno);
       System.out.println("Data de nascimento do aluno: " + aluno2.datadenascimento);
       System.out.println("Idade do aluno: " + aluno2.idade);
       System.out.println("Endereço do aluno: " + aluno2.endereco);
       
       System.out.println("Nome do aluno: " + aluno3.nome);
       System.out.println("Sobrenome do aluno: " + aluno3.sobrenome);
       System.out.println("Cor do aluno: " + aluno3.cor);
       System.out.println("Turno do aluno: " + aluno3.turno);
       System.out.println("Data de nascimento do aluno: " + aluno3.datadenascimento);
       System.out.println("Idade do aluno: " + aluno3.idade);
       System.out.println("Endereço do aluno: " + aluno3.endereco);
       
       System.out.println("Nome do aluno: " + aluno4.nome);
       System.out.println("Sobrenome do aluno: " + aluno4.sobrenome);
       System.out.println("Cor do aluno: " + aluno4.cor);
       System.out.println("Turno do aluno: " + aluno4.turno);
       System.out.println("Data de nascimento do aluno: " + aluno4.datadenascimento);
       System.out.println("Idade do aluno: " + aluno4.idade);
       System.out.println("Endereço do aluno: " + aluno4.endereco);
    }
    
}
