public class CustomStringMethodsRunner {
    public static void main(String [] args) {

        CustomStringMethods methods = new CustomStringMethods();

        boolean bool = methods.longerThan("I like turtles", 2);
        System.out.println(bool);
        String str = methods.funnyString("Bananas are yellow", 5);
        System.out.println(str);
        str = methods.halvesReversed("Jerry had a farm that he never took care of.");
        System.out.println(str);
        str = methods.pigLatin("noodles");
        System.out.println(str);
        str = methods.removeCharacter("pokemon", 3);
        System.out.println(str);
        str = methods.insertAt("I take the train", "N ", "tra");
        System.out.println(str);
        str = methods.endUp("holy cow!", 4);
        System.out.println(str);
        str = methods.yellOrWhisper("What did you say?");
        System.out.println(str);

    }
}

