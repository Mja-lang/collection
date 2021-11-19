package Mujahid;

public abstract class Animal {
    private String name;
    private String [] typelist = {"C", "D", "T" , "R", "Br", "Bu", "Fi", "Fr", "GP", "Ha", "He", "L"};
    private String typename;

    public Animal(String name, int index) {
        this.name = name;
        typename = typelist[index];
    }

    public String typereturn() {
        return typename;
    }

    public String toString() {
        return name;
    }
}
