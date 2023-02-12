package InterfaceCar;

    public class Car implements Vehicle {
        private int gear;
        private int speed;
        private String name;

        public Car(String name) {
        this.name = name;
    }

        @Override
        public void changeGear(int newGear) {
        gear = newGear;
        System.out.println(name +  " er i " + gear + " gear");
        }

        @Override
        public void speedUp(int acceleration) {
        speed = speed + acceleration;
        System.out.println(name + "s fart er " + speed + " km/t");
        }

        @Override
        public void applyBrakes(int deceleration) {
        speed = speed - deceleration;
        System.out.println(name + " bremser og farten ender på " + speed + " km/t " );
        }
    }