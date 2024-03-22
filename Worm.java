//Tristan Webb tristan.webb@malad.us
//for CTE software development 1
//instructor Mr Gross

//Sub-class of MyMonster to add extra properties and modify abilities for a Worm
public class Worm extends MyMonster{
    public int swallow; //description of the Worm's swallow

    //constructor method
    public Worm(String wormName, int wormDamage, int wormHealth, int wormSwallow){
        super(wormName, wormDamage, wormHealth); //use the parent class's constructor method to assign values
       
        swallow = wormSwallow; //Worm can swallow other monsters
    }

    //overrides the parent class attack method to add extra damage ability of a Worm
    @Override public void attack (MyMonster monsterUnderAttack){
        //check to see if the worm can swallow the monster
        if (swallow(monsterUnderAttack)){
            //nothing to do, monster was swallowed
        }else{
            monsterUnderAttack.setCurrentHealth(monsterUnderAttack.getCurrentHealth() - this.getDamage()); // worm couldn't swallow, so only does regular damage
        }
        
    }

    //method for a worm to swallow another monster
    private boolean swallow(MyMonster monsterUnderAttack){
        boolean swallowed; //variable that gets returned
        
        //checks to see if the worm can swallow the monster it's attacking
        if (monsterUnderAttack.getCurrentHealth() < swallow){
            monsterUnderAttack.setCurrentHealth(0);
            swallowed = true; //worm swallowed the monster
        } else {
            swallowed = false; //worm can't swallow the monster
        }

        return swallowed;
    }
}