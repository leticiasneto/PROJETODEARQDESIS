package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import transferObject.UserTO;
import transferObject.UserTO;

public class UserDAO {

	public void insert(UserTO userTO){
		
		String stringSQLInsert = "INSERT INTO usuario (login,senha,perfil) VALUES (?,?,?);";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLInsert);) {
			preparedStatement.setString(1, userTO.getStringLogin());
			preparedStatement.setString(2, userTO.getStringPassword());;
			preparedStatement.setInt(3, userTO.getIntType());
			preparedStatement.execute();
			
			
			
		}	
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void update(UserTO userTO){
		String stringSQLUpdate = "UPDATE ------ SET ----=? WHERE --- = ---";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement stm = connection.prepareStatement(stringSQLUpdate);) {
				stm.setString(1, userTO.getStringLogin());
				stm.setString(2, userTO.getStringPassword());
				stm.setInt(3, userTO.getIntType());
				stm.execute();
				} catch (Exception e) {
				e.printStackTrace();
				}
		
		
		
	}
	public UserTO read(int intId){
		UserTO userTO = new UserTO();
		String stringSQLRead = "SELECT * FROM usuario WHERE idusuario = ?";
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(stringSQLRead);) {
				preparedStatement.setInt(1, intId);
				try (ResultSet resultSet = preparedStatement.executeQuery();) {
				if (resultSet.next()) {
					 userTO.setIntType(Integer.parseInt(resultSet.getString("perfil")));
					 userTO.setStringLogin(resultSet.getString("login"));
					 userTO.setStringPassword(resultSet.getString("senha"));
				
				}
				} catch (SQLException e) {
				e.printStackTrace();
				}
				} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
				}
				return  userTO;
		
		
		
		
	}
	public void delete(UserTO userTO){
		
		String stringSQLDelete = "DELETE FROM --- where --- ? ";
	try(Connection connection = ConnectionFactory.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(stringSQLDelete);)
	{
		preparedStatement.setString(1, userTO.getStringLogin());
		preparedStatement.execute();
		
	}
	catch (Exception e) {
		// TODO: handle exception
	}
		
	}
	

}
/*Design by Wesley Ramos Leite, All Rights Reserved*/