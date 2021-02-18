import java.util.ArrayList;

public class Deck extends ArrayList<Card> {

    Deck(){

        String[] suitArray = {
                "C", "D", "S", "H" };
        int value = 2 + (int)(Math.random() * 14);

        int lenDeck = suitArray.length * 13;
        String[] Deck = new String[lenDeck];

        for (int i =0; i< suitArray.length; i++){
            for (int j=0; j< 13; j++){
                Deck[52] = suit[i] + value[j];

            }
        }
    }



//    newDeck(){
//
//
//
//
//    }


}
