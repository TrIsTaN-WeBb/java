//Tristan Webb tristan.webb@malad.us
//for CTE software development 1
//instructor Mr Gross

//Sub-class of MyMonster to add extra properties and modify abilities for a Wyvern
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
            monsterUnderAttack.setCurrentHealth(monsterUnderAttack.getCurrentHealth() - (this.getDamage()*buff));
        }
    }