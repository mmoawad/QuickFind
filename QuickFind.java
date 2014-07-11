package unionfind;
import java.util.*;
//import java.io.BufferedReader;
import java.io.*;

//import QuickFind;

public class QuickFind {
	
	// class info<
	public static Vector v = new Vector();
	public static Integer nVertices; 

	public static void QuickFind(Integer x){
		nVertices = x;
		
		Vector myVec = new Vector(nVertices);
		for (Integer i = 0; i < 10; i++){
			v.set(i,i);
		}
		
		v = myVec;
		
	}

	public static void union(Integer p, Integer q){
		Integer temp1 = (int) v.elementAt(p);
		Integer temp2 = (int) v.elementAt(q);
		for (int i = 0; i < nVertices; i++) {
			if (v.elementAt(i) == temp1) v.set(i,temp2);
		}
	}

	public static boolean isConnected(Integer p, Integer q){
		return (v.elementAt(p) == v.elementAt(q));
	}
	// class info>

	public static void main(String[] args) {
		QuickFind myG = new QuickFind(10);
		BufferedReader myBR = new BufferedReader(new FileReader("Data"));
		String line = null;
		line = myBr.readLine();
		Integer num = Integer.valueOf(line);

		while ((line = myBr.readLine()) != null){
			String[] parts = line.split("\\ ");
			Integer p = Integer.valueOf(parts[0]);
			Integer q = Integer.valueOf(parts[1]);
			myG.union(p,q);
		} 

		//finally testing
		System.out.println(myG.isConnected(3,4));
	} 
}