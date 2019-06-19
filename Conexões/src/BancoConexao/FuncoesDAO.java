package BancoConexao;

import entidades.Venda;
import entidades.Bebida;
import entidades.Funcionario;
import entidades.Gerente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncoesDAO {

    public static void cadastrarGerente(Gerente g) {
        Banco b = new Banco();
        if (b.conectar()) {
            String sql = "INSERT INTO Gerente("
                    + "Nome,"
                    + "CPF,"
                    + "Telefone,"
                    + "Endereco,"
                    + "Salario,"
                    + "Login,"
                    + "Senha"
                    + ") VALUES(?,?,?,?,?,?,?)"
                    + ";";
            PreparedStatement prepare = b.criarPreparedStatement(sql);
            try {
                prepare.setString(1, g.getNome());
                prepare.setString(2, g.getCpf());
                prepare.setString(3, g.getTelefone());
                prepare.setString(4, g.getEndereco());
                prepare.setDouble(5, g.getSalario());
                prepare.setString(6, g.getLogin());
                prepare.setString(7, g.getSenha());
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cadastrado!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar!");
            } finally {
                if (prepare != null) {
                    try {
                        prepare.close();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao fechar o banco");
                    }
                }
            }
        }
        b.desconectar();
    }

    public static void cadastrarFuncionario(Funcionario f) {
        Banco b = new Banco();
        if (b.conectar()) {
            String sql = "INSERT INTO Funcionario("
                    + "Nome,"
                    + "CPF,"
                    + "Telefone,"
                    + "Endereco,"
                    + "Salario,"
                    + "Login,"
                    + "Senha"
                    + ") VALUES(?,?,?,?,?,?,?)"
                    + ";";
            PreparedStatement prepare = b.criarPreparedStatement(sql);
            try {
                prepare.setString(1, f.getNome());
                prepare.setString(2, f.getCpf());
                prepare.setString(3, f.getTelefone());
                prepare.setString(4, f.getEndereco());
                prepare.setDouble(5, f.getSalario());
                prepare.setString(6, f.getLogin());
                prepare.setString(7, f.getSenha());
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cadastrado!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar!");
            } finally {
                if (prepare != null) {
                    try {
                        prepare.close();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao fechar o banco");
                    }
                }
            }
        }
        b.desconectar();
    }

    public static void cadastrarBebida(Bebida bb) {
        Banco b = new Banco();
        if (b.conectar()) {
            String sql = "INSERT INTO Bebidas("
                    + "Codigo,"
                    + "Preco,"
                    + "Ml,"
                    + "Fabricante,"
                    + "Quantidade,"
                    + "Validade"
                    + ") VALUES(?,?,?,?,?,?)"
                    + ";";
            PreparedStatement prepare = b.criarPreparedStatement(sql);
            try {
                prepare.setString(1, bb.getCodigo());
                prepare.setFloat(2, bb.getPreco());
                prepare.setInt(3, bb.getMl());
                prepare.setString(4, bb.getFabricante());
                prepare.setInt(5, bb.getQuantidade());
                prepare.setString(6, bb.getValidade());
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cadastrado!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar!");
            } finally {
                if (prepare != null) {
                    try {
                        prepare.close();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao fechar o banco");
                    }
                }
            }
        }
        b.desconectar();
    }

    public static void excluirBebida(String codigo) {
        Banco b = new Banco();
        b.conectar();

        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM Bebidas WHERE Codigo = ?;";

        try {
            preparedStatement = b.criarPreparedStatement(sql);
            preparedStatement.setString(1, codigo);

            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Gerente Removido com sucesso!");

        } catch (SQLException e) {
        } finally {
            try {
                preparedStatement.close();
                b.desconectar();
            } catch (SQLException ex) {
            }
        }
    }

    public static void excluirFuncionario(String cpf) {
        Banco b = new Banco();
        b.conectar();

        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM Funcionario WHERE CPF = ?;";

        try {
            preparedStatement = b.criarPreparedStatement(sql);
            preparedStatement.setString(1, cpf);

            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Gerente Removido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                b.desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void excluirGerente(String cpf) {
        Banco b = new Banco();
        b.conectar();

        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM Gerente WHERE CPF = ?;";

        try {
            preparedStatement = b.criarPreparedStatement(sql);
            preparedStatement.setString(1, cpf);

            preparedStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Gerente Removido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                b.desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static boolean loginFuncionario(String Login, String Senha) {
        Banco Conta = new Banco();
        Conta.conectar();

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT * FROM Funcionario WHERE Login = ? AND Senha = ?";

        try {
            preparedStatement = Conta.criarPreparedStatement(sql);
            preparedStatement.setString(1, Login);
            preparedStatement.setString(2, Senha);

            resultSet = preparedStatement.executeQuery();

            if (Login.equals(resultSet.getString("Login")) && Senha.equals(resultSet.getString("Senha"))) {
                return true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro, usúario não cadastrado");
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                Conta.desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    public static boolean loginGerente(String Login, String Senha) {
        Banco Conta = new Banco();
        Conta.conectar();

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT * FROM Gerente WHERE Login = ? AND Senha = ?";

        try {
            preparedStatement = Conta.criarPreparedStatement(sql);
            preparedStatement.setString(1, Login);
            preparedStatement.setString(2, Senha);

            resultSet = preparedStatement.executeQuery();

            if (Login.equals(resultSet.getString("Login")) && Senha.equals(resultSet.getString("Senha"))) {
                return true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro, usúario não cadastrado");
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                Conta.desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    public static ArrayList<Bebida> mostrarEstoque() {
        Banco b = new Banco();
        b.conectar();
        ArrayList<Bebida> estoque = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT * FROM Bebidas";

        try {
            preparedStatement = b.criarPreparedStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String codigo = resultSet.getString("Codigo");
                float preco = resultSet.getFloat("Preco");
                int ml = resultSet.getInt("Ml");
                String fabricante = resultSet.getString("Fabricante");
                String validade = resultSet.getString("Validade");
                int quantidade = resultSet.getInt("Quantidade");
                estoque.add(new Bebida(codigo, preco, ml, fabricante, quantidade, validade));
            }
            return estoque;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro, Não tem bebidas cadastradas");
            return null;
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                b.desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void cadastrarVenda(Venda v) {
        Banco b = new Banco();
        if (b.conectar()) {
            String sql = "INSERT INTO Vendas("
                    + "Id,"
                    + "Data,"
                    + "Venda"
                    + ") VALUES(?,?,?)"
                    + ";";
            PreparedStatement prepare = b.criarPreparedStatement(sql);
            try {
                prepare.setInt(1, v.getId());
                prepare.setString(2, v.getData());
                prepare.setString(3, v.getVendas());
                prepare.executeUpdate();
                JOptionPane.showMessageDialog(null, "Venda Cadastrada!");
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar!");
            } finally {
                if (prepare != null) {
                    try {
                        prepare.close();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao fechar o banco");
                    }
                }
            }
        }
        b.desconectar();
    }

    public static ArrayList<Venda> relatorioMensal(String data) {
        Banco Conta = new Banco();
        Conta.conectar();
        ArrayList<Venda> Lista = new ArrayList<Venda>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT * FROM Vendas WHERE Data = ?;";

        try {
            preparedStatement = Conta.criarPreparedStatement(sql);
            preparedStatement.setString(1, data);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("Id");
                String date = resultSet.getString("Data");
                String vendas = resultSet.getString("Venda");
                Lista.add(new Venda(id, date, vendas));
            }
            return Lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " + e);
            return null;
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                Conta.desconectar();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static boolean atualizarBebida(Bebida bb) {
        Banco b = new Banco();
        b.conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE Bebidas SET Preco = ?, Ml = ?, Fabricante = ?, Quantidade = ?, Validade = ? WHERE Codigo = ?;";

        try {
            preparedStatement = b.criarPreparedStatement(sql);
            preparedStatement.setFloat(1, bb.getPreco());
            preparedStatement.setInt(2, bb.getMl());
            preparedStatement.setString(3, bb.getFabricante());
            preparedStatement.setInt(4, bb.getQuantidade());
            preparedStatement.setString(5, bb.getValidade());
            preparedStatement.setString(6, bb.getCodigo());
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados Atualizados ");
            return true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro " + e);
            return false;
        }
    }

    public static Venda buscarVenda(int id) {
        Banco b = new Banco();
        b.conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT * FROM Vendas WHERE Id = ?";

        try {
            preparedStatement = b.criarPreparedStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            int ide = resultSet.getInt("Id");
            String date = resultSet.getString("Data");
            String vendas = resultSet.getString("Venda");
            return new Venda(ide, date, vendas);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro, Não tem bebidas cadastradas");
            return null;
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                b.desconectar();
            } catch (SQLException ex) {
            }
        }
    }

    public static Bebida buscarBebida(String codigo) throws SQLException {
        Banco b = new Banco();
        b.conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        String sql = "SELECT * FROM Bebidas WHERE Codigo = ?;";

        preparedStatement = b.criarPreparedStatement(sql);
        preparedStatement.setString(1, codigo);
        resultSet = preparedStatement.executeQuery();

        if (!resultSet.next()) {
            resultSet.close();
            preparedStatement.close();
            b.desconectar();
            return null;
        } else {
            Bebida bb =  new Bebida(resultSet.getString("Codigo"), resultSet.getFloat("Preco"), resultSet.getInt("Ml"), resultSet.getString("Fabricante"), resultSet.getInt("Quantidade"), resultSet.getString("Validade"));
            preparedStatement.close();
            b.desconectar();
            return bb;
        }

    }
}
