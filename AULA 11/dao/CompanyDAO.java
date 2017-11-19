package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import transferObject.CompanyTO;
import transferObject.CompanyTO;

public class CompanyDAO {

	public void insert(CompanyTO companyTO) {

		String stringSQLInsert = "INSERT INTO ---- (-----) VALUES (----)";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLInsert);) {
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void update(CompanyTO companyTO) {
		String stringSQLUpdate = "UPDATE ------ SET ----=? WHERE --- = ---";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLUpdate);) {
			preparedStatement.setString(1, companyTO.getStringCnpj());
			preparedStatement.setString(2, companyTO.getStringCheckIn());
			preparedStatement.setString(3, companyTO.getStringCheckOut());
			preparedStatement.setString(4, companyTO.getStringAirConditioningCheckIn());
			preparedStatement.setString(5, companyTO.getStringAirConditioningCheckOu());
			preparedStatement.setString(6, companyTO.getStringCompanyName());
			preparedStatement.setInt(7, companyTO.getIntStandardTemperatureOfAirConditioning());
			preparedStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public CompanyTO read(int intCompanyCNPJ) {

		CompanyTO companyTO = new CompanyTO();
		String stringSQLRead = "SELECT -- FROM -- WHERE -- = ?";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLRead);) {
			preparedStatement.setInt(1, intCompanyCNPJ);
			try (ResultSet resultSet = preparedStatement.executeQuery();) {
				if (resultSet.next()) {
					companyTO.setStringCnpj(resultSet.getString("----"));
					companyTO.setStringCompanyName(resultSet.getString("----"));
					companyTO.setStringAirConditioningCheckIn(resultSet.getString("----"));
					companyTO.setStringAirConditioningCheckOut(resultSet.getString("----"));
					companyTO.setStringCheckIn(resultSet.getString("----"));
					companyTO.setStringCheckOut(resultSet.getString("----"));
					companyTO.setIntStandardTemperatureOfAirConditioning(resultSet.getInt("----"));

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return companyTO;

	}

	public void delete(CompanyTO companyTO) {

		String stringSQLDelete = "DELETE FROM --- where --- ? ";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLDelete);) {
			preparedStatement.setInt(1, Integer.parseInt(companyTO.getStringCnpj()));
			preparedStatement.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
