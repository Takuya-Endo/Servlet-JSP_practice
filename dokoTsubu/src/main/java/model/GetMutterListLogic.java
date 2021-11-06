package model;

import java.util.ArrayList;

public class GetMutterListLogic {
	
	public ArrayList<Mutter> execute() {
		
		MutterDao mutterDao = new MutterDao();
		return mutterDao.selectAll();
		
	}
	
}
