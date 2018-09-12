import java.util.*;
public class Test {
    public static void main (String[] args) {
//
////        Instrument test0 = new Instrument(30.2323, 210.234, "Piano");
////        Instrument test1 = new Instrument(30.2323, 210.234, "Piano");
////        Instrument test2 = new Instrument(30.2323, 210, "Piano");
////        System.out.println(test0.equals(test2));
////        test0.ship();
////        test0.buy();
////        test0.sell();
//
////        Strings myStrings = new Strings(3592.65, 208.98, 4, "acoustic", "Generic Viola", "C G D A");
////        Strings copyStrings = new Strings(3592.65, 208.98, 4, "acoustic", "Generic Viola", "C G D A");
////        Strings otherStrings = new Strings(3592.65, 208.98, 4, "electric", "Generic Viola", "C G D A");
////        System.out.println(myStrings.equals(otherStrings));
////        System.out.println(myStrings);
////        System.out.println(otherStrings);
//
////        Guitar test = new Guitar("test");
////        System.out.println(test);
////        test.tune();
//
//
//        //       Instrument myViolin = new Violin(4259.42, 260.89, 4, 1965, "acoustic", "MyViolin", "G D A E", "wood", "Giovanni Vistavo");
////        Violin copyViolin = new Violin(4259.42, 260.89, 4, 1965, "acoustic", "MyViolin", "G D A E", "wood", "Giovanni Vistavo");
////        Violin brothersViolin = new Violin(4259.42, 260.89, 4, 1981, "acoustic", "BrothersViolin", "G D A E", "synthetic", "Giovanni Vistavo");
////        System.out.println(myViolin.equals(copyViolin));
////        System.out.println(myViolin);
//        //      ((Violin) myViolin).tune();
////        System.out.println(copyViolin);
//
////        Guitar test3 = new Guitar(3000, 2000, 6, "acoustic", "MyGuitar", "dadf#ad", "Fender", "Stradicaster", "single");
////        Guitar test4 = new Guitar(3000, 2000, 6, "acoustic", "MyGuitar", "dadf#ad", "Fender", "Stradicaster", "single");
////        Guitar test5 = new Guitar(3000, 2000, 6, "acoustic", "MyGuitar", "dadf#ad", "Gibson", "Stradicaster", "single");
////        System.out.println(test3.equals(test5));
////        System.out.println(test3);
////        System.out.println(test5);
////        System.out.println(test3.getname());
////        test3.strum();
////        test3.pick();
//
////      Violin violin1 = new Violin("BasicStrings");
////        System.out.println(violin1);
////       Guitar guitar1 = new Guitar("GuitarName");
////        System.out.println(guitar1);
////        Violin myViolin0 = new Violin(4259.42, 260.89, 4, 1965, "acoustic", "MyViolin", "G D A E", "wood", "Giovanni Vistavo");
////        Violin brothersViolin = new Violin(4259.42, 260.89, 4, 1981, "acoustic", "BrothersViolin", "G D A E", "synthetic", "Giovanni Vistavo");
////        System.out.println("number of violins " + Violin.totalViolins);
////        Violin.inventoryViolin(5);
////        System.out.println(Violin.totalViolins);
////        Violin.inventoryViolin(1);
////        System.out.println(Violin.totalViolins);
////        Violin.inventoryViolin(2);
////        System.out.println(Violin.totalViolins);
////        Violin.buy(3);
////        System.out.println(Violin.totalViolins);
////        Violin[] al = new Violin[2];
////        al[0] = brothersViolin;
////        al[1] = myViolin0;
////        Arrays.sort(al);
////        System.out.println(Arrays.toString(al));
//
//
////        public enum WatchBandMaterial {
////            LEATHER("leather"), METAL("link"), NYLON("nylon"), RUBBER("rubber");
////
////            private String output;
////
////            private WatchBandMaterial(String output) {
////                this.output = output;
////            }
////
////            public String getOutput() {
////                return output;
////            }
////
////            @Override
////            public String toString() {
////                return output;
////            }
////        }
//        ArrayList<Violin> violinList = new ArrayList<>();

        Violin myViolin = new Violin(4259.42, 260.89, 4, 1965, "MyViolin", Strings.Type.ACOUSTIC, new BowCleaner(), "G D A E", "wood", "Giovanni Vistavo");
        Violin brothersViolin = new Violin(4259.42, 260.89, 4, 1981, "BrothersViolin", Strings.Type.ACOUSTIC, new BowCleaner(), "G D A E", "synthetic", "Giovanni Vistavo");
        Violin newViolin = new Violin(4259.42, 260.89, 4, 2012, "NewViolin", Strings.Type.ELECTRONIC, new BowCleaner(), "G D A E", "wood", "James Fields");
        Violin oldViolin = new Violin(4259.42, 260.89, 4, 1908, "OldViolin", Strings.Type.ACOUSTIC, new BowCleaner(), "G D A E", "Wood", "Johann Bistolli");
        Violin copyOldViolin = new Violin(4259.42, 260.89, 4, 1908, "AlsoOldViolin", Strings.Type.ACOUSTIC, new BowCleaner(), "G D A E", "Wood", "Johann Bistolli");
        Guitar myGuitar = new Guitar(4259.42, 260.89, 4, "MyGuitar", Strings.Type.ELECTRONIC, new NoBowCleaner(), "G D A E", "Wood", "Johann Bistolli", "neck");

//        violinList.add(myViolin);
//        violinList.add(brothersViolin);
//        violinList.add(oldViolin);
//        violinList.add(newViolin);
//        violinList.add(copyOldViolin);
//
//        System.out.println("list in order of objects added");
//        listprint(violinList);
//        Collections.sort(violinList, Violin.YEAR_NAME_COMPARATOR);
//        System.out.println("\n list in order of objects by year \n");
//        listprint(violinList);
//    }
//
//    public static void listprint (ArrayList < Violin > list)
//    {
//        for (Violin i : list) {
//            System.out.println(i.getName() + " made in " + i.getYear());
//
//        }
//    }
        myViolin.clean();
        myGuitar.clean();
    }
}