package gameClass;

public class Paladin extends Basic{
    public Paladin(int intelligence, int pv, int strength, int energy, int defence, int agility,String name){
        super(intelligence,pv,strength,energy,defence,agility,name);
        this.defence+=2;
        this.energy-=2;
    }
    void levelUp(){
        this.defence+=2;
        this.energy-=2;
    }
}
