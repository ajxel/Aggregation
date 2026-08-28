public class Storage {
    String nameOfStorage;
    int storageCapacity;
    Food[] foods;
    int totalFood;
    Storage(String name, int numOfFruits, Food[] foods) {
        this.nameOfStorage = name;
        this.storageCapacity = numOfFruits;
        this.foods = foods;
    }
    void displayStorage() {
        System.out.println("Name: " + nameOfStorage);
        System.out.println("Capacity: " + storageCapacity);

        for (Food food : foods) {
            System.out.println(food.displayInfo());
            totalFood += food.amountOfFood;
        }
        int remainingCapacity = storageCapacity - totalFood;
        System.out.println("Remaining capacity: " + remainingCapacity);
    }

}
