package aulaGenerics.exercicio02;

public class Manager extends Employee {
    private static int managerID = 0;
    private final int ID;

    public Manager(String name, String profession) {
        super(name, profession);
        this.ID = managerID;
        managerID++;
    }

    @Override
    public String toString() {
        return "Manager{" +  "ID=" + ID +  ", name='" + name + '\'' +  ", profession='" + profession + '\'' +  '}';
    }
}
