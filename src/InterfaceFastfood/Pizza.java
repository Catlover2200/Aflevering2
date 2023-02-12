package InterfaceFastfood;

    public class Pizza implements Fastfood {
        @Override
        public void foodIsDelicious() {
        System.out.println("This pizza is not delicious!");
    }
        @Override
        public boolean foodIsGross() {
        return true;
    }
    }