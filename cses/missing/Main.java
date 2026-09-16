import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
	int testN = n;

	st = new StringTokenizer(br.readLine());  
	ArrayList<Integer> arr = new ArrayList<Integer>();
	for (int i = 0; i < (testN-1); i++)
	    {
		n = Integer.parseInt(st.nextToken());  
		//insert
		boolean inserted = false;
		for (int i2 = 0; i2 < (arr.size()); i2++)
		    {
			int value = arr.get(i2);
			if (value > n){
			    arr.add(i2,n);
			    inserted = true;
			    break;}
		    }
		if (!inserted)
		    arr.add(n);
	    }
	//	System.out.println("" + arr.size());
	for (int i = 0;i<arr.size();i++)
	    {
		//	       				System.out.println("" + arr.get(i));
	    }
	for (int i =0; i <  (arr.size()); i++)
	    {
		if (arr.get(i) != (i+1)) {
		    		        System.out.println("" + (i+1));
					return;
			}
	    }

	System.out.println("" + (arr.size() + 1));
    }
}
