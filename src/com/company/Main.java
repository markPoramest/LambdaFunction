package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Party p1 = new Party("Pheu Thai","Sompong Amornwiwat",134,false);
        Party p2 = new Party("Palang Pracharath","Prawit Wongsuwan",119,true);
        Party p3 = new Party("Move Forward","Pita Limjaroenrat",54,false);
        Party p4 = new Party("Democrat","Jurin Laksanawisit",52,true);
        Party p5 = new Party("Bhumjaithai","Anutin Charnvirakul",61,true);

        ArrayList<Party> parties = new ArrayList<>();
        parties.add(p1);
        parties.add(p2);
        parties.add(p3);
        parties.add(p4);
        parties.add(p5);

        parties.forEach(n -> System.out.println("Party Leader of "+ n.partyName +" Party : "+n.partyLeader));
        IsGoverment g1 = (pt) -> {
            return pt.govement? "Coalition government party" : "Opposition party";
        };
        parties.forEach(n -> System.out.println(n.partyName + " is a "+g1.isGoverment(n)));


    }
}
