class NotElegable extends Exception {
    NotElegable(String str) {
        super(str);
    }
}

public class userDefinedExp {
    public static void main(String[] args) {
        int age = 00;
        try {
            if (age < 12) {
                throw new NotElegable("Under Age");
            } else {
                System.out.println("Yes, you can vote now.");
            }
        } catch (NotElegable e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
