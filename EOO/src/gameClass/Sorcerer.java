package gameClass;

public class Sorcerer extends Basic{
    public Sorcerer(int intelligence, int pv, int strength, int energy, int defence, int agility,String name) {
        super(intelligence, pv, strength, energy, defence, agility,name);
        this.intelligence += 2;
        this.strength -= 2;
    }
    void levelUp(){
        this.intelligence += 2;
        this.strength -= 2;
    }
}
