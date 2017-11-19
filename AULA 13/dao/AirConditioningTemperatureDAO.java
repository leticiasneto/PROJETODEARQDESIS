package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import transferObject.AirConditioningTemperatureTO;
import transferObject.AirConditioningTemperatureTO;

public class AirConditioningTemperatureDAO {

	public void insert(AirConditioningTemperatureTO airConditioningTemperatureTO) {

		String stringSQLInsert = "INSERT INTO ---- (-----) VALUES (----)";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLInsert);) {
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void update(AirConditioningTemperatureTO airConditioningTemperatureTO) {

		String stringSQLUpdate = "UPDATE ------ SET ----=? WHERE --- = ---";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLUpdate);) {
			preparedStatement.setString(1, "" + airConditioningTemperatureTO.isBooleanStatus());
			preparedStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public AirConditioningTemperatureTO read(int intId) {

		AirConditioningTemperatureTO airConditioningTemperatureTO = new AirConditioningTemperatureTO();
		String stringSQLRead = "SELECT -- FROM -- WHERE -- = ?";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLRead);) {
			preparedStatement.setInt(1, intId);
			try (ResultSet resultSet = preparedStatement.executeQuery();) {
				if (resultSet.next()) {

					airConditioningTemperatureTO.setBooleanStatus(Boolean.parseBoolean(resultSet.getString("-----")));

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return airConditioningTemperatureTO;

	}

	public void delete(AirConditioningTemperatureTO airConditioningTemperatureTO) {

		String stringSQLDelete = "DELETE FROM --- where --- ? ";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLDelete);) {
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
/* Design by Wesley Ramos Leite, All Rights Reserved */