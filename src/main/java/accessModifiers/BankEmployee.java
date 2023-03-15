package accessModifiers;

public class BankEmployee {
        public static void main(String[] args) {
            Client client = new Client();
            System.out.println(client.name);
            System.out.println(client.address);
    //System.out.println(client.ssn);cannot see because ssn is private

            System.out.println(client.isMarried);
        }
    }

