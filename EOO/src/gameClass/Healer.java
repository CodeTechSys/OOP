package gameClass;

public class Healer extends Basic{
    public Healer(int intelligence, int pv, int strength, int energy, int defence, int agility, String name){
        super(intelligence,pv,strength,energy,defence,agility,name);
        this.energy+=2;
        this.defence-=2;
    }
    void levelUp(){
        this.energy+=2;
        this.defence-=2;
    }
}
