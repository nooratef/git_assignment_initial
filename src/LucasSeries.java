public class LucasSeries implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        try {
            int LucasIndex = Integer.parseInt(input);
            System.out.println("Lucas Number is: " + Lucas(LucasIndex));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    int Lucas(int idx) throws Exception {
        if (idx <= 0) throw new Exception("Error: Lucas applied only for positive numbers.");
        return Lucas(idx, 1, 2); // Lucas series 2 1 3 4 7 11 18 29
    }

    private int Lucas(int idx, int value, int previous) {
        return (idx == 1 ? previous : Lucas(idx - 1, previous + value, value));
    }
}
