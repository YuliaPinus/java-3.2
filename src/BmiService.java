public class BmiService {
    public int calculate (float weightKilogram, float heightMetre) {
        float bodyMassIndex;
        bodyMassIndex = weightKilogram / (heightMetre * heightMetre);

        return (int) bodyMassIndex;
    }
}
