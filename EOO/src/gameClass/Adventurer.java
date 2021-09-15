package gameClass;

public class Adventurer extends Basic {
    public Adventurer(int intelligence, int pv, int strength, int energy, int defence, int agility,String name){
        super(intelligence,pv,strength,energy,defence,agility,name);
    }
    void levelUp(){
        intelligence++;
        pv++;
        strength++;
        energy++;
        defence++;
        agility++;
    }
}
