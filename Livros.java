/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malu;

/**
 *
 * @author maria62977236
 */
public class Livros {
    String titulo;
    String autor;
    String genero;
    int anodepublicacao;
    int anos;
    String paginas;
    String preco;
    
    public Livros(String tituloRecebido, String autorRecebido, String generoRecebida, int anodepublicacaoRecebido, String paginasRecebido, String precoRecebido ) {
titulo = tituloRecebido;
autor = autorRecebido;
genero = generoRecebida;
anodepublicacao = anodepublicacaoRecebido;
paginas = paginasRecebido;
preco = precoRecebido;
anos = 0;
} 
   
 public void calculos(){
     anos = 2026 - anodepublicacao;
 }       
}
