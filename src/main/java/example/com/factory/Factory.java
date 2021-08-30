package example.com.factory;

import example.com.enums.Races;
import example.com.enums.UnitType;
import example.com.units.Unit;

import java.util.HashMap;
import java.util.List;

public abstract class Factory {
    public abstract HashMap<UnitType, List<Unit>> createArmy();

    public static Factory getFactory(Races races) {
        return switch(races) {
            case ORC -> new OrcFactory();
            case ELVES -> new ElvesFactory();
            case HUMAN -> new HumanFactory();
            case UNDEAD -> new UndeadFactory();
        };
    }
}
