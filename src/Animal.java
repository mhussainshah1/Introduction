/**
 * This is a simple Java Bean Class
 * @author Muhammad Shah
 * @version 11
 */
public class Animal {
    //Field
    private String name;

    /**
     * get the name of animal
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * set the name of animal
     * @param name - name of animal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * run the program
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("welcome");
    }
}
