public abstract class Race {
    protected String name, specialization;

    public Race(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public abstract void run();

    public void printName() {
        System.out.print(name.toString() + " ");
    }

    public void death() {
        System.out.println("погиб!");
    }

    @Override
    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
