package theater;

/**
 * Class representing a play, with a name (str) and genre (str).
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // name getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // type getter and setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
