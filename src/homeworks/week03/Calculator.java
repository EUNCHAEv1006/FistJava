package homeworks.week03;

public class Calculator {

    private AbstractOperation operation;

    public Calculator(AbstractOperation operation) {
        this.operation = operation;
    }

    public  void setOperation (AbstractOperation operation){
        this.operation = operation;
    }
    public double calculate(int firstNumber, int secondNumber) {
        double answer = 0;

        answer = operation.operate(firstNumber, secondNumber);

//        if(operator.equals("+")) {
//            answer = addOperation.operate(firstNumber, secondNumber);
//        } else if(operator.equals("-")) {
//            answer = substractOperation.operate(firstNumber, secondNumber);
//            // 빼기 연산
//        } else if(operator.equals("*")) {
//            answer = multiplyOperation.operate(firstNumber, secondNumber);
//            // 곱하기 연산
//        } else if(operator.equals("/")) {
//            answer = divideOperation.operate(firstNumber, secondNumber);
//            // 나누기 연산
//        } else if(operator.equals("%")){
//            answer = firstNumber % secondNumber;
//        }

        return answer;
    }
}
