//Tristan Webb tristan.webb@malad.us
//for CTE software development 1
//instructor Mr Gross

//main method to use MyMonster and subclasses for my project

public class MonsterMain {
    public static void main (String[] args){
        //creating 3 new monsters
        MyMonster Monster1 = new MyMonster ("Dragon", 1000, 30000000);
        MyMonster Monster2 = new MyMonster ("Giant", 500, 15000);
        MyMonster Monster3 = new MyMonster ("Hydra", 90000, 2700000);
        
        //creating a Wyvern
        Wyvern Wyvern1 = new Wyvern("Markus", 40000, 8000, "sneaky", 40);

        //create a Worm
        Worm Worm1 = new Worm("Wiggly", 10000, 3000, 5000000);

        Monster1.damageIncrease(); //increase the damage for Monster1 (the dragon)
        Monster1.attack(Monster2); //Monster 1 attacks Monster 2
        Monster2.attack(Monster3); //Monster 2 attacks Monster 3
        Monster1.attack(Monster3); //Monster 1 attacks Monster 3
        Monster3.attack(Monster1); //Monster 3 attacks Monster 1
        Monster1.restoreHealth();  //Monster 1 heals
        Wyvern1.attack(Monster3); //Wyvern 1 attacks monster 3
        Worm1.attack(Monster3); //Worm1 attacks monster 3
        Monster2.attack(Worm1); //Monster2 attacks worm1
        Worm1.attack(Monster1); //Worm1 attacks monster 1

        //print out each monster's stats
        System.out.println(Monster1.getName() + "'s damage = " + Monster1.getDamage() + " & health = " + Monster1.getCurrentHealth());
        System.out.println(Monster2.getName() + "'s damage = " + Monster2.getDamage() + " & health = " + Monster2.getCurrentHealth());
        System.out.println(Monster3.getName() + "'s damage = " + Monster3.getDamage() + " & health = " + Monster3.getCurrentHealth());
        System.out.println(Wyvern1.getName() + "'s damage = " + Wyvern1.getDamage()*Wyvern1.buff + " & health = " + Wyvern1.getCurrentHealth());
        System.out.println(Worm1.getName() + "'s damage = " + (Worm1.getDamage() + Worm1.swallow) + " & health = " + Worm1.getCurrentHealth());
    }
}
