public class TestTuple {
    public static void main(String[] args) {
        int testsPassed = 0;

        Tuple<String, Integer> firstTuple = new Tuple("This is a string", 37);
        if (firstTuple.fst().equals("This is a string")) {
            System.out.println("First test passed!");
            testsPassed++;
        } else {
            System.out.println("FAIL: firstTuple.fst() should be 'This is a string', is: " + firstTuple.fst());
        }

        if (firstTuple.snd() == 37) {
            System.out.println("Second test passed!")
            testsPassed++;
        } else {
            System.out.println("FAIL: firstTuple.snd() should be 37, is: " + firstTuple.snd());
        }

        Tuple<Tuple<Double, Double>, Double> secondTuple = new Tuple(new Tuple(1, 2), 3);
        if (Math.abs(secondTuple.fst().fst() - 1) < 0.01) {
            System.out.println("Second test passed!")
            testsPassed++;
        } else {
            System.out.println("FAIL: secondTuple.fst().fst() should be 1, is: " + 
                secondTuple.fst().fst());
        }

        if (Math.abs(secondTuple.fst().snd() - 2) < 0.01) {
            System.out.println("Second test passed!")
            testsPassed++;
        } else {
            System.out.println("FAIL: secondTuple.fst().snd() should be 2, is: " + 
                secondTuple.fst().snd());
        }

        if (Math.abs(secondTuple.snd() - 3) < 0.01) {
            System.out.println("Third test passed!")
            testsPassed++;
        } else {
            System.out.println("FAIL: secondTuple.snd() should be 3, is: " + firstTuple.snd());
        }

        System.out.printf("%d tests passed out of 5\n", testsPassed);
        if (testsPassed == 5) {
            System.out.println("All tests passed!");
        }
    }
}
