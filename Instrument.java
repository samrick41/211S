import java.lang.Math.*;
public abstract class Instrument
{    
    private double highPitch;
    private double lowPitch;
    private String name;
    private int id;
    private static int instrumentCount;
    
    public static final double DEFAULT_HIGH_PITCH = 4186.01;
    public static final double DEFAULT_LOW_PITCH = 27.5;
   
    public Instrument(double highPitch, double lowPitch, String name)
    {  
        this.highPitch = highPitch;
        this.lowPitch = lowPitch;
        this.name = name;
    }

    public Instrument(String name)
    {
        this(DEFAULT_HIGH_PITCH, DEFAULT_LOW_PITCH, name);
    }

    public double getHighPitch()
    {
        return highPitch;
    }

    public void setHighpitch(double HighPitch)
    {
        this.highPitch = highPitch;
    }

    public double getLowPitch()
    {
        return lowPitch;
    }

    public void setLowPitch(double lowPitch)
    {
        this.lowPitch = lowPitch;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return name + " pitch range: " + lowPitch + "-" + highPitch + "Hz";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj != null && obj instanceof Instrument)
        {
            Instrument otherInstrument = (Instrument) obj;
            double otherInstrumentHighPitch = otherInstrument.highPitch;
            double otherInstrumentLowPitch = otherInstrument.lowPitch;
            String otherInstrumentName = otherInstrument.name;

            if (Math.abs(highPitch - otherInstrumentHighPitch) < 0.0001 && Math.abs(lowPitch - otherInstrumentLowPitch) < 0.0001
                    && name.equals(otherInstrumentName))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    public void ship()
    {
        System.out.println("Shipping " + name);
    }

    public void buy()
    {
        System.out.println("Buying " + name);
    }

    public void sell()
    {
        System.out.println("Selling " + name);
    }

    public abstract void clean();
}