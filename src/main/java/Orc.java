public class Orc extends Race implements Range {

    public Orc(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public void run() {
        System.out.println("бежит");
    }

    @Override
    public void attack1() {
        System.out.println("стреляет из лука");
    }

    @Override
    public void attack2() {
        System.out.println("стреляет из арбалета");
    }

    @Override
    public void protection() {
        System.out.println("уворачивается");
    }
}
