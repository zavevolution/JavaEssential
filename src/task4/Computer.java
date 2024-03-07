package task4;

public class Computer {
}

class TestComputer {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        for (int i = 0; i < 5; i++) {
            computers[i] = new Computer();
        }

        System.out.println(computers);
    }
}
