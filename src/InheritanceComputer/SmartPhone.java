package InheritanceComputer;

    public class SmartPhone extends Computer{

        //1 additional property
        private String smartPhoneColor;
        public SmartPhone(String brandName, int GB, boolean OLEDScreen) {
        super(brandName, GB, OLEDScreen);
    }

        //1 additional method
        public void ringTone(){
        }
    }