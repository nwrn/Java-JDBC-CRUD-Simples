package br.com.montadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.montadora.beans.Carro;

public class CarroDAO {

	private Connection con;

	public CarroDAO(Connection con) {
		setCon(con);
	}

	public String inserir(Carro carro) {
		String sql = "insert into carro(modelo, capacidadecombustivel, quantidadejanela) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getModelo());
			ps.setInt(2, carro.getCapacidadeCombustivel());
			ps.setInt(3, carro.getQuantidadeJanela());
			if (ps.executeUpdate() > 0) {
				return "Inserido ao Carro com sucesso.";
			} else {
				return "Erro ao inserir do Carro.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String alterarModelo(Carro carro) {
		String sql = "update carro set modelo = ? where nome = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getModelo());
			if (ps.executeUpdate() > 0) {
				return "Alterado Modelo do Carrocom sucesso";
			} else {
				return "Erro ao alterar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String alterarCapacidadeCombustivel(Carro carro) {
		String sql = "update carro set carro = ? where capacidadecombustivel = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, carro.getCapacidadeCombustivel());
			if (ps.executeUpdate() > 0) {
				return "Alterado Modelo do Carro com sucesso";
			} else {
				return "Erro ao alterar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String alterarQuantidadeJanela(Carro carro) {
		String sql = "update carro set carro = ? where quantidadejanela = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, carro.getQuantidadeJanela());
			if (ps.executeUpdate() > 0) {
				return "Alterado Modelo do Carrocom sucesso";
			} else {
				return "Erro ao alterar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String deletar(Carro carro) {
		String sql = "delete from carro";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			if (ps.executeUpdate() > 0) {
				return "Deletado todos atributos do Carro com sucesso.";
			} else {
				return "Erro ao deletar do Carro.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String deletarWhere(Carro carro) {
		String sql = "delete from carro where modelo, capacidadecombustivel, quantidadejanela = ?, ?, ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getModelo());
			ps.setInt(2, carro.getCapacidadeCombustivel());
			ps.setInt(3, carro.getQuantidadeJanela());
			if (ps.executeUpdate() > 0) {
				return "Deletado Modelo, Capacidade do Combustível e Quantidade de Janelas do Carro com sucesso.";
			} else {
				return "Erro ao deletar do Carro.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

}
