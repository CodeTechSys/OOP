package gameClass;

public class Basic {
    boolean vivo=true;
    String nome,razza;
    public int intelligence, pv, strength, energy, defence, agility,lvl;
    public Basic(int intelligence, int pv, int strength, int energy, int defence, int agility,String nome) {
        this.intelligence = intelligence;
        this.pv = pv;
        this.strength = strength;
        this.energy = energy;
        this.defence = defence;
        this.agility = agility;
        this.nome = nome;
    }

    public void attacco(Basic avversario) {
        System.out.println(nome + " Ha tirato un colpo!");
        avversario.pv -= strength;
    }
    public int spell(){
        System.out.println(nome + " Ha tirato una magia!");
        energy-=1;
        return intelligence;
    }
    public void morte() {
        if (pv <= 0){
            System.out.println(nome + " ha esalato il suo ultimo respiro...");
            vivo = false;
        }
    }
}
