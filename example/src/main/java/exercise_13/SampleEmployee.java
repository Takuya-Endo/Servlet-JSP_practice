package exercise_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SampleEmployee {

	public static void main(String[] args) {
		
//		データベースサーバの中二複数のデータベースがあり、
//		さらにその中に複数のテーブルがあり、その中にレコードがある
//		
//		H2Database（データベースサーバ）
//			↓
//			→exercise_9（データベース名）
//			→exercise_13（データベース名）
//				↓
//				→employeeテーブル
//		
//		H2Databaseは（Embedded）を使用
//		URLの末尾（jdbc:h2:~/以下）を任意のデータベース名にすることで新規作成
//		ユーザーメイとパスワードは入力不要で、ユーザー名：saのみ
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			
			String sql = "";
			
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:~/exercise_13");
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			
			
			
			
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
		

	}

}
