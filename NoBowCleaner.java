public class NoBowCleaner implements Cleaner{

    @Override
    public void clean(Strings strings){
        System.out.print("Cleaning " + strings.getName());
        if (strings.getType() == Strings.Type.ELECTRONIC)
        {
            System.out.print(" and amplifier");
        }
        System.out.print("\n");
    }
}

