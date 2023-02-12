package InheritanceComputer;

    public class Computer {

        //3 properties
        public String brandName;
        private int GB;
        private boolean OLEDScreen;

        //a constructor
        public Computer(String brandName, int GB, boolean OLEDScreen) {
            this.brandName = brandName;
            this.GB = GB;
            this.OLEDScreen = OLEDScreen;
        }

        public String toString(){//overriding the toString() method
            return "Brandname:" + brandName + ", GB:" + GB + ", this device has an OLEDScreen:" + OLEDScreen;
        }

        //2 methods
            public void playSongs() {
        }

            public void turnOnComputer() {
        }
    }
