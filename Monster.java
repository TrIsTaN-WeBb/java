public class Monster {
    private String name; //monster's name
    private int damage; //monster's damage
    private int health; //monster's original health
    private int currentHealth; //monster's health after being attacked and/or restored

    //constructor method
    public Monster (String monsterName, int monsterDamage, int monsterHealth){
        name = monsterName;
        damage = monsterDamage;
        //both health and currentHealth need to be set to the original health
        health = monsterHealth;
        currentHealth = monsterHealth;
    }

    //allows monster to attack another monster and changes the other monster's currentHealth
    public void attack (Monster monsterUnderAttack){
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

    public static void main (String[] args){
        //creating 3 new monsters
        Monster Monster1 = new Monster ("Dragon", 1000, 30000);
        Monster Monster2 = new Monster ("Giant", 500, 15000);
        Monster Monster3 = new Monster ("Hydra", 90000, 2700000);

        Monster1.damageIncrease(); //increase the damage for Monster1 (the dragon)
        Monster1.attack(Monster2); //Monster 1 attacks Monster 2
        Monster2.attack(Monster3); //Monster 2 attacks Monster 3
        Monster1.attack(Monster3); //Monster 1 attacks Monster 3
        Monster3.attack(Monster1); //Monster 3 attacks Monster 1
        Monster1.restoreHealth();  //Monster 1 heals

        //print out each monster's stats
        System.out.println(Monster1.name + "'s damage = " + Monster1.damage + " & health = " + Monster1.currentHealth);
        System.out.println(Monster2.name + "'s damage = " + Monster2.damage + " & health = " + Monster2.currentHealth);
        System.out.println(Monster3.name + "'s damage = " + Monster3.damage + " & health = " + Monster3.currentHealth);
    }

}