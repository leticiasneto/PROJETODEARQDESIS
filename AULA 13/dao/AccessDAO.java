package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import transferObject.AccessTO;
import transferObject.UserTO;

public class AccessDAO {

	public void insert(AccessTO accessTO, UserTO userTO) {

		String stringSQLInsert = "INSERT INTO registro_acesso (horario_entrada,horario_saida,dia_entrada,data_acesso,id_usuario) VALUES (?,?,?,?,?);";
		Date date = new Date();
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLInsert);) {
			preparedStatement.setDouble(1, accessTO.getDoubleCheckIn());
			preparedStatement.setDouble(2, accessTO.getDoubleCheckOut());
			preparedStatement.setDouble(3, accessTO.getIntDayCheckIn());
			preparedStatement.setDate(4,(java.sql.Date) date );
			preparedStatement.setString(5, userTO.getStringLogin());
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void update(AccessTO accessTO) {
		
		String stringSQLUpdate = "UPDATE Acess () SET ----=? WHERE --- = ---";
		
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLUpdate);) {
				preparedStatement.setDouble(1, accessTO.getDoubleCheckIn());
				preparedStatement.setDouble(2, accessTO.getDoubleCheckOut());
				preparedStatement.setInt(3, accessTO.getIntDayCheckIn());
				preparedStatement.execute();
				} catch (Exception e) {
				e.printStackTrace();
				}
		
		
	}

	public AccessTO read(int intId ) {
		AccessTO accessTO = new AccessTO();
		String stringSQLRead = "SELECT -- FROM -- WHERE -- = ?";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLRead);) {
				preparedStatement.setInt(1, intId);
				try (ResultSet resultSet = preparedStatement.executeQuery();) {
				if (resultSet.next()) {
					 accessTO.setDoubleCheckIn(resultSet.getDouble("----"));
					 accessTO.setDoubleCheckOut(resultSet.getDouble("----"));
					 accessTO.setIntDayCheckIn(resultSet.getInt("-----"));
				
				}
				} catch (SQLException e) {
				e.printStackTrace();
				}
				} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
				}
				return  accessTO;
		

	}

	public void delete(AccessTO accessTO) {
		String stringSQLDelete = "DELETE FROM --- where --- ? ";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLDelete);) {
			preparedStatement.setInt(1, accessTO.getIntDayCheckIn());
			preparedStatement.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
/* Design by Wesley Ramos Leite, All Rights Reserved */