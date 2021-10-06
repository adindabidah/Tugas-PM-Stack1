public class StackAdinda<AD> {
    public AD[] fungsi;
    public int aljabar = 0;

    public StackAdinda(int y) {
        fungsi = (AD[]) new Object[y];
    }
    public boolean isEmpty() {
        return aljabar == 0;
    }
    public boolean isFull() {
        return aljabar == fungsi.length;
    }
    public void push(AD value) {
        if ( !isFull() ) {
            fungsi[aljabar] = value;
            aljabar = aljabar + 1;
        } else {
            System.out.println("Stack penuh!");
        }
    }
    public AD pop() {
        if ( !isEmpty() ) {
            aljabar = aljabar - 1;
            AD r = fungsi[aljabar];
            return r;
        } else {
            return null;
        }
    }
    public AD peek() {
        if ( !isEmpty() ) {
            return fungsi[aljabar - 1];
        } else {
            return null;
        }
    }
}
