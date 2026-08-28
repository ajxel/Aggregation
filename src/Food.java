public class Food {
    String typeOfFood;
    int amountOfFood;

    Food(String typeOfFood, int amountOfFood) {
        this.typeOfFood = typeOfFood;
        this.amountOfFood = amountOfFood;
    }
    String displayInfo(){

        return " | " + this.typeOfFood + " x" + this.amountOfFood;
    }
}
