package ch.bbw.cge.cluedo.model;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DataService
 * @author Christian Gebert
 * @version 14.09.2023
 */
@Service
public class DataService {
    private final List<Person> PERSONS = List.of(
            new Person("Mustard", "Colonel", "yellow"),
            new Person("Scarlett", "Miss", "red"),
            new Person("White", "Mrs.", "white"),
            new Person("Green", "Mayor", "#0cd00c"),
            new Person("Peacock", "Mrs.", "#1192f7"),
            new Person("Plum.", "Professor", "#673147"),
            new Person("Peach.", "Miss", "#ff9a8a"),
            new Person("Brunette", "Monsieur", "#987554")
    );

    private final List<Weapon> WEAPONS = List.of(
            new Weapon("Candlestick"),
            new Weapon("Revolver"),
            new Weapon("Dagger"),
            new Weapon("Lead Pipe"),
            new Weapon("Rope"),
            new Weapon("Wrench")
    );

    private final List<Room> ROOMS = List.of(
            new Room("Bathroom"),
            new Room("Study"),
            new Room("Dining Room"),
            new Room("Game Room"),
            new Room("Garage"),
            new Room("Bedroom"),
            new Room("Living Room"),
            new Room("Kitchen"),
            new Room("Courtyard")
    );

    public List<Person> getPersons() {
        return PERSONS;
    }
    public List<Weapon> getWeapons() {
        return  WEAPONS;
    }
    public List<Room> getRooms() {
        return  ROOMS;
    }
}