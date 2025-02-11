package tanks;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Terrain {
    private String type;
    private List<Tank> tanks;
    private int area;

    public Terrain(String type, int area) {
        this.type = type;
        this.tanks = new ArrayList<>();
        this.area = area;
    }

    public String addTank(Tank tank) {
        boolean alreadyExist = false;
        if (this.type.equals("Swamp") && tank.getWeight() > 14000) {
            return String.format("This %s is too heavy for this terrain!", tank.getBrand());
        } else {
            for (Tank tank1 : this.tanks) {
                if (tank1.getBrand().equals(tank.getBrand()) && tank1.getModel().equals(tank.getModel())) {
                    alreadyExist = true;
                }
            }
        }
        if (alreadyExist) {
            return "Tank with this brand and model already exists!";
        } else{
            this.tanks.add(tank);
            return String.format("Tank %s %s added.", tank.getBrand(), tank.getModel());
        }
    }

    public boolean removeTank(String brand, String model){
        for (Tank tank : this.tanks) {
            if (tank.getBrand().equals(brand) && tank.getModel().equals(model)){
                this.tanks.remove(tank);
                return true;
            }
        }
        return false;
    }

    public String getTanksByBarrelCaliberMoreThan(int barrelCaliber){
        List<String> brands = new ArrayList<>();
        for (Tank tank : this.tanks) {
            if (tank.getBarrelCaliber() > barrelCaliber) {
                brands.add(tank.getBrand());
            }
        }

        if (brands.isEmpty()) {
            return "There are no tanks with the specified caliber.";
        } else {
            return String.format("Tanks with caliber more than %dmm: %s", barrelCaliber, String.join(", ", brands));
        }
    }

    public Tank getTankByBrandAndModel(String brand, String model){
        for (Tank tank : this.tanks) {
            if (tank.getBrand().equals(brand) && tank.getModel().equals(model)) {
                return tank;
            }
        }
        return null;
    }


    public String getTheMostArmoredTank() {
        Tank thickestTank = this.tanks.stream().sorted((o1, o2) -> Integer.compare(o2.getArmor(), o1.getArmor())).toList().get(0);
        return String.format("%s %s is the most armored tank with %dmm. armor thickness."
                , thickestTank.getBrand(), thickestTank.getModel(), thickestTank.getArmor());
    }

    public int getCount(){
        return this.tanks.size();
    }

    public String getStatistics(){
        StringBuilder result = new StringBuilder();
        if (this.tanks.isEmpty()){
            return String.format("There are no tanks in the %s.", this.type.toLowerCase(Locale.ROOT));
        }
        result.append(String.format("Tanks located in the %s:", this.type.toLowerCase(Locale.ROOT)));
        for (Tank tank : this.tanks) {
            result.append(System.lineSeparator());
            result.append(String.format("-- %s %s", tank.getBrand(), tank.getModel()));
        }
        return result.toString();
    }

}
