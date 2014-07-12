package unionfind;
import java.util.*;
//import java.io.BufferedReader;
import java.io.*;

//import QuickFind;

public class QuickFind {

	// class info<
	public Vector<Integer> v;
	public Integer nVertices; 

	public QuickFind(Integer x){
		nVertices = x;
		v = new Vector<Integer>(nVertices);
		for (Integer i = 0; i < 10; i++){
			v.set(i,i);
		}
	}

	public void union(Integer p, Integer q){
		Integer temp1 = v.elementAt(p);
		Integer temp2 = v.elementAt(q);
		for (int i = 0; i < nVertices; i++) {
			if (v.elementAt(i) == temp1)
				v.set(i,temp2);
		}
	}

	public boolean isConnected(Integer p, Integer q){
		return (v.elementAt(p) == v.elementAt(q));
	}
	// class info>

	public static void main(String[] args) throws IOException {
		QuickFind myG = new QuickFind(10);
		BufferedReader myBr = new BufferedReader(new FileReader("Data"));
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