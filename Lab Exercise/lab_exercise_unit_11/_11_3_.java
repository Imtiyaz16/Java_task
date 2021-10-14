package lab_exercise_unit_11;


import java.io.*;
class _11_3_{
	public static void main (String args[]) throws IOException
	{

		File f = new File ("c:/java/temp");
		if (f.mkdir())
			System.out.println("created a directory");
		else
			System.out.println ("unable to create a directory");
	}
}