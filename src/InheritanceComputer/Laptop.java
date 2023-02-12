package InheritanceComputer;

    public class Laptop extends Computer {

        //1 additional property
        private String laptopColor;

        public Laptop(String brandName, double GB, boolean OLEDScreen) {
            super(brandName, GB, OLEDScreen);
        }

        //1 additional method
        public void ringTone() {
        }
    }

