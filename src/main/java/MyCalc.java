public class MyCalc {
    int add(int a, int b) {
        return a + b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int div(int a, int b) {
        return a/ b;
    }

    int min(int a, int b) {
        return Math.min(a, b);
    }

    int max(int a, int b) {
        return Math.max(a, b);
    }

    boolean equal(int a, int b) {
        return a == b;
    }

    int mux(int x, int n) {
        return (int) Math.pow(x, n);
    }

    int qrt(int x) {
        return x * x;
    }

    int progression(int x, int d, int n) {
        return x + d * (n - 1);
    }

    int sumProgression(int x, int d, int n) {
        return (2 * x + d * (n - 1)) * n / 2;
    }
}
