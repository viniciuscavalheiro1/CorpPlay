package conexao;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Principal {

    public static void mainNao(){
        Cadastrar cad = new Cadastrar();
        //cad.CadastrarGerente("vinicius", "123123123123", "(99)9999999", "Rua Antonio de matos", 10000, "root", "root");
        ArrayList<Bebidas> estoque = new ArrayList<Bebidas>();
        cad.ExcluirBebida("Caralhoooooo");
        estoque = cad.MostrarEstoque();
        for (Bebidas b : estoque){
            System.out.println("codigo: " + b.Codigo);
        }
        
    }
}