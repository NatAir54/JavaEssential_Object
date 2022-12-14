package task_5;

public class MainApp {
    public static void main(String[] args) {
        Animal animalFirst = new Animal("Neja", 9, true);
        Animal animalSecond = new Animal("Tailless", 5, false);

        System.out.println(animalFirst);
        System.out.println(animalSecond);

        System.out.println(animalFirst.equals(animalSecond));
        System.out.println(animalFirst.hashCode() == animalSecond.hashCode());

    }
}
