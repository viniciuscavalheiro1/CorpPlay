package br.com.corpplay.pessoa;


public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private double salario;
    private String login;
    private String senha;

    public Pessoa(String nome, String cpf, String telefone, String endereco, double salario, String login, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.salario = salario;
        this.login = login;
        this.senha = senha;
    }
    
    
}
