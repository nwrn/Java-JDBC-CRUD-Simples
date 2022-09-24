package br.com.montadora.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	public static void main(String[] args) throws SQLException {
		Connection conexao = null;
		String url = "jdbc:oracle:thin:@";
		conexao = DriverManager.getConnection(url, "", "");
		System.out.println("Conex�o aberta.");
		conexao.close();
	}
}
