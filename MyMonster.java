//Tristan Webb tristan.webb@malad.us
//for CTE software development 1
//instructor Mr Gross

//MyMonster is the superclass for my project
public class MyMonster implements Comparable<MyMonster> { //implements comparable for sort feature
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

    //change Monster's current health
    public void setCurrentHealth(int newHealth){
        currentHealth = newHealth;
    }

    //required method for Comparable interface to sort
    public int compareTo(MyMonster mm){
        return this.currentHealth - mm.currentHealth; //sorts Monsters by who has the most remaining health after battles
    }

}