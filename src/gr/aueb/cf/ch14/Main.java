package gr.aueb.cf.ch14;

import gr.aueb.cf.ch14.model.*;


public class Main {

    public static void main(String[] args) {

        // Logger //
        Logger logger = Logger.getInstance();
        logger.logMessage("This is a test message.");
        System.out.println("********");

        // MathHelper //
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Max value: " + MathHelper.findMax(arr));
        System.out.println("Min value: " + MathHelper.findMin(arr));
        System.out.println("Average value: " + MathHelper.findAverage(arr));
        System.out.println("********");

        //StringUtils
        String testString = "RaceCar";

        System.out.println("Original: " + testString);
        System.out.println("Reversed: " + StringUtils.reverseString(testString));
        System.out.println("Uppercase: " + StringUtils.upperCaseString(testString));
        System.out.println("Is palindrome: " + StringUtils.isPalindrome(testString));
        System.out.println("********");

        //ValidationUtils//
        String valString = "test";
        int valNum = 11;

        System.out.println("Is the string between 1 and 31 characters: " + ValidationUtils.isStringLengthValid(valString));
        System.out.println("Is the number between 1 and 10: " + ValidationUtils.isNumberInRange(valNum));
        System.out.println("********");

        // StackManager //
        StackManager stack = StackManager.getInstance();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.traverseStack();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("********");

        // QueueManager //
        QueueManager queue = QueueManager.getInstance();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.traverseQueue();

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println("********");
    }
}
