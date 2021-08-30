package example.com.factory;

import example.com.enums.UnitType;
import example.com.units.Unit;

import java.util.HashMap;
import java.util.List;

public class OrcFactory extends Factory {
    @Override
    public HashMap<UnitType, List<Unit>> createArmy() {
        return null;
    }
}
