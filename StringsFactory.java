// Factory Class
public class StringsFactory {

    public enum StringInstrument
    {
        VIOLIN ("violin"), GUITAR ("guitar");

        private String output;

        private StringInstrument(String output)
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

    public static Strings newStringInstrument(String name, StringInstrument stringInstrument){
        Strings s;

        if(stringInstrument == StringsFactory.StringInstrument.VIOLIN){
            s = new Violin(name);
        }

        else if(stringInstrument == StringsFactory.StringInstrument.GUITAR){
            s = new Guitar(name);

        } else {
            throw new IllegalArgumentException();
        }

        return s;
    }
}
