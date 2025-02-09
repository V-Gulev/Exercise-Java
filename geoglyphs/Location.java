package geoglyphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Location {
    private String name;
    private Collection<Geoglyph> geoglyphs;

    public Location(String name) {
        this.name = name;
        this.geoglyphs = new ArrayList<>();
    }


    public String addGeoglyph(Geoglyph geoglyph) {
        for (Geoglyph geoglyph1 : this.geoglyphs) {
            if (geoglyph1.getName().equals(geoglyph.getName())) {
                throw new IllegalArgumentException("This geoglyph exists in the location!");
            }
        }
        this.geoglyphs.add(geoglyph);
        return String.format("%s added to %s.", geoglyph.getName(), this.name);
    }


    public boolean removeGeoglyph(String name){
        for (Geoglyph geoglyph : this.geoglyphs) {
            if (geoglyph.getName().equals(name)) {
                this.geoglyphs.remove(geoglyph);
                return true;
            }
        }
        return false;
    }


    public String getGeoglyphsByConstructionTechnique(String constructionTechnique){
        List<Geoglyph> matches = this.geoglyphs.stream().filter(geoglyph -> geoglyph.getConstructionTechnique().equals(constructionTechnique)).toList();

        if (matches.isEmpty()){
            return String.format("There are no geoglyphs made by %s in this location.", constructionTechnique);
        } else {
            List<String> names = new ArrayList<>();
            matches.forEach(geoglyph -> names.add(geoglyph.getName()));
            return String.format("Geoglyphs made by %s: %s", constructionTechnique, String.join(", ", names));
        }
        
    }

    public String getLargestGeolyph(){
        Geoglyph largestGeolyph = this.geoglyphs.stream().sorted((o1, o2) -> Integer.compare(o2.getSize(), o1.getSize())).toList().get(0);
        return String.format("The largest geoglyph is %s with a length of %d meters.", largestGeolyph.getName(), largestGeolyph.getSize());
    }

    public Geoglyph getGeoglyphByName(String name) {
        for (Geoglyph geoglyph : this.geoglyphs) {
            if (geoglyph.getName().equals(name)){
                return geoglyph;
            }
        }
        return null;
    }

    public int getCount(){
        return this.geoglyphs.size();
    }

    public String getStatistics(){
        if (this.geoglyphs.isEmpty()){
            return String.format("No geoglyphs have yet been discovered in %s.", this.name);
        }
        StringBuilder statistic = new StringBuilder();
        statistic.append(String.format("Geoglyphs located in %s:", this.name));
        this.geoglyphs.forEach(geoglyph -> {
            statistic.append(System.lineSeparator());
            statistic.append("* ").append(geoglyph.getName());
        });
        return statistic.toString();
    }
}
