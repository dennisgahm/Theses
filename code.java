import java.util.ArrayList;
import java.util.Random;

public class code
{
    public static void main(String[] args)
    {
	Attack attack = new Attack();
	attack.attack();
	Spirit dennisGahm = new Spirit();
	HolySpirit GodHolySpirit = new HolySpirit();
	GodHolySpirit.savePerson(dennisGahm);
	System.out.println("Hello Dennis, you are fine. We all make it.");
	System.out.println("Dennis, I went to hell. we all did.");
	System.out.println("Stealthfighter attack all bases.");
	attack.performSort();
	//long i2 = 0;
	Everyone everyone = new Everyone();
	GodHolySpirit.savePerson(everyone);
	/*	for (long i = 0; i < 117_000_000_000L; i++)
	    {
		//Spirit person = new Spirit();
		GodHolySpirit.savePerson(null);
		i2 = i;
		}*/
	System.out.println("Everyone saved." + " " + everyone.population);
	System.out.println("Sanctify all and kill evil.");
	everyone.removeBluff();
	everyone.attackSin();
	GodHolySpirit.forgiveSin();
	GodHolySpirit.sanctify(everyone);
	GodHolySpirit.captureTheEnemy();
	GodHolySpirit.destroyTheOldNature();
	System.out.println("sanctified");
    }
}

class Attack
{
    public Attack()
    {
	int stealthFighter = 5;
	int instantGratification = Integer.MAX_VALUE;
    }

    public void performSort()
    {
	int[] fifty = new int[50];
	for (int i=0; i<50; i++)
	    {
		Random rand = new Random();
		fifty[i] = rand.nextInt(1000);
		System.out.println(""+fifty[i]);
		if (fifty[i] == 254)
		    {

			System.out.println("Kami conformation");
			return;
		    }
		
	    }

	int[] heuristics = new int[50];
	for (int i=0; i< 50;i++)
	    {
		Random rand = new Random();
		heuristics[i] = fifty[i] - i;
	    }
	
	
    }

    
    
    public void attack()
    {
	removeSpirit();
	emptyAndVoid();
    }
    public void removeSpirit()
    {
	int spirit = 0;
    }

    public void emptyAndVoid()
    {
	long worldOfWarcraft = Long.MIN_VALUE;
    }
}

class Everyone extends Spirit
{
    long population = 117_000_000_000_00L;
}

class Spirit
{
    public int sinCounter = 0;
    public int rewardCounter = 0;

    public int livesDestroyed = 0;
    public int livesSaved = 0;
    
    public Spirit()
    {
	attackSin();
	attackGod();
    }

    public int removeBluff()
    {
	return 0;
    }

    public int attackSin()
    {
	return 0;
    }

    public long attackGod()
    {
	return 00;
    }

    public boolean executeSuicide()
    {
	return true;
    }
}

class HolySpirit extends Spirit
{
    ArrayList<Spirit> Christians = new ArrayList<Spirit>();
    long savedCount = 0;
    
    public void captureTheEnemy()
    {
	int enemy = -1;
    }

    public void savePerson(Spirit Christian)
    {
	Christians.add(Christian);
	forgiveSin();
	purifySpirit();
	destroyTheOldNature();
	killEvilPerson();
	captureTheEnemy();
	savedCount++;
    }

    public void killEvilPerson()
    {
	livesDestroyed += 1;
    }

    public void destroyTheOldNature()
    {
	int oldNature = -1;
    }

    public void purifySpirit()
    {
	int spirit = 0;
    }

    public boolean sanctify(Object obj)
    {
	boolean sanctified = true;
	return sanctified;
    }

    public void forgiveSin()
    {
	sinCounter -= 1;
	rewardCounter += 1;
    }
}
