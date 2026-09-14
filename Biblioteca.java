/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.malu;

/**
 *
 * @author maria62977236
 */
public class Biblioteca {
     public static void main(String[] args) {
        
        Livros livro1 = new Livros("A seleção", "Kiera Cass", "Romance", 2012, "363", "R$46,45");
        Livros livro2 = new Livros("Percy Jackson", "Rick Riordan", "Mitologia", 2023, "400", "R$36,00");
        Livros livro3 = new Livros("A menina que roubava livros", "Markus zusak", " ficção histórica", 2013, "480", "R$47,40");
        Livros livro4 = new Livros("A biblioteca da meia noite", "Matt Haig", "ficção fantástica", 2021, "308","R$41,57");
        Livros livro5 = new Livros("É assim que acaba", "Colleen Hoover", "Drama romance", 2018, "368", "R$40,72");
        Livros livro6 = new Livros("Veríty", "Colleen Hoover", "Romance", 2020, "320","R$35,14");
        Livros livro7 = new Livros("A cirurgiã", "Leslie Wolfe","Thriller Psicológico", 2024, "224", "R$25,90");
        Livros livro8 = new Livros("Imperfeitos", "Christina Lauren", "Romance", 2022, "256", "R$17,27");
        Livros livro9 = new Livros("Como matei minha querida família","Bella Mackie", "ficção policial", 2023, "256","R$54,43");
        Livros livro10 = new Livros("O homem mais rico da Babilônia", "George S.Clason", "não ficção", 2017, "160", "R$22,50");
        Livros livro11 = new Livros("Melhor do que nos filmes", "Lynn Painter", "comédia romântica", 2023, "352","R$43,39");
        Livros livro12 = new Livros("Amor e gelato", "Jenna Evans Welch", "Romance", 2017, "320", "R$46,42");
        Livros livro13 = new Livros("A hora da estrela", "Clarice Lispector", "Romance", 2020, "88","R$25,49");
        Livros livro14 = new Livros("Era uma vez um coração partido", "Stephanie Garber", "Fantasia", 2022, "352", "R$49,78");
        Livros livro15 = new Livros("O pequeno principe", "Antoine de saint-exupéry", "infantojuvenil", 2024, "96", "R$13,20");
        Livros livro16 = new Livros("O despertar da lua caida", "Sarah A.Parker", "romance", 2024, "560", "R$65,38");
        
        livro1.calculos();
        livro2.calculos();
        livro3.calculos();
        livro4.calculos();
        livro5.calculos();
        livro6.calculos();
        livro7.calculos();
        livro8.calculos();
        livro9.calculos();
        livro10.calculos();
        livro11.calculos();
        livro12.calculos();
        livro13.calculos();
        livro14.calculos();
        livro15.calculos();
        livro16.calculos();
        
        livro16.anos = 25;
        
       System.out.println("Titulo do livro: " + livro1.titulo);
       System.out.println("Autor do livro: " + livro1.autor);
       System.out.println("Genero do livro: " + livro1.genero);
       System.out.println("Ano de publicação do livro: " + livro1.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro1.paginas);
       System.out.println("Preço do livro: " + livro1.preco);
       System.out.println("Idade do livro: " + livro1.anos);
       
       System.out.println("Titulo do livro: " + livro2.titulo);
       System.out.println("Autor do livro: " + livro2.autor);
       System.out.println("Genero do livro: " + livro2.genero);
       System.out.println("Ano de publicação do livro: " + livro2.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro2.paginas);
       System.out.println("Preço do livro: " + livro2.preco);
       System.out.println("Idade do livro: " + livro2.anos);
       
       System.out.println("Titulo do livro: " + livro3.titulo);
       System.out.println("Autor do livro: " + livro3.autor);
       System.out.println("Genero do livro: " + livro3.genero);
       System.out.println("Ano de publicação do livro: " + livro3.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro3.paginas);
       System.out.println("Preço do livro: " + livro3.preco);
       System.out.println("Idade do livro: " + livro3.anos);
    
       System.out.println("Titulo do livro: " + livro4.titulo);
       System.out.println("Autor do livro: " + livro4.autor);
       System.out.println("Genero do livro: " + livro4.genero);
       System.out.println("Ano de publicação do livro: " + livro4.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro4.paginas);
       System.out.println("Preço do livro: " + livro4.preco);
       System.out.println("Idade do livro: " + livro4.anos);
       
       System.out.println("Titulo do livro: " + livro5.titulo);
       System.out.println("Autor do livro: " + livro5.autor);
       System.out.println("Genero do livro: " + livro5.genero);
       System.out.println("Ano de publicação do livro: " + livro5.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro5.paginas);
       System.out.println("Preço do livro: " + livro5.preco);
       System.out.println("Idade do livro: " + livro5.anos);
       
       System.out.println("Titulo do livro: " + livro6.titulo);
       System.out.println("Autor do livro: " + livro6.autor);
       System.out.println("Genero do livro: " + livro6.genero);
       System.out.println("Ano de publicação do livro: " + livro6.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro6.paginas);
       System.out.println("Preço do livro: " + livro6.preco);
       System.out.println("Idade do livro: " + livro6.anos);
       
       System.out.println("Titulo do livro: " + livro7.titulo);
       System.out.println("Autor do livro: " + livro7.autor);
       System.out.println("Genero do livro: " + livro7.genero);
       System.out.println("Ano de publicação do livro: " + livro7.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro7.paginas);
       System.out.println("Preço do livro: " + livro7.preco);
       System.out.println("Idade do livro: " + livro7.anos);
       
       System.out.println("Titulo do livro: " + livro8.titulo);
       System.out.println("Autor do livro: " + livro8.autor);
       System.out.println("Genero do livro: " + livro8.genero);
       System.out.println("Ano de publicação do livro: " + livro8.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro8.paginas);
       System.out.println("Preço do livro: " + livro8.preco);
       System.out.println("Idade do livro: " + livro8.anos);
       
       System.out.println("Titulo do livro: " + livro9.titulo);
       System.out.println("Autor do livro: " + livro9.autor);
       System.out.println("Genero do livro: " + livro9.genero);
       System.out.println("Ano de publicação do livro: " + livro9.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro9.paginas);
       System.out.println("Preço do livro: " + livro9.preco);
       System.out.println("Idade do livro: " + livro9.anos);
       
       System.out.println("Titulo do livro: " + livro10.titulo);
       System.out.println("Autor do livro: " + livro10.autor);
       System.out.println("Genero do livro: " + livro10.genero);
       System.out.println("Ano de publicação do livro: " + livro10.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro10.paginas);
       System.out.println("Preço do livro: " + livro10.preco);
       System.out.println("Idade do livro: " + livro10.anos);
       
       System.out.println("Titulo do livro: " + livro11.titulo);
       System.out.println("Autor do livro: " + livro11.autor);
       System.out.println("Genero do livro: " + livro11.genero);
       System.out.println("Ano de publicação do livro: " + livro11.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro11.paginas);
       System.out.println("Preço do livro: " + livro11.preco);
       System.out.println("Idade do livro: " + livro11.anos);
       
       System.out.println("Titulo do livro: " + livro12.titulo);
       System.out.println("Autor do livro: " + livro12.autor);
       System.out.println("Genero do livro: " + livro12.genero);
       System.out.println("Ano de publicação do livro: " + livro12.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro12.paginas);
       System.out.println("Preço do livro: " + livro12.preco);
       System.out.println("Idade do livro: " + livro12.anos);
       
       System.out.println("Titulo do livro: " + livro13.titulo);
       System.out.println("Autor do livro: " + livro13.autor);
       System.out.println("Genero do livro: " + livro13.genero);
       System.out.println("Ano de publicação do livro: " + livro13.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro13.paginas);
       System.out.println("Preço do livro: " + livro13.preco);
       System.out.println("Idade do livro: " + livro13.anos);
       
       System.out.println("Titulo do livro: " + livro14.titulo);
       System.out.println("Autor do livro: " + livro14.autor);
       System.out.println("Genero do livro: " + livro14.genero);
       System.out.println("Ano de publicação do livro: " + livro14.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro14.paginas);
       System.out.println("Preço do livro: " + livro14.preco);
       System.out.println("Idade do livro: " + livro14.anos);
       
       System.out.println("Titulo do livro: " + livro15.titulo);
       System.out.println("Autor do livro: " + livro15.autor);
       System.out.println("Genero do livro: " + livro15.genero);
       System.out.println("Ano de publicação do livro: " + livro15.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro15.paginas);
       System.out.println("Preço do livro: " + livro15.preco);
       System.out.println("Idade do livro: " + livro15.anos);
       
       System.out.println("Titulo do livro: " + livro16.titulo);
       System.out.println("Autor do livro: " + livro16.autor);
       System.out.println("Genero do livro: " + livro16.genero);
       System.out.println("Ano de publicação do livro: " + livro16.anodepublicacao);
       System.out.println("Quantidade de paginas do livros: " + livro16.paginas);
       System.out.println("Preço do livro: " + livro16.preco);
       System.out.println("Idade do livro: " + livro16.anos);
    }
}
