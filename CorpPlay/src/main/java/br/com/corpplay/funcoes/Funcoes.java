package br.com.corpplay.funcoes;

import br.com.corpplay.pessoa.Pessoa;

public class Funcoes {
    
    /*Cadastrar funcionario*/
    public boolean cadastrarFuncionario(Pessoa pessoa) {
        if(pessoa.getCpf().isEmpty()){
            return false;
        }
        /*Aqui pode mandar ou uma string para o conexão ou acessar os dados
        pelo objeto Pessoa*/
        
        return true;
    }
    
    /*Alterar Funcionario*/
    public boolean alterarFuncionario(Pessoa pessoa) {
        return false;
    }
}
