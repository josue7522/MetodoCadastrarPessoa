package com.company.exercicio25_05.SobreCarga;

public class TesteCadastro {
    public static void main(String[] args) {
        CadastrarPessoa cadastro = new CadastrarPessoa();
        Pessoa pessoa = new Pessoa ("Josué" , 21);
        cadastro.cadastrar(pessoa);
        cadastro.cadastrar("Maria" , 25);
        cadastro.cadastrar("Rodrigo");
        
    }
}
