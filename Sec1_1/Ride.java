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
	int A, productA, B, productB;
	productA = 1;
	productB = 1;
	for(int i=0;i<Group.length();i++){
	A = Group.codePointAt(i);
	productA *=(A-64);
	//System.out.println(A-64);
	//System.out.println(product);
	}
	for(int i=0;i<Comet.length();i++){
	B = Comet.codePointAt(i);
        productB *=(B-64);
	}
	if((productA % 47)==(productB % 47))
		out.println("GO");
	else out.println("STAY");
	
	//System.out.println(Group);
	//System.out.println(Comet);
	out.close();
	System.exit(0);
  }
}	
