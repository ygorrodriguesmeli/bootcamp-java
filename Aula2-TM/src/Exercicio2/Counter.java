package Exercicio2;

public class Counter {
    private int counter;

    public Counter() {}

    public Counter(int counter) {
        this.counter = counter;
    }

    public Counter(Counter counter) {
        this.counter = counter.counter;
    }

    public void add(int value) {
        this.counter += value;
    }

    public void sub(int value) {
        if(this.counter > 0) {
            this.counter -= value;
        }
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
