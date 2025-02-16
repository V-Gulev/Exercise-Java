package ships;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Harbor {
    private String location;
    private int minDepth;
    private List<Ship> ships;

    public Harbor(String location, int minDepth) {
        this.location = location;
        this.minDepth = minDepth;
        this.ships = new ArrayList<>();
    }

    public String addShip(Ship ship) {
        for (Ship ship1 : this.ships) {
            if (ship1.getName().equals(ship.getName())) {
                return "Ship with this name already exists!";
            }
        }
        if (ship.getDraft() > this.minDepth) {
            return String.format("The ship %s cannot dock due to draft limitations!", ship.getName());
        } else {
            this.ships.add(ship);
            return String.format("Ship %s added to the harbor.", ship.getName());
        }
    }

    public boolean removeShip(String name){
        for (Ship ship : this.ships) {
            if (ship.getName().equals(name)) {
                this.ships.remove(ship);
                return true;
            }
        }
        return false;
    }

    public String getShipsByType(String type) {
        List<String> shipNames = new ArrayList<>();
        this.ships.stream().filter(ship -> ship.getType().equals(type)).forEach(ship -> shipNames.add(ship.getName()));
        if (shipNames.isEmpty()){
            return "There are no ships of the requested type.";
        } else {
            return String.format("Ships of type %s: %s", type, String.join(", ", shipNames));
        }
    }

    public Ship getShipByName(String name) {
        return this.ships.stream().filter(ship -> ship.getName().equals(name)).findFirst().orElse(null);
    }

    public String getLargestShip() {
        if (this.ships.isEmpty()) {
            return "No ships in the harbor.";
        }
        Ship largestShip = this.ships.stream().max((o1, o2) -> Integer.compare(o1.getTonnage(), o2.getTonnage())).orElse(null);
        return String.format("%s is the largest ship with a tonnage of %d tons.", largestShip.getName(), largestShip.getTonnage());
    }

    public int getCount(){
        return this.ships.size();
    }

    public String getStatistics(){
        if (this.ships.isEmpty()){
            return String.format("No ships docked in %s.", this.location);
        }
        StringBuilder result = new StringBuilder();
        result.append(String.format("Ships docked in %s:", this.location));

        for (Ship ship : this.ships) {
            result.append(System.lineSeparator());
            result.append(String.format("* %s", ship.getName()));
        }
        return result.toString();
    }
}

