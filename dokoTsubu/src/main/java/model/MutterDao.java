package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;

public class MutterDao {

//	データベースサーバの中二複数のデータベースがあり、
//	さらにその中に複数のテーブルがあり、その中にレコードがある
//	
//	H2Database（データベースサーバ）
//		↓
//		→exercise_9（データベース名）
//		→exercise_13（データベース名）
//			↓
//			→employeeテーブル
//	
//	H2Databaseは（Embedded）を使用
//	URLの末尾（jdbc:h2:~/以下）を任意のデータベース名にすることで新規作成
//	デフォルトではUser/home/直下のためおそらくフォルダ指定した方が良い
//	ユーザーメイとパスワードは入力不要で、ユーザー名：saのみ
//	ただし初回のみ自動作成のため、起動後複数データベース作成時は一度コンソールを閉じる必要あり
//	ブラウザを閉じるだけではコンソール終了できないため、タスクバーのシステムアイコンを右クリックしてEXIT
	
	public ArrayList<Mutter> selectAll() {
		
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Mutter mutter = null;
		ArrayList<Mutter> mutterList = new ArrayList<Mutter>();
		
		try {
			
			String sql = "SELECT * FROM mutter";
			
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/docoTsubu", "sa", "");
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			if (Objects.isNull(resultSet)) {
				return mutterList;
			}
			
			while (resultSet.next()) {

				String id = resultSet.getString("id");
				String name = resultSet.getString("name");
				String text = resultSet.getString("text");
				
				mutter = new Mutter(id, name, text);
				mutterList.add(mutter);
				
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
		
		return mutterList;
		
	}
	
	public int insert(Mutter mutter) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int result = 0;
		
		try {
			
			String name = mutter.getName();
			String text = mutter.getText();
			
			String sql = "INSERT INTO mutter (name, text) VALUES (?, ?)";
			
			Class.forName("org.h2.Driver");
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/docoTsubu", "sa", "");
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, text);
			result = preparedStatement.executeUpdate();
			
			System.out.println(result + "件追加");
			
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
	
}
