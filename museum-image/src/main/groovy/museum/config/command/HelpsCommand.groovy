@groovy.transform.BaseScript(museum.MuseumScript)
package museum.config.command

import clepto.bukkit.menu.Guis

import static org.bukkit.Material.PAPER

registerCommand 'helps' handle {
    Guis.open player, 'helps', player
}

Guis.register 'helps', {
    title 'Часто задаваемые вопросы'
    layout """
        -X--X--X-
        X-X-X-X-X
        -X--X--X-
        """
    button 'X' icon {
        item PAPER
        text """&bЧто нужно делать в режиме Музей?

        Ходить в экспедиции, на них
        копать нужные блоки, получая
        опыт и увеличивая этим свой уровень.
        """
    }

    button 'X' icon {
        item PAPER
        text """&bКак попасть на экспедиции?

        Нужно зайти в "Меню" (Листок, 
        1 слот в твоём инвентаре), нажать 
        на "Экспедиции" (Компас) и выбери 
        одну из списка.
        """
    }

    button 'X' icon {
        item PAPER
        text """&bКакие есть кирки и где их взять?

        Для этого нужно нажать "Меню" 
        (1 слот инвентаря), а затем 
        на предмет "Кирки" (Золотая кирка). 
        В ней ты можешь приобрести различные 
        кирки. Всего их 4 уровня: Стандартная, 
        Профессиональная за 30.000\$, 
        престижная за 200.000\$ , 
        легендарная за 5.000.000\$.
        """
    }

    button 'X' icon {
        item PAPER
        text """&bКак пользоваться лавкой?

        Для работы лавки нужно 
        заказать в "Меню" (Листок) 
        товар (Правый верхний угол, 
        вагонетка с сундуком).
        Дальше подойти к Олегу (290 -400), 
        забрать груз и добежать 
        обратно до лавки. (280 -270)
        """
    }

    button 'X' icon {
        item PAPER
        text """&bМожно играть с другом?

        Нет, это одиночный режим, 
        но ваш друг может посетить 
        ваш музей, если вы находитесь 
        на 1 сервере с помощью команды 
        /museum visit Ник или же через 
        пункт "Посмотреть музеи", 
        4 слот инвентаря.
        """
    }

    button 'X' icon {
        item PAPER
        text """&bДает ли что-то декор?

        Нет, весь декор создан 
        лишь для создания красивого 
        образа вашего музея.
        """
    }

    button 'X' icon {
        item PAPER
        text """&bСтранные вещи, что с ними делать?

        Это вещи - артефакты, 
        их нужно продавать, 
        для этого достаточно кликнуть 
        пкм или же просто ничего не 
        делать и после вашего возвращения 
        в музей они автоматически 
        все продадутся.
        """
    }

    button 'X' icon {
        item PAPER
        text """&bКакие способы есть получения денег?

        Заработок денег осуществляется: 
        путем нахождения дубликатов 
        фрагментов, продажи артефактов 
        с раскопок, дохода от лавки и 
        самое главное: монеток с жителей, 
        которые собирает коллектор.
        """
    }

    button 'X' icon {
        item PAPER
        text """&bЕсть много разных блоков, для чего они?

        Алмазный, золотой для витрин, 
        изумрудный для декора, 
        лазуритный для фонтанов, 
        угольный для лавок, 
        железный для коллектора.
        """
    }

    button 'X' icon {
        item PAPER
        text """&bКак увеличить стоимость монеты?

        Ставить новых динозавров на 
        витрины, прокачивать уровни
        витрины.
        """
    }

    button 'X' icon {
        item PAPER
        text """&bНа что мне копить и тратить деньги?

        Первые деньги вы можете
        потратить на закупку груза 
        в лавку. Дальше лучше всего 
        потратиться на покупку 
        малых витрин.
        """
    }
}