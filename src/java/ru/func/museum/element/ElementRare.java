package ru.func.museum.element;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ElementRare {
    USUAL(5, 100, .1, "Обыная", "новый"),
    RARE(5, 500, .3, "Редкая", "редкий"),
    AMAZING(5, 2000, .6, "Финоминальная", "феноминальный"),
    FANTASTIC(8, 100000, 1.1,"Неизведанная", "ранее неизвестный"),
    ;

    private final int rareScale;
    private final int cost;
    private final double increase;
    private final String name;
    private final String word;
}
