public class Violin extends Strings
{
    private int year;
    private String bow;
    private String luthier;

    public static final String DEFAULT_VIOLIN_TYPE = "acoustic";
    public static final int DEFAULT_VIOLIN_STRING_NUMBER = 4;
    public static final String DEFAULT_VIOLIN_TUNING = "G D A E";

    public Violin(double highPitch, double lowPitch, int stringNumber, int year, String name, String type,
                  String tuning, String bow, String luthier)
    {
        super(highPitch, lowPitch, stringNumber, name, type, tuning);
        this.year = year;
        this.bow = bow;
        this.luthier = luthier;
    }

    public Violin(String name)
    {
        super(name);
        setType(DEFAULT_VIOLIN_TYPE);
        setStringNumber(DEFAULT_VIOLIN_STRING_NUMBER);
        setTuning(DEFAULT_VIOLIN_TUNING);
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

    @Override
    public String toString()
    {
        String parentString = super.toString();
        parentString += "." + " Bow type is " + bow + " made by " + luthier + " in " + year + ".";
        return parentString;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Violin)
        {
            Violin otherViolin = (Violin) obj;
            return super.equals(obj) && year == otherViolin.year
                    && bow.equals(otherViolin.bow) && luthier.equals(otherViolin.luthier);
        }
        else
            {
            return false;
        }
    }

    public void rosin()
    {
        System.out.println("Rosining up bow ");
    }

    public void bow()
    {
        System.out.println("Playing " + getName());
    }

    public void clean()
    {
        System.out.println("Cleaning bow and " + getName());
    }
}