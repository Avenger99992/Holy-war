package example.com;

import example.com.enums.Races;
import example.com.enums.UnitType;
import example.com.factory.Factory;
import example.com.units.Unit;

import java.util.HashMap;
import java.util.List;

public class Actions {
    private static HashMap<UnitType, List<Unit>> army1;
    private static HashMap<UnitType, List<Unit>> army2;

    public void createArmies() {
        Races race1 = Races.getRandomRace();
        Factory factory1 = Factory.getFactory(race1);
        Factory factory2 = Factory.getFactory(Races.getRandomRace(race1));
    }
}
