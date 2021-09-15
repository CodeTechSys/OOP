package gameClass;

public class Assassin extends Basic{
    public Assassin(int intelligence, int pv, int strength, int energy, int defence, int agility,String name) {
        super(intelligence, pv, strength, energy, defence, agility,name);
        this.agility+=2;
        this.pv-=2;
    }
    void levelUp(){
        this.agility+=2;
        this.pv-=2;
    }
}
