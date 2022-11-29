package praticaFinal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutosB implements ProdutosA{

	    public ProdutosB() {
	    }

	    public static Arvore createTree(String categoria) {
	        String sql = "SELECT * FROM produto WHERE categoria_1 LIKE '"+categoria+"'" ;
	        Arvore arv = new Arvore();
	        try (Connection connection = Conexao.getConnection()) {
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            ResultSet rs = preparedStatement.executeQuery();
	            while (rs.next()) {
	                int id = rs.getInt("id");
	                arv.inserir(new Elemento(id));
	            }
	            preparedStatement.close();
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	        return arv;
	    }


	    @Override
	    public void delete(int id) {
	        try(Connection connection = Conexao.getConnection()){
	            String sql = "DELETE FROM produtos WHERE id = ?";
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setLong(1, id);
	            preparedStatement.executeUpdate();
	            preparedStatement.close();
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    }

	    @Override
	    public List<Produtos> procurarPorCat(String categoria) {
	        Arvore arv = new Arvore();
	        String sql = "SELECT * FROM produto WHERE categoria1 LIKE '"+categoria+"'" ;


	        List<Produtos> produtos = new ArrayList<>();

	        try (Connection connection = Conexao.getConnection()) {
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            ResultSet rs = preparedStatement.executeQuery();
	            while (rs.next()) {

	                int id = rs.getInt("id");
	                String titulo = rs.getString("titulo");
	                String categoria_1 = rs.getString("categoria_1");

	                Produtos produto = new Produtos(id, titulo, categoria_1);

	                produtos.add(produto);
	            }
	            preparedStatement.close();
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }

	        return produtos;
	    }

	    public static String retornaNome(int id){
	        String sql = "SELECT * FROM produto WHERE id = "+id;

	        String nome = null;
	        try (Connection connection = Conexao.getConnection()) {
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            ResultSet rs = preparedStatement.executeQuery();
	            while (rs.next()){
	                nome = rs.getString("titulo");
	            }
	            preparedStatement.close();
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }

	        return nome;
	    }

}

