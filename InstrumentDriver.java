//This code drives the parent relationship of Instrument > Strings > Violin and Guitar

import java.util.*;
public class InstrumentDriver
{
    public static void main(String[] args)
    {
        ArrayList<Instrument> instrumentlist = new ArrayList<>();

        Violin myViolin = new Violin(4259.42, 260.89, 4, 1965, "acoustic", "MyViolin", "G D A E", "wood", "Giovanni Vistavo");
        Violin brothersViolin = new Violin(4259.42, 260.89, 4, 1981, "acoustic", "BrothersViolin", "G D A E", "synthetic", "Giovanni Vistavo");
        Guitar myGuitar = new Guitar(4167.25, 2000, 6, "acoustic", "MyGuitar", "D A D F# A D", "Fender", "Stratocaster", "single");

        instrumentlist.add(myViolin);
        instrumentlist.add(brothersViolin);
        instrumentlist.add(myGuitar);

        for (Instrument i : instrumentlist)
        {
            System.out.println(i.getName() + " highest pitch is: " + i.getHighPitch() + "Hz");

            if (i instanceof Guitar)
            {
                ((Guitar)i).strum();
            }
        }
    }
}