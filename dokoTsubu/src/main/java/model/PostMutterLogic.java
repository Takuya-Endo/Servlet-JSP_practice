package model;

public class PostMutterLogic {

	public void execute(Mutter mutter) {
		
		MutterDao mutterDao = new MutterDao();
		mutterDao.insert(mutter);
	
	}
	
}
