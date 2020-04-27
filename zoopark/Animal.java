package zoopark;

import java.util.ArrayList;

public abstract class Animal {

    ArrayList<Food> food = new ArrayList();

    public Animal(String name, String сharacter) {
        this.name = name;
        this.сharacter = сharacter;
        
        food.add(new MeatFood("Мясо", 5));
        food.add(new PlantBasedFood("Трава", 10));
    }

    String name;
    String сharacter;


    abstract void eat(String f);

}

///////////////////////////////Травоядные животные////////////////////////////
abstract class Herbivores extends Animal {

    public Herbivores(String name, String сharacter) {
        super(name, сharacter);
    }

}


//////////////////////////Жираф////////////////////////////////
class Giraffe extends Herbivores {

    public Giraffe(String name, String сharacter) {
        super(name, сharacter);
    }

    @Override
    void eat(String f) {
            if (food.get(1).name.equals(f)) {
                System.out.println("Я " + name + " и я ем траву");
            }
            else{System.out.println("Я " + name + " и я не ем эту гадость");}
        
    }

}
//////////////////////////Лемур////////////////////////////////

class Lemur extends Herbivores {

    public Lemur(String name, String сharacter) {
        super(name, сharacter);
    }

    @Override
    void eat(String f) {
        if (food.get(1).name.equals(f)) {
                System.out.println("Я " + name + " и я ем траву");
            }
            else{System.out.println("Я " + name + " и я не ем эту гадость");}
    }

}

//////////////////////////Плотоядные животные////////////////////////////////
abstract class Carmivorous extends Animal {

    public Carmivorous(String name, String сharacter) {
        super(name, сharacter);
    }

}

//////////////////////////Лев////////////////////////////////
class Lion extends Carmivorous {

    public Lion(String name, String сharacter) {
        super(name, сharacter);
    }

    @Override
    void eat(String f) {
            if (food.get(0).name.equals(f)) {
                System.out.println("Я " + name + " и я ем мясо");
            }
            else{System.out.println("Я " + name + " и я не ем эту гадость");}
        
    }

}
//////////////////////////Тигр////////////////////////////////

class Tiger extends Carmivorous {

    public Tiger(String name, String сharacter) {
        super(name, сharacter);
    }

    @Override
    void eat(String f) {
            if (food.get(0).name.equals(f)) {
                System.out.println("Я " + name + " и я ем мясо");
            }
            else{System.out.println("Я " + name + " и я не ем эту гадость");}
        
    }

}
