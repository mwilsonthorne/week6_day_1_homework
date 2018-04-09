public class Calculator {
    private int int1;
    private int int2;

    public Calculator(int int1, int int2){
        this.int1 = int1;
        this.int2 = int2;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    public void setInt2(int int2) {
        this.int2 = int2;
    }

    public int getAdd(){
        return int1 + int2;
    }

    public int getSubtract(){
        return int1 - int2;
    }

    public int getMultiply(){
        return int1 * int2;
    }

    public int getDivide(){
        return int1 / int2;

    }


}
