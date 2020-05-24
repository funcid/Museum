package ru.func.museum.excavation.generator;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import ru.func.museum.element.Element;
import ru.func.museum.element.ElementType;

/**
 * @author func 22.05.2020
 * @project Museum
 */
public interface ExcavationGenerator {

    void generateAndShow(Player player, Material[] blockType, ElementType... elementType);
}
