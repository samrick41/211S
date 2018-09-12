//This code drives the parent relationship of Instrument > Strings > Violin and Guitar

import java.util.*;
/* M1 HOMEWORK DRIVER
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
}*/

//M2 HOMEWORK DRIVER
//public class InstrumentDriver {
//    public static void main(String[] args) {
//        ArrayList<Violin> violinList = new ArrayList<>();
//        ArrayList<Violin> violinList2 = new ArrayList<>();
//
//        Violin myViolin = new Violin(4259.42, 260.89, 4, 1965, "MyViolin", Strings.Type.ACOUSTIC, "G D A E", "wood", "Giovanni Vistavo");
//        Violin brothersViolin = new Violin(4259.42, 260.89, 4, 1981, "BrothersViolin", Strings.Type.ACOUSTIC, "G D A E", "synthetic", "Giovanni Vistavo");
//        Violin newViolin = new Violin(4259.42, 260.89, 4, 2012, "NewViolin", Strings.Type.ELECTRONIC, "G D A E", "wood", "James Fields");
//        Violin oldViolin = new Violin(4259.42, 260.89, 4, 1908, "OldViolin", Strings.Type.ACOUSTIC, "G D A E", "Wood", "Johann Bistolli");
//
//        violinList.add(myViolin);
//        violinList.add(brothersViolin);
//        violinList.add(oldViolin);
//        violinList.add(newViolin);
//
//        violinList2.add(oldViolin);
//        violinList2.add(newViolin);
//
//        System.out.println("list in order of objects added");
//        listprint(violinList);
//        Collections.sort(violinList);
//        System.out.println("\n list in order of objects by year \n");
//        listprint(violinList);
//
//        listprint2(violinList2);
//
//    }
//
//    public static void listprint (ArrayList<Violin> list)
//    {
//        for (Violin i : list)
//        {
//            System.out.println(i.getName() + " made in " + i.getYear());
//
//        }
//    }
//
//    public static void listprint2 (ArrayList<Violin> list)
//    {
//        for (Violin i : list)
//        {
//            System.out.println("\n" + i.getName() + " is " + i.getType());
//            i.clean();
//        }
//    }
//}

//M3 HOMEWORK DRIVER
public class InstrumentDriver {
    public static void main(String[] args) {
        ArrayList<Violin> violinList = new ArrayList<>();
        ArrayList<Strings> stringsList2 = new ArrayList<>();

        Violin myViolin = new Violin(4259.42, 260.89, 4, 1965, "MyViolin", Strings.Type.ACOUSTIC, new BowCleaner(), "G D A E", "wood", "Giovanni Vistavo");
        Violin brothersViolin = new Violin(4259.42, 260.89, 4, 1981, "BrothersViolin", Strings.Type.ACOUSTIC, new BowCleaner(), "G D A E", "synthetic", "Giovanni Vistavo");
        Violin newViolin = new Violin(4259.42, 260.89, 4, 2012, "NewViolin", Strings.Type.ELECTRONIC, new BowCleaner(), "G D A E", "wood", "James Fields");
        Violin oldViolin = new Violin(4259.42, 260.89, 4, 1908, "OldViolin", Strings.Type.ACOUSTIC, new BowCleaner(), "G D A E", "Wood", "Johann Bistolli");
        Violin copyOldViolin = new Violin(4259.42, 260.89, 4, 1908, "AlsoOldViolin", Strings.Type.ACOUSTIC, new BowCleaner(), "G D A E", "Wood", "Johann Bistolli");

        Strings myGuitar = StringsFactory.newStringInstrument("MyGuitar", StringsFactory.StringInstrument.GUITAR); // M3 Using Factory
        myGuitar.setType(Strings.Type.ELECTRONIC);
        myGuitar.setCleaner(new NoBowCleaner());

        Violin myOtherViolin = new Violin.ViolinBuilder("MyOtherViolin") // M3 Using Builder
                .bow("wood")
                .luthier("Andrew Goleppi")
                .year(1955)
                .build();

        violinList.add(myViolin);
        violinList.add(brothersViolin);
        violinList.add(oldViolin);
        violinList.add(newViolin);
        violinList.add(copyOldViolin);

        stringsList2.add(myOtherViolin);
        stringsList2.add(myGuitar);

        System.out.println("list in order of objects added");
        listprint(violinList);
        Collections.sort(violinList, Violin.YEAR_NAME_COMPARATOR);
        System.out.println("\n list in order of objects by year then by name \n");
        listprint(violinList);

        listprint2(stringsList2);

        System.out.println("\n + Violin constructed using Builder, Guitar constructed using Factory");
    }

    public static void listprint (ArrayList<Violin> list) // Uses Comparator
    {
        for (Violin i : list)
        {
            System.out.println(i.getName() + " made in " + i.getYear());

        }
    }

    public static void listprint2 (ArrayList<Strings> list) // Uses Strategy Pattern
    {
        for (Strings i : list)
        {
            System.out.println("\n" + i.getName() + " is " + i.getType());
            i.clean();
        }
    }
}