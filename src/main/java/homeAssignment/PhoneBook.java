package homeAssignment;

import java.util.HashMap;

public class PhoneBook {

        private HashMap<String, String> phoneBook;

        public PhoneBook() {

            phoneBook = new HashMap<>();
        }


        // 1. Create a method to add a new contact to the phonebook
        public void addContact(String name, String phoneNumber) {

            phoneBook.put(name, phoneNumber);

        }

        // 2. create a method to remove a contact from the phonebook
        public void removeContact(String name) {

            phoneBook.remove(name);
        }

        // 3. create a method to update a contact's phone number
        public void updateContact(String name, String newPhoneNumber) {

            phoneBook.replace(name, newPhoneNumber);

        }


        // 4. Method to search for a contact's phone number
        public String searchContact(String name) {

            return phoneBook.get(name);

        }

        // 5. Create main method and test all your above methods with three different sets of data.
// Call each method 3 times using different data.
        public static void main(String[] args) {

            PhoneBook phoneBook1 = new PhoneBook();
            phoneBook1.addContact("Jerry", "1245751234");
            phoneBook1.removeContact("Jerry");
            phoneBook1.addContact("Alice", "8501112323");
            phoneBook1.updateContact("Alice", "3127894455");
            phoneBook1.searchContact("Alice");
            System.out.println("phoneBook1.searchContact(\"Alice\") = " + phoneBook1.searchContact("Alice"));

        }
    }



