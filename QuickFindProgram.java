package unionfind;
import java.util.*;
import QuickFind;

public class QuickFindProgram {
	public static void main(String[] args) {
		QuickFind myG = new QuickFind(10);
		BufferedReader myBR = new BufferedReader(new FileReader(Data));
		String line = null;
		line = myBr.readLine();
		Integer num = Integer.valueOf(line);

		while ((line = myBr.readLine() != null)){
			String[] parts = line.split("\\ ");
			Integer p = Integer.valueOf(parts[0]);
			Integer q = Integer.valueOf(parts[1]);
			myG.union(p,q);
		} 

		//finally testing
		System.out.println(myG.isConnected(3,4));
	} 
}