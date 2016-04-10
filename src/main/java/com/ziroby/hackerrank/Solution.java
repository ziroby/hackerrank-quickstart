package com.ziroby.hackerrank;

import java.util.Scanner;

/**
 * Solve a problem on Hackerrank.
 */
public class Solution {

    private static class InputLine {
        private final int first;
        private final int second;

        public InputLine(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }
    }

    private static interface Processor {
        void visitNode(InputLine input);

        String process();
    }

    /**
     * This is the main worker class. It receives input lines, then processes
     * them.
     */
    private static class BasicProcessor implements Processor {
        @Override
        public void visitNode(InputLine input) {
            // TODO: Do something with input
        }

        @Override
        public String process() {
            // TODO: Process all theinput data, and return a result.
            return "1";
        }

    }

    private String readInput(Scanner scanner) {
        StringBuilder builder = new StringBuilder();
        int numTestCases = scanner.nextInt();
        for (int testCaseIndex = 0; testCaseIndex < numTestCases; testCaseIndex++) {
            Processor processor = new BasicProcessor();
            int numLines = scanner.nextInt();
            for (int lineIndex = 0; lineIndex < numLines; lineIndex++) {
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();

                processor.visitNode(new InputLine(num1, num2));
            }
            String result = processor.process().toString();
            builder.append(result);
            builder.append('\n');
        }
        return builder.toString().trim();
    }

    public String solve(String input) {
        return solve(new Scanner(input));
    }

    public String solve(Scanner scanner) {
        return readInput(scanner);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solve(new Scanner(System.in)));
    }
}
