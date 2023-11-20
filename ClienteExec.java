package execucao;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.ClienteDAO;
import modelo.Cliente;
import modelo.ClientePF;
import modelo.ClientePJ;

public class ClienteExec {

	public static void main(String[] args) 
			throws SQLException {
		Scanner leitor = new Scanner(System.in);
		
		Integer opcao = null;
		do {
			System.out.println();
			System.out.println("------MENU------");
			System.out.println("[1] Inserir cliente pessoa física");
			System.out.println("[2] Inserir cliente pessoa jurídica");
			System.out.println("[3] Listar clientes");
			System.out.println("[4] Buscar cliente");
			System.out.println("[5] Excluir cliente");
			System.out.println("[0] Sair");
			
			System.out.print("Informe a opção: ");
			opcao = Integer.parseInt(leitor.nextLine());
			
			switch (opcao) {
				case 1: 
					inserirClientePF(leitor);
					break;
					
				case 2: 
					inserirClientePJ(leitor);
					break;
					
				case 3: 
					listarClientes();
					break;
					
				case 4: 
					buscarCliente(leitor);
					break;
					
				case 5: 
					excluirCliente(leitor);
					break;
					
				case 0: 
					System.out.println("Programa encerrado!");
					break;
					
				default:
					System.out.println("Opção inválida!");
			} //Switch
			
		} while(opcao != 0);
		
		leitor.close();
	}

	//Métodos
	private static void inserirClientePF(Scanner leitor) 
			throws SQLException {
		ClientePF cliPF = new ClientePF();
		
		System.out.print("Informe o nome social: ");
		cliPF.setNomeSocial(leitor.nextLine());
		
		System.out.print("Informe o e-mail: ");
		cliPF.setEmail(leitor.nextLine());
		
		System.out.print("Informe o nome: ");
		cliPF.setNomePF(leitor.nextLine());
		
		System.out.print("Informe o CPF: ");
		cliPF.setCpf(leitor.nextLine());
		
		//Persistir o Objeto - salvar no banco
		ClienteDAO cliDAO = new ClienteDAO();
		cliDAO.inserirCliente(cliPF);
		
		System.out.println("Cliente Pessoa Física inserido com sucesso!");
	}
	
	private static void inserirClientePJ(Scanner leitor) 
			throws SQLException {
		//1- Ler os dados do cliente (Scanner) para o objeto
		ClientePJ cliPJ = new ClientePJ();
		
		System.out.print("Informe o nome social: ");
		cliPJ.setNomeSocial(leitor.nextLine());
		
		System.out.print("Informe o e-mail: ");
		cliPJ.setEmail(leitor.nextLine());
		
		System.out.print("Informe a razão social: ");
		cliPJ.setRazaoSocial(leitor.nextLine());
		
		System.out.print("Informe o CNPJ: ");
		cliPJ.setCnpj(leitor.nextLine());
		
		//2- Criar o objeto ClienteDAO
		ClienteDAO cliDAO = new ClienteDAO();		
		
		//3- Charmar o método do ClienteDAO para inserir o cliente
		cliDAO.inserirCliente(cliPJ);
		
		System.out.println("Cliente Pessoa Jurídica inserido com sucesso!");		
	}
	
	private static void listarClientes() throws SQLException {
		ClienteDAO cliDAO = new ClienteDAO();
		 List<Cliente> lista = cliDAO.listarClientes();
		 
		 for(Cliente c : lista ) {
			 System.out.println(c.getDados());
		 }
		
	}
	
	private static void buscarCliente(Scanner leitor) {
		System.out.println("Buscar clientes");
	}
	
	private static void excluirCliente(Scanner leitor) {
		System.out.println("Excluir clientes");
	}

}
