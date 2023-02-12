package InterfaceCar;

   public class InterfaceCar {
        public static void InterfaceCarEx() {
           Car obel = new Car("Obel");
           obel.changeGear(8);
           obel.speedUp(130);
           obel.applyBrakes(15);

           System.out.println("");

           Car ford = new Car("Ford");
           ford.changeGear(6);
           ford.speedUp(90);
           ford.applyBrakes(10);

           System.out.println("");
         }
   }