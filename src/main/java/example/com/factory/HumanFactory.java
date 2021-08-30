package example.com.factory;

import example.com.enums.UnitType;
import example.com.units.Unit;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class HumanFactory extends Factory {
    @Override
    public HashMap<UnitType, List<Unit>> createArmy() {
        HashMap<UnitType, List<Unit>> humanArmy = new HashMap<>();
        humanArmy.put(UnitType.WIZARD, new LinkedList<>());
        return null;
    }
}
