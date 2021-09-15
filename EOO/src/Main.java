import gameClass.*;
public class Main {
    static void combattimento(Basic player1,Basic player2){
        if(player1.agility>=player2.agility){
            while(player1.pv>0 || player2.pv>0){
                player1.attacco(player2);
                player2.morte();
                player2.attacco(player1);
                player1.morte();
            }
        } else {
            while(player1.pv>0 && player2.pv>0){
                player2.attacco(player1);
                player1.morte();
                player1.attacco(player2);
                player2.morte();
            }
        }
    }
    public static void main(String[] args){
        Berserker vale = new Berserker(10,10,2,10,10,10,"Valerii");
        Paladin marco = new Paladin(10,10,2,10,10,10,"Marco");
        combattimento(vale,marco);
    }
}
