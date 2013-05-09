/*
ID: lyflwh1
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;

class People{
	public int N = 0;
	public String[] names = new String[11];
	public int[] money = new int[11];
	public People(){
	}
	public void Addname(String name){
		N++;
		//System.out.println(name);
		names[N] = name;
		money[N] = 0;
		return;
	}
	public void MoneyChange(String name, int give){
		if(N==0){
			System.out.println("Error!!");
			return;
		}
		//System.out.print(name);
		//System.out.println(give);
		int i;
		for(i=1;i<=N;i++){
			if(names[i].equals(name))
				break;
		}
		money[i]-= give;
		return;
	}
}

class gift1{
	public static void main(String [] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
		//String[] test;
		//test = new String[10];
		int N = Integer.parseInt(f.readLine());
		People pel = new People();
		String name;
		int Ng, amt;
		for(int i=0;i<N;i++){
			name = f.readLine();
			//test[i] = name;
			pel.Addname(name);
		}
		for(int i=0;i<N;i++){
			name = f.readLine();
			String numbers = f.readLine();
			//System.out.println(numbers);
			StringTokenizer st = new StringTokenizer(numbers);
			amt = Integer.parseInt(st.nextToken());
			Ng = Integer.parseInt(st.nextToken());
			if (Ng>0) pel.MoneyChange(name, amt/Ng*Ng);
			if (Ng>0)
				for(int j=0;j<Ng;j++){
					name = f.readLine();
					pel.MoneyChange(name, -amt/Ng);
				}
		}
		for(int i=1;i<=N;i++){
			out.print(pel.names[i]+" ");
			out.println(pel.money[i]);
		}
		out.close();
		System.exit(0);
	}
}	
