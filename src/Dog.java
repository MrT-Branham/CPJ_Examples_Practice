/**
 * Represents a basic dog that can fetch and speak.
 */
public class Dog {
    public static final String GENUS = "Canis";
    private String speech;
    private String name;

    public Dog(String dogName, String dogSpeech){
        speech = dogSpeech;
        name = dogName;
    }

    /**
     * Dog retrieves specified object.
     * @param thing what was thrown to the dog
     * @return the object picked up by the dog
     */
    public Object fetch(Object thing){
        return thing;
    }

    /**
     * Prints the dog's speech to the console.
     */
    public void speak() {
        System.out.println(speech);
    }
}
