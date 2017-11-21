package com.kodilla.stream;

import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

//    public static void main(String[] args) {
//            Processor processor = new Processor();
//            processor.execute(() -> System.out.println("This is an example text.")); // wyrażenie lambda

//    public static void main(String[] args) {
//        Processor processor = new Processor();
//        Executor codeToExecute = () -> System.out.println("This is an example text.");//wyrażenie lambda
//        processor.execute(codeToExecute);
//    }


// PODEJŚCIE OOP - z klasą Processor która posiada metodę przyjmującą jako argument obiekt dowolnej klasy
// implementującej interfejs Executor.
//    public static void main(String[] args) {
//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);


// PODEJŚCIE OOP - podstawowe
//    public static void main(String[] args) {
//        SaySomething saySomething = new SaySomething();
//        saySomething.say();




    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
    }
}
