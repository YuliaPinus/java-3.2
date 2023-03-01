public class Main {
    public static void main(String[] args) {
        BmiService bodyMassIndex = new BmiService();
        float weightKilogram = 98;
        float heightMetre = 1.87F;

        int myBodyMassIndex = bodyMassIndex.calculate(weightKilogram, heightMetre);
        System.out.println(myBodyMassIndex);
    }
}
