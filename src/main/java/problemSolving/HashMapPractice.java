package problemSolving;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
    /*
        City city = new City();
        city.addCity("Chicago", 8400000000);
        city.addCity("New York", 856223521);
        city.printCities();
        city.removeCity("New York");
        city.updateCity("Chicago", 1234567852);
        city.getCity("Chicago");

     */
    }

    /*
    create String name
    instance int population
    instance HashMap cityMap

    create method
    void addCity(String name, int population)-add the city information to the map
    String getCity(String name)-returns all info==>"Chicago 9 million"
    void updateCity(String name, int population)=>update with new info
    void remove city(String name)remove city from the map
    void printCities()print all cities in the Map
     */
    String name;
    int population;
    HashMap<String, Integer> cityMap = new HashMap();

    public void addCity(String name,int population) {
        cityMap.put(name, population);
    }

    public String getCity(String name){
        return name + " " + cityMap.get(name);
        }

    void updateCity(String name, int population){
        addCity(name,population);
        }
        public void removeCity(String name){
        cityMap.remove(name);
        }
       public void printCities(){
        for(String key: cityMap.keySet()){
            System.out.println(key + " " + cityMap.get(key));
        }

        }


}
