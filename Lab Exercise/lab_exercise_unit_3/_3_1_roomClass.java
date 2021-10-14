package lab_exercise_unit_3;


public class _3_1_roomClass {
	
	private int RN;
	private String RT;
	private float RA;
	private String AC;
 	public void setData(int room_no,String room_type,float room_area,String ac_machine) {
		RN=room_no;
		RT=room_type;
		RA=room_area;
		AC=ac_machine;		
	}
	public void displayData() {
	      System.out.println("room_no  : " + RN);
	      System.out.println("room_type  : " + RT);
	      System.out.println("room_area  : " + RA);
	      System.out.println("ac_machine  : " + AC);


	}
	public static void main(String args[]) {
		 _3_1_roomClass room=new  _3_1_roomClass();
		 room.setData(2, "living Room", 500 , "yes");
		 room.displayData();
	}
}
