package homework12;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        Thread threadA = new Thread(() -> fizzBuzz.fizz());
        Thread threadB = new Thread(() -> fizzBuzz.buzz());
        Thread threadC = new Thread(() -> fizzBuzz.fizzBuzz());
        Thread threadD = new Thread(() -> fizzBuzz.number());

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
