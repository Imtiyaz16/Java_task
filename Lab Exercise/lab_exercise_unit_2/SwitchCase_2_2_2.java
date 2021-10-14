package lab_exercise_unit_2;

public class SwitchCase_2_2_2 {
	public static void main(String [] args) {
		int month=10;
		String month_str="";
		
		switch(month) {
		case 1: month_str="January";
		break;
		case 2: month_str="Feburary";
		break;
		case 3: month_str="March";
		break;
		case 4: month_str="April";
		break;
		case 5: month_str="May";
		break;
		case 6: month_str="June";
		break;
		case 7: month_str="July";
		break;
		case 8: month_str="August";
		break;
		case 9: month_str="September";
		break;
		case 10: month_str="October";
		break;
		case 11: month_str="November";
		break;
		case 12: month_str="December";
		break;
		default:System.out.println("invalid Month");
		}
		System.out.println(month_str);
	}
}
