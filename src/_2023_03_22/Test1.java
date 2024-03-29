package _2023_03_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static _2023_03_22.Test1.MathExpressionEvaluator.evaluate;

public class Test1 {

    public class MathExpressionEvaluator {
        public static int evaluate(String expression) {
            Stack<Integer> operands = new Stack<>();
            Stack<Character> operators = new Stack<>();
            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);
                if (Character.isDigit(c)) {
                    // Extract the whole number from the expression
                    int num = 0;
                    while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                        num = num * 10 + (expression.charAt(i) - '0');
                        i++;
                    }
                    i--; // Move the index back by one to account for the extra increment in the loop
                    operands.push(num);
                } else if (c == '(') {
                    operators.push(c);
                } else if (c == ')') {
                    // Evaluate the expression inside the parentheses
                    while (operators.peek() != '(') {
                        int num2 = operands.pop();
                        int num1 = operands.pop();
                        char op = operators.pop();
                        int result = applyOp(num1, num2, op);
                        operands.push(result);
                    }
                    operators.pop(); // Pop the left parenthesis
                } else if (isOperator(c)) {
                    // Evaluate the expression until the current operator has higher or equal precedence than the top operator in the stack
                    while (!operators.empty() && hasHigherPrecedence(c, operators.peek())) {
                        int num2 = operands.pop();
                        int num1 = operands.pop();
                        char op = operators.pop();
                        int result = applyOp(num1, num2, op);
                        operands.push(result);
                    }
                    operators.push(c);
                }
            }
            // Evaluate the remaining operators and operands in the stacks
            while (!operators.empty()) {
                int num2 = operands.pop();
                int num1 = operands.pop();
                char op = operators.pop();
                int result = applyOp(num1, num2, op);
                operands.push(result);
            }
            // The result is the only remaining element in the operands stack
            return operands.pop();
        }
        private static boolean isOperator(char c) {
            return c == '+' || c == '-' || c == '*' || c == '/';
        }
        private static boolean hasHigherPrecedence(char op1, char op2) {
            if (op2 == '(' || op2 == ')') {
                return false;
            } else return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
        }
        private static int applyOp(int num1, int num2, char op) {
            return switch (op) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> num1 / num2;
                default -> throw new RuntimeException("Invalid operator: " + op);
            };
        }

    }

    public static void main(String[] args) {
        String expression = "100-2*(4*5+2*(10-8))";
        int result = evaluate(expression);
        System.out.println(expression + " = " + result); // Output: 100-2*(4*5+2*(10-8)) = 80
    }
}
