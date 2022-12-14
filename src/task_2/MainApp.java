package task_2;

public class MainApp {
    public static void main(String[] args) {
        Monitor monitorFirst = new Monitor("LG", 29000, "AB1789", 567, 789);
        Monitor monitorSecond = new Monitor("LG", 29000, "AB1789", 567, 789);
        EthernetAdapter ethernetAdapterFirst = new EthernetAdapter("Toshiba", 15000, "NP387", 23987, "NVB");
        EthernetAdapter ethernetAdapterSecond = new EthernetAdapter("Toshiba", 15000, "NP387", 23987, "NVBSS");

        System.out.println(monitorFirst);
        System.out.println(ethernetAdapterFirst);

        System.out.println(monitorFirst.equals(monitorSecond));
        System.out.println(ethernetAdapterFirst.equals(ethernetAdapterSecond));

        System.out.println(monitorFirst.hashCode() == monitorSecond.hashCode());
        System.out.println(ethernetAdapterFirst.hashCode() == ethernetAdapterSecond.hashCode());

    }
}
