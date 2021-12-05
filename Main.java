package lesson4;

public class Main {
    public static void main(String[] args) {
        doPhoneBook();
//        WordsArray wordsArray = new WordsArray(createArrayWords());
//        wordsArray.doArrayWords();
    }

    private static void doPhoneBook(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoeBook( name: "Shum", phone: "89670049199");
        phoneBook.addElementPhoeBook( name: "Shum", phone: "89670049198");
        phoneBook.addElementPhoeBook( name: "Shum", phone: "89670049197");

        phoneBook.addElementPhoeBook( name: "Art", phone: "88888");
        phoneBook.addElementPhoeBook( name: "Art", phone: "88889");
        phoneBook.addElementPhoeBook( name: "Art", phone: "88888   ");
        phoneBook.addElementPhoeBook( name: "Art", phone: "888 88  8");
        phoneBook.addElementPhoeBook( name: "Art", phone: "8 88  8  8");

        System.out.println("Shum: " + phoneBook.getPhonesByName("Shum"));
        System.out.println("Art: " + phoneBook.getPhonesByName("Art"));
        System.out.println("Alex: " + phoneBook.getPhonesByName("Alex"));
        System.out.println("Max: " + phoneBook.getPhonesByName("Max"));
    }

    private static String[] createArrayWords() {
        String [] strings = new String[10];
        strings[0] = "Mama";
        strings[1] = "Papa";
        strings[2] = "Brat";
        strings[3] = "Babula";
        strings[4] = "Dedula";
        strings[5] = "Kozula";
        strings[6] = "Slon";
        strings[7] = "Gnom";
        strings[8] = "Hudoy";
        strings[9] = "Krivoi";
        return strings;
    }
}
