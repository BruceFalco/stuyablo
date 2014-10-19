import java.util.Random;

/* superclass for warrior (base class) and Mage */
public class Basechar {
    private String name;
    private int health = 100;
    private int defense = 100;
    private int mana = 0;
    private int armor = 0;

//-------------NAME--------------
    public void setName(String n) {
	name = n;
    }
    public String getName() {
	return name;
    }
//------------HEALTH------------ 
    public void setHealth(int h) {
	health = h;
    }
    public int getHealth() {
	return health;
    }
//-----------DEFENSE------------
    public void setDefense(int d) {
	defense = d;
    }
    public int getDefense() {
	return defense;
    }
//------------MANA--------------
    public void setMana(int m) {
	mana = m;
    }
    public int getMana() {
	return mana;
    }
//------------ARMOR------------
    public void setArmor(int a) {
	armor = a;
    }
    public int getArmor() {
	return armor;
    }
   
    /*Zafir
      -Got Wander to work
      -Player "walks" for a random number of steps between 1 and 25
      -There is a gap of 0.5 seconds b/w each step
      -Message pops up that notifies player that they have encountered an enemy

     Next Steps
      -Give the player an option to fight or run
      -Generate a random type of CPU
      -Randomly pick up items */
    public void Wander() {
	Random rand = new Random();
	for(int value = rand.nextInt(25)+1;value>0;value-=1){
	    System.out.println("Step" + "\n");
	    try {
	    Thread.sleep(500);
	    } catch (InterruptedException e) {
		 e.printStackTrace();
		}
	}	
	System.out.println("You have encountered a wild warrior!");
	Centurion CPU = new Centurion();
    }

    



}
