public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return x / y;
    }
}

