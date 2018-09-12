public class BowCleaner implements Cleaner {

    @Override
    public void clean(Strings strings){
        System.out.print("Cleaning bow and " + strings.getName());
        if (strings.getType() == Strings.Type.ELECTRONIC)
        {
            System.out.print(" and amplifier");
        }
        System.out.print("\n");
    }
}
