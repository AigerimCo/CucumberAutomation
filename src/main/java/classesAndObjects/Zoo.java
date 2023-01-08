package classesAndObjects;

public class Zoo {

  public static void main(String[] args) {

    Animal elephant = new Animal(); //222333
    Animal lion = new Animal(); //222334
    Animal mouse = new Animal(); // 222335
    Animal chicken = new Animal();//222336

    elephant.type = "elephant";
    elephant.color = "gray";
    elephant.size = "large";
    elephant.name = "Dumbo";

    lion.type = "cat";
    lion.color = "yellow";
    lion.size = "medium";
    lion.name = "Alex";

    //METHODS, ACTIONS, FUNCTIONALITIES
    elephant.eats();
    elephant.sleeps();

    lion.plays();
    lion.eats();


  }
}

