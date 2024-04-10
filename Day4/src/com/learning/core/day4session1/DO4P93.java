package com.learning.core.day4session1;
import java.util.Stack;

public class DO4P93 {
    
    // Function to perform arithmetic operation
    public static void applyOperator(Stack<Integer> operands, Stack<Character> operators) {
        char operator = operators.pop();
        int operand2 = operands.pop();
        int operand1 = operands.pop();
        
        switch(operator) {
            case '+':
                operands.push(operand1 + operand2);
                break;
            case '-':
                operands.push(operand1 - operand2);
                break;
            case '*':
                operands.push(operand1 * operand2);
                break;
            case '/':
                operands.push(operand1 / operand2);
                break;
        }
    }
    
    // Function to evaluate the expression
    public static int evaluateExpression(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (Character.isDigit(ch)) {
                int operand = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    operand = operand * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                operands.push(operand);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(ch)) {
                    applyOperator(operands, operators);
                }
                operators.push(ch);
            }
        }
        
        while (!operators.isEmpty()) {
            applyOperator(operands, operators);
        }
        
        return operands.pop();
    }
    
    // Function to determine precedence of operators
    public static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }
    
    // Main method
    public static void main(String[] args) {
        String expression = "10+2*6";
        int result = evaluateExpression(expression);
        System.out.println("Output: " + result);
    }
}



