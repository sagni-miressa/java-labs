package class2c;

class VariableDemo {
    // Instance variables (Default: int -> 0, String -> null, double -> 0.0, boolean -> false)
    int instanceInt; 
    String instanceString;

    // Static variables (Default: int -> 0)
    static int staticCount; 

    public void demonstrateLocalVariable() {
        // Local variable (Must be explicitly initialized before use)
        int localVal = 10; 
        System.out.println("Local Variable localVal: " + localVal);
    }
}

public class PracticeC_Task3 {
    public static void main(String[] args) {
        VariableDemo demo = new VariableDemo();

        System.out.println("Instance Variable instanceInt default: " + demo.instanceInt);
        System.out.println("Instance Variable instanceString default: " + demo.instanceString);
        System.out.println("Static Variable staticCount default: " + VariableDemo.staticCount);

        demo.demonstrateLocalVariable();
    }
}