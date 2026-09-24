public class Human {//для задачи 2.1
    public int height;
    public Name name;
//field name here
    public Human(int height,Name name) {
        this.name=name;
        this.height=height;
    }

    public String toString() {
        return name.toString() + ", рост: " + height;
    }
}



