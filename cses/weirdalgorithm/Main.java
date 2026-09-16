import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Integer.parseInt(st.nextToken());

        // Solve the problem here

	boolean finished = false;
	String text = "" + n;
	long value = n;
	while (!finished)
	    {
		if (value == 1)
		    {
			finished = true;
			
		    }
		
		else
		    {
			if (value % 2 == 0)
			    {
				value /= 2;
			    }
			else
			    {
				value *= 3;
				value += 1;
			    }
			text += " " + value;
		    }
	    }
	System.out.println(text);
    }
}
