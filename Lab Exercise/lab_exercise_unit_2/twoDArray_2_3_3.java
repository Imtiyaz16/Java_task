package lab_exercise_unit_2;

public class twoDArray_2_3_3 {
	public static void main(String[] args) {

        // Declaration along with initialisation
        // 2D integer array with 5 rows and 3 columns
        // integer array elements are initialised with 0
        int[][] integer2DArray = new int[5][3];
        System.out.println(
            "Default value of int array element: "
            + integer2DArray[0][0]);
 
        // 2D String array with 4 rows and 4 columns
        // String array elements are initialised with null
        String[][] string2DArray = new String[4][4];
        System.out.println(
            "Default value of String array element: "
            + string2DArray[0][0]);
 
        // 2D boolean array with 3 rows and 5 columns
        // boolean array elements are initialised with false
        boolean[][] boolean2DArray = new boolean[4][4];
        System.out.println(
            "Default value of boolean array element: "
            + boolean2DArray[0][0]);
 
        // 2D char array with 10 rows and 10 columns
        // char array elements are initialised with
        // '\u0000'(null character)
        char[][] char2DArray = new char[10][10];
        System.out.println(
            "Default value of char array element: "
            + char2DArray[0][0]);
 
        // First declaration and then initialisation
        int[][] arr; // declaration
 
        // System.out.println("arr[0][0]: "+ arr[0][0]);
        // The above line will throw an error, as we have
        // only declared the 2D array, but not initialised
        // it.
        arr = new int[5][3]; // initialisation
        System.out.println("arr[0][0]: " + arr[0][0]);
	}
}
