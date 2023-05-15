package pacote_codigos_fonte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
	
	//variaveis para login no banco
		String bd_usuario = "estudante";
		String bd_senha = "123456";
		String bd_url = "jdbc:mysql://localhost:3306/tinbook";
		
		public Connection cadastrarUsuario(String nome, String sobrenome,
				String email, String telefone, String cpf, String usuario, String senha) {
		
			//variaveis de declaracoes sql
			Statement statement = null;
			ResultSet resultSet = null;
			Connection c = null;
			
			try {
			//Criando conexao
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection(bd_url, bd_usuario, bd_senha);
			
			//criação declaracao SQL
			statement = c.createStatement(); 
			

			// Executa a query
			String query = String.format("insert into usuario ( USUA_NOME, USUA_SOBRENOME,USUA_CPF,"
					+ " USUA_EMAIL,USUA_TELEFONE,USUA_LOGIN, USUA_SENHA,USUA_ID) VALUES "
					+ "('%s','%s','%s','%s','%s',"
					+ "'%s','%s',NULL);",nome,sobrenome,cpf,email,telefone,usuario,senha);
			
			int linhasAfetadas = statement.executeUpdate(query);
			System.out.println("linhas Afetadas"+linhasAfetadas);

			
			}
			catch (Exception e) {
				System.out.println("erro" + e);
			}
			return c;
	}
}
