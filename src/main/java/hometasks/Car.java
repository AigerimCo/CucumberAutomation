package hometasks;

    public class Car {

        String type;
        String tires;
        String wheel;
        String window;
        String lights;
        String color;
        int year;
        double price;

        // drive, stop, heat, cool, playMusic, isExpensive
        public void drives() {
            System.out.println(color + " " + type + " " + tires + " " + wheel + " " + window + " " + lights + " "   + "is driving");
        }

        public void stops(){
            System.out.println(color + " " + type + " " + tires + " " + wheel + " " + window + " " + lights + " "   + "is stopping");
        }
        public void heats(){
            System.out.println(color + " " + type + " " + tires + " " + wheel + " " + window + " " + lights + " "   + "is heating");
        }
        public void cools(){
            System.out.println(color + " " + type + " " + tires + " " + wheel + " " + window + " " + lights + " "   + "is cooling");
        }
        public void playsMusic(){
            System.out.println(color + " " + type + " " + tires + " " + wheel + " " + window + " " + lights + " which is " + year  + " is playingMusic");
        }
        public void isExpensive(){
            System.out.println(color + " " + type + " " + tires + " " + wheel + " " + window + " " + lights + " it cost " + price  + " which " + "isExpensive");
        }

    }


    class Garage {
        public static void main (String[] args) {

            Car object1  = new Car();
            Car object2  = new Car();
            Car object3  = new Car();
            Car object4  = new Car();

            object1.type = "Mercedes";
            object1.tires = "Michelin";
            object1.wheel = "alloy";
            object1.window = "tinted";
            object1.lights = "green";
            object1.color = "Black";
            object1.year = 2020;
            object1.price = 39999.99;

            object2.type = "RangeRover";
            object2.tires = "Yokohama";
            object2.wheel = "carbon";
            object2.window = "regular";
            object2.lights = "blue";
            object2.color = "Silver";
            object2.year = 2019;
            object2.price = 29999.99;

            object3.type= "Lexus";
            object3.tires = "Pirelli";
            object3.wheel = "forged";
            object3.window = "tinted";
            object3.lights = "red";
            object3.color = "Metallic Purple";
            object3.year = 2018;
            object3.price = 19999.99;

            object4.type = "Toyota";
            object4.tires = "Continental";
            object4.wheel = "steel";
            object4.window = "regular";
            object4.lights = "yellow";
            object4.color = "Electric Blue";
            object4.year = 2017;
            object4.price = 9999.99;

            object1.drives();
            object1.stops();
            object1.heats();
            object1.cools();
            object1.playsMusic();
            object1.isExpensive();

            object2.drives();
            object2.stops();
            object2.heats();
            object2.cools();
            object2.playsMusic();
            object2.isExpensive();

            object3.drives();
            object3.stops();
            object3.heats();
            object3.cools();
            object3.playsMusic();
            object3.isExpensive();

            object4.drives();
            object4.stops();
            object4.heats();
            object4.cools();
            object4.playsMusic();
            object4.isExpensive();

        }
    }
