import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {

    private List<String> deck;
    private final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private int numOfCards;

    public DeckOfCards() {
        this.numOfCards = suits.length * ranks.length;
        this.deck = new ArrayList<>(numOfCards);
    }

    public void initializeDeck() {
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }
    }

    public void shuffleDeck() {
        for (int i = 0; i < numOfCards; i++) {
            int randomCardNumber = i + (int) (Math.random() * (numOfCards - i));
            String temp = deck.get(i);
            deck.set(i, deck.get(randomCardNumber));
            deck.set(randomCardNumber, temp);
        }
    }

    public List<List<String>> distributeCards(int x) {
        if (numOfCards % x != 0) {
            System.out.println("Cannot distribute cards evenly to " + x + " players.");
            return null;
        }

        int cardsPerPlayer = numOfCards / x;
        List<List<String>> players = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            players.add(new ArrayList<>());
        }

        for (int i = 0; i < numOfCards; i++) {
            players.get(i % x).add(deck.get(i));
        }
        return players;
    }

    public void printPlayersCards(List<List<String>> players) {
        if (players == null) return;
        for (int i = 0; i < players.size(); i++) {
            System.out.println("Player " + (i + 1) + " has cards: " + players.get(i));
        }
    }

    public static void main(String[] args) {
        DeckOfCards game = new DeckOfCards();
        game.initializeDeck();
        game.shuffleDeck();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.close();

        List<List<String>> players = game.distributeCards(numPlayers);
        game.printPlayersCards(players);
    }
}