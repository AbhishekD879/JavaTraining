package com.JavaTraining.Day4;

import java.util.Scanner;
import java.util.Stack;

//A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.
//Examples of some correctly balanced strings are: "{}()", "{[()}]", "({()})"
//Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
//Given a string, determine if it is balanced or not.
//Input Format
//There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.
//The part of the code that handles input operation is already provided in the editor.
//Output Format
//For each case, print 'true' if the string is balanced, 'false' otherwise.
//Sample Input
//{}()
//({()})
//{}(
//[]
//Sample Output
//true
//true
//false
//true
public class StackProblem {
    static boolean isBalanced(String str){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                    if (stack.peek() != '{') {
                        return false;
                    }
                    stack.pop();
                    break;
                case ']':
                    if (stack.peek() != '[') {
                        return false;
                    }
                    stack.pop();
                    break;
                case ')':
                    if (stack.peek() != '(') {
                        return false;
                    }
                    stack.pop();
                    break;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        System.out.println(isBalanced(scanner.nextLine()));
    }
}
