package designpatterns.prototype;

public class FootballPlayer implements Cloneable {
    private String name;
    private String lastName;
    private int age;
    private String position;

    public FootballPlayer(){

    }

    public FootballPlayer(String name, String lastName, int age, String position){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        FootballPlayer tmpPlayer = new FootballPlayer();
        tmpPlayer.name = this.name;
        tmpPlayer.lastName = this.lastName;
        tmpPlayer.age = this.age;
        tmpPlayer.position = this.position;
        return tmpPlayer;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
