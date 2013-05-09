/*
ID: lyflwh1
LANG: JAVA
TASK: friday
*/

import java.io.*;
import java.util.*;

public class friday{
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("friday.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
		int N = Integer.parseInt(f.readLine());
		int[] Days = new int[7];
		int dates = 0;
		int Month;
		int DayOfMonth;
		for(int i=1900;i<1900+N;i++){
			for(Month=1;Month<=12;Month++){
				Days[dates]++;
				switch(Month){
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						DayOfMonth = 31;
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						DayOfMonth = 30;
						break;
					default:
						if((i % 4==0)&&((i % 100!=0)||(i % 400==0)))
								DayOfMonth = 29;
							else 
							DayOfMonth = 28;
						//System.out.print(i);
						//System.out.print(' ');
						//System.out.println(DayOfMonth);
						break;
				}
				dates = (dates + DayOfMonth) % 7;
			}
		}
		for(int i=0;i<7;i++){
			if(i>0)
				out.print(' ');
			out.print(Days[i]);
		}
		out.println();
		out.close();
		System.exit(0);
	}
}
