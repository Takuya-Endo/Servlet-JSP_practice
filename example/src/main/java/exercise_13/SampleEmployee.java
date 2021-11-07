package exercise_13;

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
//		デフォルトではUser/home/直下のためおそらくフォルダ指定した方が良い
//		ユーザーメイとパスワードは入力不要で、ユーザー名：saのみ
//		ただし初回のみ自動作成のため、起動後複数データベース作成時は一度コンソールを閉じる必要あり
//		ブラウザを閉じるだけではコンソール終了できないため、タスクバーのシステムアイコンを右クリックしてEXIT
		
		
		EmployeeDao employeeDao = new EmployeeDao();
		
		for (Employee employee : employeeDao.selectAll()) {
			System.out.println(employee.getId() + "／" + employee.getName() + "／" + employee.getAge());
		}
		
		System.out.println("\n" + employeeDao.insert(new Employee("4", "test4", "40")) + "件追加\n");
		
		for (Employee employee : employeeDao.selectAll()) {
			System.out.println(employee.getId() + "／" + employee.getName() + "／" + employee.getAge());
		}
		
		System.out.println("\n削除結果：" + employeeDao.remove("4") + "\n");
		
		for (Employee employee : employeeDao.selectAll()) {
			System.out.println(employee.getId() + "／" + employee.getName() + "／" + employee.getAge());
		}
		
	}

}
