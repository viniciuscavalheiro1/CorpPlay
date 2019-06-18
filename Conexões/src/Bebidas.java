/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nathan
 */
public class Bebidas {
    public String Codigo;
    public float preco;
    public int ml;
    public String fabricante;
    public int quantidade;
    public String validade;
    public Bebidas(String Codigo, float preco, int ml, String fabricante, int quantidade, String validade){
       this.Codigo = Codigo;
       this.fabricante = fabricante;
       this.ml = ml;
       this.preco = preco;
       this.quantidade = quantidade;
       this.validade = validade;
    }
}
