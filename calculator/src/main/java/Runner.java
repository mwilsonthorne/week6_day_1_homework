public class Runner {

    public static void main(String[] args) {

        Calculator interger = new Calculator(4, 2);

        System.out.println("For adding the two intergers together = " + interger.getAdd() + " is the correct answer!");
        System.out.println("For subtracting the two intergers = " + interger.getSubtract() + " is the correct answer!");
        System.out.println("For multiplying the two intergers together = " + interger.getMultiply() + " is the correct answer!");
        System.out.println("For dividing the two intergers = " + interger.getDivide() + " is the correct answer!");

    }
    
}

