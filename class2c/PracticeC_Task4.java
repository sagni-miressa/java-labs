package class2c;

class CounterInstance {
    int count = 0; // Instance field (re-initialized to 0 for every new object)

    public void increment() {
        count++;
        System.out.println("Instance Count: " + count);
    }
}

class CounterStatic {
    static int count = 0; // Static field (shared across all instances)

    public void increment() {
        count++;
        System.out.println("Static Count: " + count);
    }
}

public class PracticeC_Task4 {
    public static void main(String[] args) {
        System.out.println("--- Testing Instance Counter ---");
        CounterInstance inst1 = new CounterInstance();
        CounterInstance inst2 = new CounterInstance();
        inst1.increment(); // Prints 1
        inst2.increment(); // Prints 1 (Predict: Each object maintains its own count)

        System.out.println("\n--- Testing Static Counter ---");
        CounterStatic stat1 = new CounterStatic();
        CounterStatic stat2 = new CounterStatic();
        stat1.increment(); // Prints 1
        stat2.increment(); // Prints 2 (Predict: Shared state increments across instances)
    }
}