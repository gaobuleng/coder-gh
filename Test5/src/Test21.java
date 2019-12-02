enum Money {
    ONE, TWO, THREE, FOUR, FIVE;

    public static void describe(Money m) {
        switch (m) {
            case ONE:
                System.out.println("111");
                break;
            case TWO:
                System.out.println("222");
                break;
            case THREE:
                System.out.println("333");
                break;
            case FOUR:
                System.out.println("444");
                break;
            case FIVE:
                System.out.println("555");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
    }

public class Test21 {
    public static void main(String[] args) {
        for (Money p : Money.values()) {
            System.out.println(p + " ordinal:" + p.ordinal());
            Money.describe(p);
        }
    }
}
