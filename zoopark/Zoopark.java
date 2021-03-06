
package zoopark;


public class Zoopark {

    
    public static void main(String[] args) {
        Enclosure e = new Enclosure();
        
        //Добавление хищников в вольер, лимит 2, если добавить 3 животное, то появится предупреждающая надпись
        e.addAnimalCarmivorous(new Lion("Лев - Петя", "Злой"));
        e.addAnimalCarmivorous(new Tiger("Тигр - Вася", "Добрый"));
        System.out.println();
        
        //Добавление травоядных в вольер, лимит 2
        e.addAnimalHerbivores(new Giraffe("Жираф - Столб","Спокойный"));
        e.addAnimalHerbivores(new Lemur("Лемур - Лень","Медленный"));
        System.out.println();
        
        //кормление животных, два варианта еды Мясо и Трава, если перепутать еду, то появится предупреждающая надпись
        e.feedingCarmivorous("Мясо");
        System.out.println();
        e.feedingHerbivores("Трава");
        
        
    }
    
}




