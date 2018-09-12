import java.util.*;
public class Violin extends Strings implements Comparable<Violin> {

    public static int totalViolins = 0; // / M2 HOMEWORK STATIC static variable
    private int year;
    private String bow;
    private String luthier;

    public static final Type DEFAULT_VIOLIN_TYPE = Type.ACOUSTIC;
    public static final int DEFAULT_VIOLIN_STRING_NUMBER = 4;
    public static final String DEFAULT_VIOLIN_TUNING = "G D A E";
    public static final Cleaner CLEANER = new BowCleaner();

    public final static Comparator<Violin> YEAR_NAME_COMPARATOR = new ViolinComparator();

    public Violin(double highPitch, double lowPitch, int stringNumber, int year, String name, Type type, Cleaner cleaner,
                  String tuning, String bow, String luthier) {
        super(highPitch, lowPitch, stringNumber, type, name, tuning, cleaner);
        this.year = year;
        this.bow = bow;
        this.luthier = luthier;
        totalViolins++;
    }

    public Violin(String name) {
        super(name);
        setType(DEFAULT_VIOLIN_TYPE);
        setStringNumber(DEFAULT_VIOLIN_STRING_NUMBER);
        setTuning(DEFAULT_VIOLIN_TUNING);
        setCleaner(CLEANER);
        totalViolins++;
    }

    private Violin(ViolinBuilder builder){ // M3 Builder, I limited it to accessing a few variables,
        // then the other constructors default the rest
        this(builder.getName());
        this.year = year;
        this.bow = bow;
        this.luthier = luthier;
    }

    public static class ViolinBuilder {
        private String name;
        private int year = 0;
        private String bow = "";
        private String luthier = "";

        public ViolinBuilder(String name) {
            this.name = name;
        }

        public String getName()
        {
            return name;
        }

        public ViolinBuilder year(int var) {
            this.year = var;
            return this;
        }

        public ViolinBuilder bow(String var) {
            this.bow = var;
            return this;
        }

        public ViolinBuilder luthier(String var) {
            this.luthier = var;
            return this;
        }

        public Violin build() {
            return new Violin(this);
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBow() {
        return bow;
    }

    public void setBow(String bow) {
        this.bow = bow;
    }

    public String getLuthier() {
        return luthier;
    }

    public void setLuthier(String luthier) {
        this.luthier = luthier;
    }

    private static class ViolinComparator implements Comparator<Violin>{ // M3 COMPARATOR

        @Override
        public int compare(Violin v1, Violin v2) {
            if ((Integer.compare(v1.getYear(), v2.getYear())) == 0) {
                return v1.getName().compareToIgnoreCase(v2.getName());
            } else {
                return Integer.compare(v1.getYear(), v2.getYear());
            }
        }
    }

    @Override
    public String toString() {
        String parentString = super.toString();
        parentString += "." + " Bow type is " + bow + " made by " + luthier + " in " + year + ".";
        return parentString;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Violin) {
            Violin otherViolin = (Violin) obj;
            return super.equals(obj) && year == otherViolin.year
                    && bow.equals(otherViolin.bow) && luthier.equals(otherViolin.luthier);
        } else {
            return false;
        }
    }

    // compareTo method
    @Override
    public int compareTo(Violin other) {
        return Integer.compare(this.year, other.year);
    }

    public static void inventoryViolin(int quantity) { // / M2 HOMEWORK STATIC static method
        if (totalViolins > quantity) {
            System.out.println((totalViolins - quantity) + " violins available for sale");
        } else if (totalViolins < quantity) {
            System.out.println((quantity - totalViolins) + " violins to buy");
        } else {
            System.out.println("Do not buy or sell");
        }
    }

    public static void buy(int quantity) {
        System.out.println("Buying violins");
        totalViolins += quantity;

    }

    public static void sell(int quantity) {
        System.out.println("Selling violins");
        totalViolins -= quantity;
    }

    public void rosin() {
        System.out.println("Rosining up bow ");
    }

    public void bow() {
        System.out.println("Playing " + getName());
    }

}
