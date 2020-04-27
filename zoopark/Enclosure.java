package zoopark;

import java.util.ArrayList;

public class Enclosure {

    int countHerbivores = 0;
    int countCarmivorous = 0;
    int limit = 2;

    ArrayList<Herbivores> arrHerb = new ArrayList();
    ArrayList<Carmivorous> arrCarm = new ArrayList();
    
    

    void addAnimalHerbivores(Herbivores h) {
        if (countHerbivores < limit) {
            arrHerb.add(h);
            countHerbivores++;
            System.out.println("В вольере " + countHerbivores + " растительноядных животных");
        } else {
            System.out.println("В вольере " + countHerbivores + " растительноядных животных и мест больше нет");
        }
    }

    void addAnimalCarmivorous(Carmivorous c) {
        if (countCarmivorous < limit) {
            arrCarm.add(c);
            countCarmivorous++;
            System.out.println("В вольере " + countCarmivorous + " хищных животных");
        } else {
            System.out.println("В вольере " + countCarmivorous + " хищников и мест больше нет");
        }
    }

    void feedingHerbivores(String f) {
        for (int i = 0; i < arrHerb.size(); i++) {
            arrHerb.get(i).eat(f);
        }
    }
    
    void feedingCarmivorous(String f) {
        for (int i = 0; i < arrCarm.size(); i++) {
            arrCarm.get(i).eat(f);
        }
    }

}
