package com.kodilla.stream.lambda;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");//wyrażenie lambda
        processor.execute(codeToExecute);
    }


// PODEJŚCIE OOP - z klasą Processor która posiada metodę przyjmującą jako argument obiekt dowolnej klasy
// implementującej interfejs Executor.
//
//    public static void main(String[] args) {
//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);
//
//
// PODEJŚCIE OOP - podstawowe
//    public static void main(String[] args) {
//        SaySomething saySomething = new SaySomething();
//        saySomething.say();
}
