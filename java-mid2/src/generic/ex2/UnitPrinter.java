package generic.ex2;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        System.out.println("이름: "+ shuttle.out().getName()+", HP: "+ shuttle.out().getHp());
    }

    public static void printV2(Shuttle<?> shuttle) {
        System.out.println("이름: "+ shuttle.out().getName()+", HP: "+ shuttle.out().getHp());
    }
}
