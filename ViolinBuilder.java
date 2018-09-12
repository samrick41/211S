//public class Violin{
//
//    private int year;
//    private String bow;
//    private String luthier;
//
//    private Violin(ViolinBuilder builder){
//        this.year = year;
//        this.bow = bow;
//        this.luthier = luthier;
//    }
//
//    public static class ViolinBuilder {
//        private int year = 0;
//        private String bow = "";
//        private String luthier = "";
//
//        public ViolinBuilder() {
//
//        }
//
//        public ViolinBuilder year(int var) {
//            this.year = var;
//            return this;
//        }
//
//        public ViolinBuilder bow(String var) {
//            this.bow = var;
//            return this;
//        }
//
//        public ViolinBuilder luthier(String var) {
//            this.luthier = var;
//            return this;
//        }
//
//        public Violin build() {
//            return new Violin(this);
//        }
//    }
//
//
