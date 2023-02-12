package InterfaceFastfood;

    public class Bubbletea implements Fastfood {
        @Override
        public void foodIsDelicious() {
        System.out.println("Very delicious boba!");
    }

        @Override
        public boolean foodIsGross() {
        return false;
    }
    }