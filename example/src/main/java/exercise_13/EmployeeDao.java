package exercise_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDao {
	
	public ArrayList<Employee> selectAll() {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Employee employee = null;
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		try {
			
			String sql = "SELECT * FROM employee";
			
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:~/exercise_13", "sa", "");
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				
				String id = resultSet.getString("id");
				String name = resultSet.getString("name");
				String age = resultSet.getString("age");
				
				employee = new Employee(id, name, age);
				employeeList.add(employee);
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return employeeList;
		
	}
	
}
