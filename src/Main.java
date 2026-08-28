public class Main {
    public static void main(String [] args) {

        Food slot1 = new Food("Apple", 6);
        Food slot2 = new Food("Bread", 7);
        Food slot3 = new Food("berries", 21);
        Food slot4 = new Food("Pie", 3);

        Food[] foods =  {slot1, slot2, slot3, slot4};

        Storage storage = new Storage("Food Storage", 40, foods);
        storage.displayStorage();
    }
}
