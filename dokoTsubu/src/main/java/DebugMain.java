import java.util.ArrayList;

import model.Mutter;
import model.MutterDao;

public class DebugMain {

	public static void main(String[] args) {
		
		MutterDao mutterDao = new MutterDao();
		ArrayList<Mutter> list =mutterDao.selectAll();
		System.out.println(list);
		
//		Mutter mutter = new Mutter("test1", "test1");
//		mutterDao.insert(mutter);
//		
		list =mutterDao.selectAll();
		System.out.println(list);
		
	}

}
