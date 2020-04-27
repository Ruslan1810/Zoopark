
package zoopark;

import java.util.ArrayList;


public abstract class Food {
   String name;
   int quantity;

    public Food(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
   
   
}
//////////////////////////////////////////////Для хищников//////////////////////////////////////

class MeatFood extends Food{

    public MeatFood(String name, int quantity) {
        super(name, quantity);
    }

 
   
}

//////////////////////////////////////////////Для травоядных//////////////////////////////////////

class PlantBasedFood extends Food{

    public PlantBasedFood(String name, int quantity) {
        super(name, quantity);
    }


}