package gameClass;

public class Berserker extends Basic{
    public Berserker(int intelligence, int pv, int strength, int energy, int defence, int agility, String name){
        super(intelligence,pv,strength,energy,defence,agility,name);
        this.strength+=2;
        this.intelligence-=2;
    }
    void levelUp(){
        this.strength+=2;
        this.intelligence-=2;
    }
}
