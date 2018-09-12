public class Guitar extends Strings
{
    private String make;
    private String model;
    private String neck;

    public static final Type DEFAULT_GUITAR_TYPE = Type.ACOUSTIC;
    public static final int DEFAULT_GUITAR_STRING_NUMBER = 6;
    public static final String DEFAULT_GUITAR_TUNING = "E A D G B E";
    public static final Cleaner CLEANER = new NoBowCleaner();


    public Guitar(double highPitch, double lowPitch, int stringNumber, String name, Type type, Cleaner cleaner,
                  String tuning, String make, String model, String neck)
    {
        super(highPitch, lowPitch, stringNumber, type, name, tuning, cleaner);
        this.make = make;
        this.model = model;
        this.neck = neck;
    }

    public Guitar(String name)
    {
        super(name);
        setType(DEFAULT_GUITAR_TYPE);
        setStringNumber(DEFAULT_GUITAR_STRING_NUMBER);
        setTuning(DEFAULT_GUITAR_TUNING);
        setCleaner(CLEANER);
    }

    public String getMake() 
    {
        return make;
    }

    public void setMake(String make) 
    {
        this.make = make;
    }

    public String getModel() 
    {
        return model;
    }

    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getNeck() 
    {
        return neck;
    }

    public void setNeck(String neck) 
    {
        this.neck = neck;
    }

    @Override
    public String toString()
    {
        String parentString = super.toString();
        parentString += "." + " Make and model is " + make + " " + model + ", and neck is " + neck + ".";
        return parentString;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj != null && obj instanceof Guitar)
        {
            Guitar otherGuitar = (Guitar) obj;
            return super.equals(obj) && make.equals(otherGuitar.make)
                    && model.equals(otherGuitar.model) && neck.equals(otherGuitar.neck);
        }

        else
        {
            return false;
        }
    }

    public void strum()
    {
        System.out.println("Strumming " + getName());
    }

    public void pick()
    {
        System.out.println("Picking " + getName());
    }

    @Override
    public void tune()
    {
        System.out.println("Determining strings....Retuning " + getName());
    }
}