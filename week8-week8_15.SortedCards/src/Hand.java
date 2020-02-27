import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> playerHand;

    public Hand() {
        playerHand=new ArrayList<Card>();

    }
    public void add(Card card){
        playerHand.add(card);
    }
    public void print(){
        for(Card card:playerHand){
            System.out.println(card);
        }
    }
    public void sort(){
        Collections.sort(this.playerHand);
    }
    public void sortAgainstSuit(){
       Collections.sort(this.playerHand,new SortAgainstSuitAndValue());
    }

    @Override
    public int compareTo(Hand otherHand) {
        int playerHand1=0;
        int playerHand2=0;
        int size=0;
        Hand biggest;
        int currentIndex=Math.abs(this.playerHand.size()-otherHand.playerHand.size());
        if(this.playerHand.size()<=otherHand.playerHand.size()){
            size=this.playerHand.size();
            biggest=otherHand;
        }else {
            size=otherHand.playerHand.size();
            biggest=this;
        }
        for(int i=0;i<size;i++){
            if(this.playerHand.get(i).compareTo(otherHand.playerHand.get(i))!=0) {
                playerHand1 += this.playerHand.get(i).getValue();
                playerHand2+=otherHand.playerHand.get(i).getValue();
            }
        }
        for(int i=size;i<biggest.playerHand.size();i++){
            if (biggest.equals(this)){
                playerHand1+=this.playerHand.get(i).getValue();
            }else {
                playerHand2+=otherHand.playerHand.get(i).getValue();
            }
        }

        if(playerHand1==playerHand2){
            return 0;
        }else if(playerHand1>playerHand2){
            return 1;
        }else {
            return -1;
        }

    }
}
