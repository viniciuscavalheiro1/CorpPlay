package conexao;

import BancoConexao.Banco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Cadastrar {
    public Cadastrar(){
 
    }
    public void CadastrarGerente(String nome, String cpf, String telefone, String endereco, float salario, String login,String senha){
        Banco b = new Banco();
        if(b.conectar()){
            String sql = "INSERT INTO Gerente("
            + "Nome,"
            + "CPF,"
            + "Telefone,"
            + "Endereco,"
            + "Salario,"
            + "Login,"
            + "Senha"
            + ") VALUES(?,?,?,?,?,?,?)"
            +";";
            PreparedStatement prepare = b.criarPreparedStatement(sql);
            try{
                prepare.setString(1,nome);
                prepare.setString(2,cpf);
                prepare.setString(3,telefone);
                prepare.setString(4,endereco);
                prepare.setFloat(5,salario);
                prepare.setString(6,login);
                prepare.setString(7,senha);
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(null,"Cadastrado!");
            }catch(SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Erro ao Cadastrar!");
            }finally{
                if(prepare != null){
                    try {
                        prepare.close();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Erro ao fechar o banco");
                    }
                }
            }
        }
        b.desconectar();
    }
    public void CadastrarFuncionario(String nome, String cpf, String telefone, String endereco, float salario, String login,String senha){
        Banco b = new Banco();
        if(b.conectar()){
            String sql = "INSERT INTO Funcionario("
            + "Nome,"
            + "CPF,"
            + "Telefone,"
            + "Endereco,"
            + "Salario,"
            + "Login,"
            + "Senha"
            + ") VALUES(?,?,?,?,?,?,?)"
            +";";
            PreparedStatement prepare = b.criarPreparedStatement(sql);
            try{
                prepare.setString(1,nome);
                prepare.setString(2,cpf);
                prepare.setString(3,telefone);
                prepare.setString(4,endereco);
                prepare.setFloat(5,salario);
                prepare.setString(6,login);
                prepare.setString(7,senha);
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(null,"Cadastrado!");
            }catch(SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Erro ao Cadastrar!");
            }finally{
                if(prepare != null){
                    try {
                        prepare.close();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Erro ao fechar o banco");
                    }
                }
            }
        }
        b.desconectar();
    }
    public void CadastrarBebida(String Codigo, float preco, int ml, String fabricante, int quantidade, String validade){
        Banco b = new Banco();
        if(b.conectar()){
            String sql = "INSERT INTO Bebidas("
            + "Codigo,"
            + "Preco,"
            + "Ml,"
            + "Fabricante,"
            + "Quantidade,"
            + "Validade"
            + ") VALUES(?,?,?,?,?,?)"
            +";";
            PreparedStatement prepare = b.criarPreparedStatement(sql);
            try{
                prepare.setString(1,Codigo);
                prepare.setFloat(2,preco);
                prepare.setInt(3,ml);
                prepare.setString(4,fabricante);
                prepare.setInt(5,quantidade);
                prepare.setString(6,validade);
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(null,"Bebida Cadastrada!");
            }catch(SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Erro ao Cadastrar!");
            }finally{
                if(prepare != null){
                    try {
                        prepare.close();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Erro ao fechar o banco");
                    }
                }
            }
        }
        b.desconectar();
    }
    public void ExcluirBebida(String codigo){
        Banco b = new Banco();
        b.conectar();
        
        PreparedStatement preparedStatement = null;
        
        String sql = "DELETE FROM Bebidas WHERE Codigo = ?;";
        
        try{
            preparedStatement = b.criarPreparedStatement(sql);
            preparedStatement.setString(1, codigo);
            
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Bebida Removida com sucesso!");
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                preparedStatement.close();
                b.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }    
    }
    
    public void ExcluirFuncionario(String cpf){
        Banco b = new Banco();
        b.conectar();
        
        PreparedStatement preparedStatement = null;
        
        String sql = "DELETE FROM Funcionario WHERE CPF = ?;";
        
        try{
            preparedStatement = b.criarPreparedStatement(sql);
            preparedStatement.setString(1, cpf);
            
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Funcionário Removido com sucesso!");
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                preparedStatement.close();
                b.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }    
    }
    public void ExcluirGerente(String cpf){
        Banco b = new Banco();
        b.conectar();
        
        PreparedStatement preparedStatement = null;
        
        String sql = "DELETE FROM Gerente WHERE CPF = ?;";
        
        try{
            preparedStatement = b.criarPreparedStatement(sql);
            preparedStatement.setString(1, cpf);
            
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Gerente Removido com sucesso!");
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                preparedStatement.close();
                b.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }    
    }
    public boolean LoginFuncionario(String Login, String Senha){
        Banco Conta = new Banco();
        Conta.conectar();
        
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT * FROM Funcionario WHERE Login = ? AND Senha = ?";
        
        try{
            preparedStatement = Conta.criarPreparedStatement(sql);
            preparedStatement.setString(1, Login);
            preparedStatement.setString(2, Senha);
            
            resultSet = preparedStatement.executeQuery();
            
            if(Login.equals(resultSet.getString("Login")) && Senha.equals(resultSet.getString("Senha"))){
                JOptionPane.showMessageDialog(null,"Logado!");
                return true;
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro, usúario não cadastrado");
        }finally{
            try{
                resultSet.close();
                preparedStatement.close();
                Conta.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();

            }
        }
        return false;
    }
    public boolean LoginGerente(String Login, String Senha){
        Banco Conta = new Banco();
        Conta.conectar();
        
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT * FROM Gerente WHERE Login = ? AND Senha = ?";
        
        try{
            preparedStatement = Conta.criarPreparedStatement(sql);
            preparedStatement.setString(1, Login);
            preparedStatement.setString(2, Senha);
            
            resultSet = preparedStatement.executeQuery();
            
            if(Login.equals(resultSet.getString("Login")) && Senha.equals(resultSet.getString("Senha"))){
                JOptionPane.showMessageDialog(null,"Logado!");
                return true;
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro, usúario não cadastrado");
        }finally{
            try{
                resultSet.close();
                preparedStatement.close();
                Conta.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return false;
    }
    public ArrayList<Bebidas> MostrarEstoque(){
        Banco b = new Banco();
        b.conectar();
        ArrayList<Bebidas> estoque = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String sql = "SELECT * FROM Bebidas";
        
        try{
            preparedStatement = b.criarPreparedStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
            String codigo = resultSet.getString("Codigo");
            float preco = resultSet.getFloat("Preco");
            int ml = resultSet.getInt("Ml");
            String fabricante = resultSet.getString("Fabricante");
            String validade = resultSet.getString("Validade");
            int quantidade = resultSet.getInt("Quantidade");
            estoque.add(new Bebidas(codigo,preco,ml,fabricante,quantidade,validade));
        }
            return estoque;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Erro, Não tem bebidas cadastradas");
            return null;
        }finally{
            try{
                resultSet.close();
                preparedStatement.close();
                b.desconectar();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}
