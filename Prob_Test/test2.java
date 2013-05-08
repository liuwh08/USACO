/*
ID: lyflwh1
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
	public static void main (String [] args) throws IOException {
	BufferedReader f = new BufferedReader(new FileReader("ride.in"));
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
	String Group = new String(f.readLine());
	String Comet = new String(f.readLine());
	A = Group.charAt(1);
	System.out.println(A);
	out.close();
	System.exit(0);
  }
}

	
