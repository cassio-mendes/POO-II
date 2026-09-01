package aulaGenerics.exercicio02;

public class Employee {
    protected String name, profession;

    public Employee(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", profession='" + profession + '\'' + '}';
    }
}
