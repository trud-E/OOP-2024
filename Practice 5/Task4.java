import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter: ");
        String s = in.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ", true);

        while (st.hasMoreTokens()) {
            String expression = st.nextToken().trim();
            if (!expression.isEmpty()) {
                evaluateExpression(expression);
            }
        }




    }
    private static void evaluateExpression(String expression) {
        double leftOperand, rightOperand, result;
        String leftString, rightString, operator;
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);
        try {
            leftString = tokenizer.nextToken().trim();
            operator = tokenizer.nextToken().trim();
            rightString = tokenizer.nextToken().trim();

            try {
                leftOperand = Double.parseDouble(leftString);
            } catch (NumberFormatException nfe) {
                System.out.println("Left operand is not a number");
                return;
            }

            try {
                rightOperand = Double.parseDouble(rightString);
            } catch (NumberFormatException nfe) {
                System.out.println("Right operand is not a number");
                return;
            }if (operator.equals("+")) {
                result = leftOperand + rightOperand;
            } else if (operator.equals("-")) {
                result = leftOperand - rightOperand;
            } else if (operator.equals("*")) {
                result = leftOperand * rightOperand;
            } else if (operator.equals("/")) {
                if (rightOperand == 0) {
                    System.out.println("Division by 0");
                    return;
                }
                result = leftOperand / rightOperand;
            } else {
                System.out.println("Invalid operator: " + operator);
                return;
            }

            System.out.println("Result: " + result);
        } catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax in expression: " + expression);
        }
    }
}
