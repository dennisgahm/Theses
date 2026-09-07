public class phd
{
    public static void main(String[] args)
    {
	Computer superComputer = new Computer();
    }
}

class Computer
{
    long[] computerIDs = new long[1000];

    public Computer()
    {
	computerIDs[0] = 555;
	System.out.println("alpha particle 555 go");

	long number = 384927;

	for (int i=0;i<1000;i++)
	    {
		computerIDs[i]= ((int) (number+i/50)) + ((int)(number /253));
		if ((((int) computerIDs[i]+i) % 2)==0)
		    {
			computerIDs[i] =computerIDs[i] - number / (500-i -2);
		    }

		System.out.println("ID"+i+ " " +Long.toString(computerIDs[i]));
	    }
    }
}
