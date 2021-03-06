public class Battle {
    public void start() {
        Human human = new Human("Артас", "рыцарь");
        Orc orc = new Orc("Тралл", "лучник");

        //Начало
        System.out.println(human.specialization.toString() + " " + human.name.toString() + " и " + orc.specialization.toString() + " " + orc.name.toString() + " сошлись в битве!");

        //Атака
        human.printName();
        human.attack();
        orc.printName();
        orc.protection();

        //Контратака
        orc.printName();
        orc.attack1();
        human.printName();
        human.protection();

        //Попытка убежать
        human.printName();
        human.run();
        orc.printName();
        orc.attack2();

        //Не получилось((
        human.printName();
        human.death();

        //Конец
        System.out.println("Бой окончен! Беру портвейн, иду домой.");
    }

}
