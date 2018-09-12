public abstract class Strings extends Instrument
{
    private Cleaner cleaner;

    public enum Type
    {
        ACOUSTIC ("acoustic"), ELECTRONIC ("electronic");

        private String output;

        private Type(String output)
        {
            this.output = output;
        }

        public String getOutput()
        {
            return output;
        }

        @Override
        public String toString(){
            return output;
        }

    }

    private int stringNumber;
    private Type type;
    private String tuning;

    public Strings(double highPitch, double lowPitch, int stringNumber, Type type, String name, String tuning, Cleaner cleaner)
    {
        super(highPitch, lowPitch, name);
        this.stringNumber = stringNumber;
        this.type = type;
        this.tuning = tuning;
        this.cleaner = cleaner;
    }

    public Strings(int stringNumber, Type type, String name, String tuning, Cleaner cleaner)
    {
        this(DEFAULT_HIGH_PITCH, DEFAULT_LOW_PITCH, stringNumber, type, name, tuning, cleaner);
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

    public Type getType()
    {
        return type;
    }

    public void setType(Type type)
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

    public Cleaner getCleaner() {
        return cleaner;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
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
        if (obj!= null && obj instanceof Strings)
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

    public void clean(){ // M3 USING STRATEGY
        cleaner.clean(this);
    }

    public void tune()
    {
        System.out.println("Tuning " + getName());
    }

    public void restring()
    {
        System.out.println("Restringing " + getName());
    }
}