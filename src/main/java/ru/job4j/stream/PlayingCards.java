package ru.job4j.stream;

import java.util.stream.Stream;

public class PlayingCards implements GeneratingCards {

    @Override
    public void generating() {
        Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values())
                        .map(value -> new Card(suit, value)))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        new PlayingCards().generating();
    }
}
