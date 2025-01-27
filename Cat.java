// LAB03 template — CMPINF 0401, Fall 2026
// Use this if your LAB02 solution is incomplete.

public class Cat {

    static String catName = "Dobby";
    static int furnitureDestroyed = 0;

    static String destroyFurniture() {
        furnitureDestroyed = furnitureDestroyed + 1;
        return "Total pieces of furniture destroyed: " + furnitureDestroyed;
    }

    static String meow(String sound) {
        return catName + " says " + sound;
    }

    static String describeCat(String name, int age) {
        return "My cat " + name + " is " + age + " years old.";
    }

    static String createFunnyStory(String name, String story) {
        return "My cat " + name + " " + story;
    }

    static String introduceCat(String name, int age, String sound, String story) {
        catName = name;
        return describeCat(name, age) + "\n"
             + meow(sound) + "\n"
             + createFunnyStory(name, story) + "\n"
             + destroyFurniture();
    }

    // TODO Task 2: classifyAge(age) returns "Kitten" (0-1), "Adult" (2-10) or "Senior" (11+)

    // TODO Task 2: recommendActivity(age, energyLevel) returns a high- (7-10), moderate- (4-6)
    //              or low-energy (1-3) activity
    // Exception: Senior cats do not get a high-energy activity

    // TODO Task 0: move this main method to App.java, then delete it here.
    // In App.java, every call needs the class name: Cat.introduceCat(...)
    public static void main(String[] args) {

        System.out.println("Welcome to CatTales!");
        System.out.println("--------------------");

        // TODO Task 1: ask the user for name, sound, age, story and energy level
        //              (readUserText / readUserNumber in App.java) and pass them in here
        //              instead of the hard-coded values
        System.out.println(introduceCat("Dobby", 3, "MEOW!!!", "climbed the roof."));

        // TODO Task 2: print the age category and the recommended activity
    }
}
