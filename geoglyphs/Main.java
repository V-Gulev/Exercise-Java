package geoglyphs;

public class Main {
    public static void main(String[] args) {
        Location nazcaPlateau = new Location("Nazca Plateau");
        Location atacamaDesert = new Location("Atacama Desert");
        Location australia = new Location("Australia");

        Geoglyph hummingBird = new Geoglyph("Hummingbird", "bird figure", 93, "removing soil");
        Geoglyph monkey = new Geoglyph("Monkey", "animal figure", 90, "removing soil");

        Geoglyph atacamaGiant = new Geoglyph("Atacama Giant", "human figure", 119, "arranging stones");
        Geoglyph llama = new Geoglyph("Llama Geoglyph", "animal figure", 30, "removing soil");

        Geoglyph bunjil = new Geoglyph("Bunjil", "bird figure", 30, "arranging stones");
        Geoglyph marreeMan = new Geoglyph("Marree Man", "human figure", 4200, "removing soil");


        System.out.println(nazcaPlateau.addGeoglyph(hummingBird));
        System.out.println(nazcaPlateau.addGeoglyph(monkey));
        System.out.println(nazcaPlateau.getLargestGeolyph());

        atacamaDesert.addGeoglyph(atacamaGiant);
        atacamaDesert.addGeoglyph(llama);

        australia.addGeoglyph(bunjil);
        australia.addGeoglyph(marreeMan);

        System.out.println(nazcaPlateau.removeGeoglyph("Monkey"));
        System.out.println(nazcaPlateau.getCount());

        System.out.println(atacamaDesert.getGeoglyphByName("Atacama Giant"));

        System.out.println(nazcaPlateau.getGeoglyphsByConstructionTechnique("arranging stones"));
        System.out.println(nazcaPlateau.getGeoglyphsByConstructionTechnique("removing soil"));

        System.out.println(australia.removeGeoglyph("Brewarrina Fish Traps"));
        System.out.println(australia.getCount());

        System.out.println(nazcaPlateau.getStatistics());
        System.out.println(australia.getStatistics());

    }
}
