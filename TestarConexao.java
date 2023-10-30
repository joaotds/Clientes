package execucao;

import java.sql.Connection;

import util.Conexao;

public class TestarConexao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexao = Conexao.getConexao();
		System.out.println("Conexao realizada com sucesso!");
	}

}
