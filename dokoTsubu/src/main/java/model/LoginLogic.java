package model;

public class LoginLogic {
	
	public boolean execute(User user) {
		
//		String name = user.getName();
		String pass = user.getPass();
		
//		if (!"userA".equals(name)) {
//			return false;
//		}
		
		if (!"1234".equals(pass)) {
			return false;
		}
		
		return true;
		
	}
	
}
