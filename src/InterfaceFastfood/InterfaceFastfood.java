package InterfaceFastfood;

import java.util.ArrayList;

    public class InterfaceFastfood {
        public static void InterfaceFastfoodEx(){

            ArrayList<Fastfood> fastfoodObjects = new ArrayList<Fastfood>();
            Fastfood pizza = new Pizza();
            Fastfood sandwich = new Sandwich();
            Fastfood burger = new Bubbletea();

            fastfoodObjects.add(pizza);
            fastfoodObjects.add(sandwich);
            fastfoodObjects.add(burger);


        for (Fastfood fastfoodObject : fastfoodObjects) {
            fastfoodObject.foodIsDelicious();
            System.out.println("Not my favorite: " + fastfoodObject.foodIsGross());
            System.out.println("");
            }
        }
    }