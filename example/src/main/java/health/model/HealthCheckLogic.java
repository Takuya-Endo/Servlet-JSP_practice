package health.model;

public class HealthCheckLogic {
	
	public String checkBmi(String height, String weight) {
		int iHeight = Integer.parseInt(height) / 100;
		int iWeight = Integer.parseInt(weight);
		String bmi = String.valueOf(iWeight / (iHeight * iHeight));
		return bmi;
	}
	
	public String judgeBmi(String bmi) {
		int iBmi = Integer.parseInt(bmi);
		if (iBmi < 18.5) {
			return "痩せ型";
		} else if (iBmi >= 25) {
			return "肥満";
		} else {
			return "普通";
		}
	}

}
