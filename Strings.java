public abstract class Strings extends Instrument
{
    private int stringNumber;
    private String type;
    private String tuning;

    public Strings(double highPitch, double lowPitch, int stringNumber, String type, String name, String tuning)
    {
        super(highPitch, lowPitch, name);
        this.stringNumber = stringNumber;
        this.type = type;
        this.tuning = tuning;
    }

    public Strings(int stringNumber, String type, String name, String tuning)
    {
        this(DEFAULT_HIGH_PITCH, DEFAULT_LOW_PITCH, stringNumber, type, name, tuning);
    }

    public Strings(String name)
    {
        super(name);

    }

    public int getStringNumber()
    {
        return stringNumber;
    }

    public void setStringNumber(int stringNumber)
    {
        this.stringNumber = stringNumber;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getTuning()
    {
        return tuning;
    }

    public void setTuning(String tuning)
    {
        this.tuning = tuning;
    }

    @Override
    public String toString()
    {
        return type + " " + getName() + " pitch range: " + getLowPitch() + "-" + getHighPitch() + " Hz" +
            " with " + stringNumber + " strings, tuned to: " + tuning;

    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Strings)
        {
            Strings otherStrings = (Strings) obj;
            return super.equals(obj) && stringNumber == otherStrings.stringNumber
                    && type.equals(otherStrings.type) && tuning.equals(otherStrings.tuning);
        }

        else
        {
            return false;
        }
    }

    public abstract void clean();

    public void tune()
    {
        System.out.println("Tuning " + getName());
    }

    public void restring()
    {
        System.out.println("Restringing " + getName());
    }
}