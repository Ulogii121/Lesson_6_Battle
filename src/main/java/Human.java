public class Human extends Race implements Melee {

    public Human(String name, String specialization) {
        super(name, specialization);
    }

        @Override
    public void run() {
        System.out.println("бежит");
    }

    @Override
    public void attack() {
        System.out.println("бьёт мечом");
    }

    @Override
    public void protection() {
        System.out.println("заслоняется щитом");
    }

}
