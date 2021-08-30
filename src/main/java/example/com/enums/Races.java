package example.com.enums;

import example.com.utils.Generator;

public enum Races {
    HUMAN, ORC, ELVES, UNDEAD;

    public static Races getRandomRace() {
        return Races.values()[Generator.getRandomInt(3)];
    }

    public static Races getRandomRace(Races race) {
        Races randomRace;
        do {
            randomRace = Races.values()[Generator.getRandomInt(3)];
        } while(randomRace.ordinal() == race.ordinal());
        return randomRace;
    }
}
