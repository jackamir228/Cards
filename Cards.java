import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Cards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String[] deckOfCards = {"2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "J♥", "Q♥", "K♥", "A♥", "2♦", "3♦", "4♦", "5♦", "6♦", "7♦", "8♦", "9♦", "10♦", "J♦", "Q♦", "K♦", "A♦", "2♠", "3♠", "4♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♠",
                "2♣", "3♣", "4♣", "5♣", "6♣", "7♣", "8♣", "9♣", "10♣", "J♣", "Q♣", "K♣", "A♣", "Black Joker", "Red Joker"};

        int cardsForPlayer = 5;//на каждого игрока будет раздаваться по пять карт
        int players = 0; //количество игроков
        int amountCards = deckOfCards.length; //количество карт
        //проверка введенных значений
        System.out.println("\nВведите количество игроков от 2 до 10: ");
        if (scan.hasNextInt()) {
            players = scan.nextInt();
            if (players < 2 || players > 10) {
                System.out.println("Указано неверное количество игроков");
                System.exit(0);
            }
        }

        //вывод игроков
        for (int i = 0; i < players; i++) {
            System.out.println("\nКарты игрока" + (i + 1) + ":");

            //выдача карт
            for (int j = 0; j < cardsForPlayer; j++) {
                int randCards = random.nextInt(deckOfCards.length);
                if (deckOfCards[randCards] != null) {
                    System.out.print(deckOfCards[randCards] + " ");
                    deckOfCards[randCards] = null;
                } else {
                    j--;
                }
            }
        }
    }
}
