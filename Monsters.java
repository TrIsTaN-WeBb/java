public class Monsters {
    String name;
    String powers;

    public Monsters (String monsterName, String monsterPowers){
        name = monsterName;
        powers = monsterPowers;
    }

    public static void main(String[] args) {
        Monsters monster1 = new Monsters ("Middengard Worm", "digging");

        System.err.println(monster1.name + "'s powers are " + monster1.powers);
    }
}
