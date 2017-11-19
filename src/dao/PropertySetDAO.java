package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import transferObject.PropertySetTO;
import transferObject.PropertySetTO;

public class PropertySetDAO {

	public void insert(PropertySetTO propertySetTO) {
		String stringSQLInsert = "INSERT INTO ---- (-----) VALUES (----)";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLInsert);) {
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(PropertySetTO propertySetTO) {
		String stringSQLUpdate = "UPDATE ------ SET ----=? WHERE --- = ---";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLUpdate);) {
			preparedStatement.setString(1, propertySetTO.getStringName());

			preparedStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public PropertySetTO read(int intId) {

		PropertySetTO propertySetTO = new PropertySetTO();
		String stringSQLRead = "SELECT -- FROM -- WHERE -- = ?";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLRead);) {
			preparedStatement.setInt(1, intId);
			try (ResultSet resultSet = preparedStatement.executeQuery();) {
				if (resultSet.next()) {

					propertySetTO.setStringName(resultSet.getString("-----"));
					propertySetTO.setIntFloor(resultSet.getInt("-----"));

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return propertySetTO;

	}

	public void delete(PropertySetTO propertySetTO) {

		String stringSQLDelete = "DELETE FROM --- where --- ? ";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLDelete);) {
			preparedStatement.setInt(1, propertySetTO.getIntFloor());
			preparedStatement.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
/* Design by Wesley Ramos Leite, All Rights Reserved */