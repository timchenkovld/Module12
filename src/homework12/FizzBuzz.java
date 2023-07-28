package homework12;

public class FizzBuzz {
    private int currentNumber;
    private int n;

    public FizzBuzz(int n) {
        this.currentNumber = 1;
        this.n = n;
    }

    public synchronized void fizz() {
        while (currentNumber <= n) {
            if (currentNumber % 3 == 0 && currentNumber % 5 != 0) {
                System.out.println("fizz ");
                currentNumber++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void buzz() {
        while (currentNumber <= n) {
            if (currentNumber % 3 != 0 && currentNumber % 5 == 0) {
                System.out.println("buzz ");
                currentNumber++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void fizzBuzz() {
        while (currentNumber <= n) {
            if (currentNumber % 3 == 0 && currentNumber % 5 == 0) {
                System.out.println("fizzbuzz ");
                currentNumber++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void number() {
        while (currentNumber <= n) {
            if (currentNumber % 3 != 0 && currentNumber % 5 != 0) {
                System.out.println(currentNumber + " ");
                currentNumber++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
