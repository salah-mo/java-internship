package week1.Task1;

public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person(25);
        System.out.println("Person's age: " + person.getAge());

        // Create a Building object
        Building building = new Building(100.5);
        System.out.println("Building's height: " + building.getHeight());

        // Create a Weather object
        Weather weather = new Weather(true);
        System.out.println("Is it raining? " + weather.isRaining());

        // Create a City object
        City city = new City("New York");
        System.out.println("City's name: " + city.getName());
    }
}