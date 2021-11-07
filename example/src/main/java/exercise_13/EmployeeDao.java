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
	
public int insert(Employee employee) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int result = 0;
		
		try {
			
			String sql = "INSERT INTO employee (id, name, age) VALUES (?, ?, ?)";
			
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:~/exercise_13", "sa", "");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, Integer.parseInt(employee.getId()));
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setInt(3, Integer.parseInt(employee.getAge()));
			
			result = preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
		
	}
	
public boolean remove(String id) {
	
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	int result = 0;
	
	try {
		
		String sql = "DELETE FROM employee WHERE id = ?";
		
		Class.forName("org.h2.Driver");
		connection = DriverManager.getConnection("jdbc:h2:~/exercise_13", "sa", "");
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, Integer.parseInt(id));
		
		result = preparedStatement.executeUpdate();
		
		if (result == 0) {
			return false;
		}
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		return false;
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	} finally {
		try {
			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	return true;
	
}

}
