//Tristan Webb tristan.webb@malad.us
//for CTE software development 1
//instructor Mr Gross

public class MyMonster {
    private String name; //monster's name
    private int damage; //monster's damage
    private int health; //monster's original health
    private int currentHealth; //monster's health after being attacked and/or restored

    //constructor method
    public MyMonster (String monsterName, int monsterDamage, int monsterHealth){
        name = monsterName;
        damage = monsterDamage;
        //both health and currentHealth need to be set to the original health
        health = monsterHealth;
        currentHealth = monsterHealth;
    }

    //allows monster to attack another monster and changes the other monster's currentHealth
    public void attack (MyMonster monsterUnderAttack){
        monsterUnderAttack.currentHealth = monsterUnderAttack.currentHealth - damage;
    }

    //increases monster's damage by multiples of four
    public void damageIncrease (){
        damage = damage * 4;
    }

    //restore's the health of a damaged monster back to its original health
    public void restoreHealth (){
        currentHealth = health;
    }

    //returns Monster's name
    public String getName (){
        return name;
    }

    //returns Monster's damage
    public int getDamage (){
        return damage;
    }

    //returns Monster's original health
    public int getHealth(){
        return health;
    }

    //returns Monster's current health
    public int getCurrentHealth(){
        return currentHealth;
    }

    //Sub-class of MyMoster to add extra properties and modify abilities
    public class Wyvern extends MyMonster{
        public String stealth; //description of the Wyvern's stealth
        public int buff; //gives the Wyvern extra damage ability
    
        //constructor method
        public Wyvern(String wyvernName, int wyvernDamage, int wyvernHealth, String wyvernStealth, int wyvernBuff){
            super(wyvernName, wyvernDamage, wyvernHealth); //use the parent class's constructor method to assign values
           
            stealth = wyvernStealth; //setting Wyvern stealth
            buff = wyvernBuff; //setting Wyvern buff
        }

        //overrides the parent class attack method to add extra damage ability of a Wyvern
        @Override public void attack (MyMonster monsterUnderAttack){
            monsterUnderAttack.currentHealth = monsterUnderAttack.currentHealth - (damage*buff);
        }
    }

    public static void main (String[] args){
        //creating 3 new monsters
        MyMonster Monster1 = new MyMonster ("Dragon", 1000, 30000);
        MyMonster Monster2 = new MyMonster ("Giant", 500, 15000);
        MyMonster Monster3 = new MyMonster ("Hydra", 90000, 2700000);

        //creating an instance of a monster to enclose a Wyvern in
        MyMonster Monster4 = new MyMonster("Markus", 40000, 8000);
        //creating a Wyvern
        Wyvern Wyvern1 = Monster4.new Wyvern("Markus", 40000, 8000, "sneaky", 40);

        Monster1.damageIncrease(); //increase the damage for Monster1 (the dragon)
        Monster1.attack(Monster2); //Monster 1 attacks Monster 2
        Monster2.attack(Monster3); //Monster 2 attacks Monster 3
        Monster1.attack(Monster3); //Monster 1 attacks Monster 3
        Monster3.attack(Monster1); //Monster 3 attacks Monster 1
        Monster1.restoreHealth();  //Monster 1 heals
        Wyvern1.attack(Monster3); //Wyvern 1 attacks monster 3

        //print out each monster's stats
        System.out.println(Monster1.name + "'s damage = " + Monster1.damage + " & health = " + Monster1.currentHealth);
        System.out.println(Monster2.name + "'s damage = " + Monster2.damage + " & health = " + Monster2.currentHealth);
        System.out.println(Monster3.name + "'s damage = " + Monster3.damage + " & health = " + Monster3.currentHealth);
        System.out.println(Wyvern1.getName() + "'s damage = " + Wyvern1.getDamage()*Wyvern1.buff + " & health = " + Wyvern1.getCurrentHealth());
    }

}