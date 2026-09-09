/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malu;

/**
 *
 * @author maria62977236
 */
public class Aluno {
    String nome;
    String sobrenome;
    String cor;
    String turno;
    int datadenascimento;
    int idade;
    String endereco;
    
    
    
    public Aluno(String nomeRecebido, String sobrenomeRecebido, String corRecebida, String turnoRecebido, int datadenascimentoRecebido, String enderecoRecebido ) {
nome = nomeRecebido;
sobrenome = sobrenomeRecebido;
cor = corRecebida;
turno = turnoRecebido;
datadenascimento = datadenascimentoRecebido;
endereco = enderecoRecebido;
idade = 0;
}
    public void calcularidade(){
        idade = 2026 - datadenascimento;
    }
}
