package org.example.collections.problems;

public class CardGameMain {

    public static void main(String[] args) {
        // deck 생성
        Deck deck = new Deck();

        // players 배정
        Player zoey = new Player("zoey");
        Player sabina = new Player("sabina");

        // 카드 각각 5장씩 뽑기
        for (int i=0; i < 5; i++) {
            zoey.drawCard(deck);
            sabina.drawCard(deck);
        }

        // 카드 정렬
        zoey.sortCards();
        sabina.sortCards();

        System.out.println(zoey);
        System.out.println(sabina);

        // 카드 게임
        int result = zoey.play(sabina);
        if (result > 0) {
            System.out.println(zoey.getName() + " 승리");
        } else if (result < 0) {
            System.out.println(sabina.getName() + " 승리");
        } else {
            System.out.println("무승부");
        }
    }
}
