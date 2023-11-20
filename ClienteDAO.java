package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.ClientePF;
import modelo.ClientePJ;
import util.Conexao;

public class ClienteDAO {
	
	//Método para inserir um cliente
	public void inserirCliente(Cliente cliente) 
								throws SQLException {
		
	   
		
		String sql = 
				"INSERT INTO clientes" +
				   " (tipo, nomeSocial, email, nome, cpf, razao_social, cnpj)" + 
				" VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		//Acessa a conexão com o banco
		Connection conn = Conexao.getConexao();
		
		//Prepara o SQL para ser executado como uma instrução no banco de dados
		PreparedStatement ps = conn.prepareStatement(sql);
		
		//Seta os parâmetros
		ps.setString(1, cliente.getTipo());
		ps.setString(2, cliente.getNomeSocial());
		ps.setString(3, cliente.getEmail());
		
		if(cliente instanceof ClientePF) {
			ClientePF cliPF = (ClientePF) cliente;
			ps.setString(4, cliPF.getNomePF());
			ps.setString(5, cliPF.getCpf());
			ps.setString(6, "");
			ps.setString(7, "");
		} else if(cliente instanceof ClientePJ) {
			ClientePJ cliPJ = (ClientePJ) cliente;
			ps.setString(4, "");
			ps.setString(5, "");
			ps.setString(6, cliPJ.getRazaoSocial());
			ps.setString(7, cliPJ.getCnpj());
		}
		
		//Executa a instrução SQL na base de dados
		ps.execute();
	}
	
	public List<Cliente> listarClientes() throws SQLException {
		String sql = "SELECT * FROM clientes";
		
		List<Cliente> lista = new ArrayList<>();
		
		Connection conn = Conexao.getConexao();
		
		PreparedStatement stm = conn.prepareStatement(sql);
		
		ResultSet rs = stm.executeQuery();
		
		while(rs.next()) {
			Cliente cliente = null;
			
			String tipoCliente = rs.getString("tipo");
			if(tipoCliente.equals("F"))
				cliente = new ClientePF();
			else if(tipoCliente.equals("J"))
				cliente = new ClientePJ();
			
			cliente.setId(rs.getInt("id"));
			cliente.setNomeSocial(rs.getString("nomeSocial"));
			cliente.setEmail(rs.getString("email"));
			
			if(cliente instanceof ClientePF) {
				ClientePF cliPF = (ClientePF) cliente;
				cliPF.setNomePF(rs.getString("nome"));
				cliPF.setCpf(rs.getString("cpf"));
				
			} else if (cliente instanceof ClientePJ) {
				ClientePJ cliPJ = (ClientePJ) cliente;
				cliPJ.setRazaoSocial(rs.getString("Razão Social"));
				cliPJ.setCnpj(rs.getString("Cnpj"));
				
				
				
			}
		   lista.add(cliente);
		}
		return lista;
		
		
		
	}

}
