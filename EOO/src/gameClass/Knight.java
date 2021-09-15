package gameClass;

public class Knight extends Basic{
    public Knight(int intelligence, int pv, int strength, int energy, int defence, int agility, String name){
        super(intelligence,pv,strength,energy,defence,agility,name);
        this.pv+=2;
        this.agility-=2;
    }
    void levelUp(){
        this.pv+=2;
        this.agility-=2;
    }
}
