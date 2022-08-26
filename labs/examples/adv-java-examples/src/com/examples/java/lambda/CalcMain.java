package com.examples.java.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CalcMain {
    public static void main(String[] args) {
//        System.out.println("Calculator impl with OOP...");
        CalcOop calcOop = new CalcOop(50, 30);
//        System.out.println(calcOop.add());
//        System.out.println(calcOop.substract());
//        System.out.println(calcOop.multiply());
//        System.out.println(calcOop.divide());
//        calcOop.setOperand1(20);
//        calcOop.setOperand2(30);
//        System.out.println(calcOop.multiply());

//        CalcOop calcOop1 = new CalcOop(40, 20);
//        calcOop.setOperand1(40);
//        calcOop.setOperand2(20);
//        System.out.println(calcOop.multiply());
//        System.out.println(calcOop.substract());
//
//        calcOop.setOperand1(75);
//        calcOop.setOperand2(25);
//        System.out.println(calcOop.add());
//        System.out.println(calcOop.substract());
//        System.out.println(calcOop.multiply());
//        System.out.println(calcOop.divide());

        System.out.println("Calculator impl with FP...");

//        CalcFp calcFp = new CalcFp();
//        System.out.println(calcFp.add(50,30));
//        System.out.println(calcFp.add(40,20));
//        System.out.println(calcFp.substract(80,25));
//        System.out.println(calcFp.multiply(30,15));
//        System.out.println(calcFp.divide(30,15));

        // Option #1 - Create separate class for each operation implementation
//        MathOperation addition = new Addition();
//        MathOperation subtraction = new Subtraction();
//        MathOperation mod = new Mod();
//
//        int result = doCalculation(subtraction, 200, 110);
//        System.out.println(result);

        // Option #2 - Create Anonymous inner class and assign to reference variable
//        MathOperation addition = new MathOperation() {
//            @Override
//            public int calculate(int operand1, int operand2) {
//                return operand1 + operand2;
//            }
//        };
//
//        MathOperation subtraction = new MathOperation() {
//            @Override
//            public int calculate(int operand1, int operand2) {
//                return operand1 - operand2;
//            }
//        };
//
//        MathOperation mod = new MathOperation() {
//            @Override
//            public int calculate(int operand1, int operand2) {
//                return operand1 % operand2;
//            }
//        };
//
//        int result = doCalculation(addition, 200, 110);
//        System.out.println(result);

        // Option #3 - Create Anonymous inner class and pass as argument

//        int result =  doCalculation(new MathOperation() {
//            @Override
//            public int calculate(int operand1, int operand2) {
//                return operand1 + operand2;
//            }
//        }, 100, 200);
//
//        System.out.println(result);

//        System.out.println("Calculator impl with Lambda Expression...");

        // Option #4 - Create Lambda expression and assign it to reference variable
//        MathOperation addition = new MathOperation() {
//            @Override
//            public int calculate(int operand1, int operand2) {
//                return operand1 + operand2;
//            }
//        };

        // param list -> body expression

//        MathOperation addition = (int operand1, int operand2) -> operand1 + operand2; // with data types in args
//        MathOperation subtraction = (operand1, operand2) -> operand1 - operand2;      // w/o data types
//        MathOperation multiplication = (operand1,  operand2) -> {return operand1 * operand2;};// with return statement
//        MathOperation division = (operand1,  operand2) -> {
//            System.out.println("Dividing two numbers " + operand1 + " " + operand2);
//            return operand1 / operand2;
//        };// with multi statement

//        int result = doCalculation(division, 400, 200);
//        System.out.println(result);

//        // Option #5 - Create Lambda expression and pass to function
        int a = 10;
        int result = doCalculation((operand1, operand2) -> operand1 + a, 400, 200);
        System.out.println(result);

        boolean res = compare((operand1, operand2) -> operand1 < operand2, 400, 200);
        System.out.println(res);

        print((msg) -> System.out.println(msg), "Hello Lambda!!!");

        List skills = initSkills(() -> {return new ArrayList(Arrays.asList("Java","Python","Node JS"));});
        System.out.println(skills);


    }

//    private static int doCalculation(MathOperation operation, int operand1, int operand2) {
//        return operation.calculate(operand1, operand2);
//    }


    // Take arguments and return a value
    private static int doCalculation(BiFunction<Integer, Integer, Integer> operation, int operand1, int operand2) {
        return operation.apply(operand1, operand2);
    }

    // Take arguments and return boolean value
    private static boolean compare(BiPredicate<Integer, Integer> operation, int operand1, int operand2) {
        return operation.test(operand1, operand2);
    }

    // Take arguments, no return values
    private static void print(Consumer<String> operation, String message) {
        operation.accept(message);
    }
    // No arguments, returns value
    private static List initSkills(Supplier<List> operation) {
        return operation.get();
    }

// Uncomment for Option #1
//    private static class Addition implements MathOperation {
//
//        @Override
//        public int calculate(int operand1, int operand2) {
//            return operand1 + operand2;
//        }
//    }
//
//    private static class Subtraction implements MathOperation {
//
//        @Override
//        public int calculate(int operand1, int operand2) {
//            return operand1 - operand2;
//        }
//    }
//
//    private static class Mod implements MathOperation {
//
//        @Override
//        public int calculate(int operand1, int operand2) {
//            return operand1 % operand2;
//        }
//    }
    
}
