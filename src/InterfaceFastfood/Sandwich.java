package InterfaceFastfood;

    public class Sandwich implements Fastfood {
        @Override
        public void foodIsDelicious() {
        System.out.println("Very delicious sandwich!");
    }
        @Override
        public boolean foodIsGross() {
        return false;
    }
    }