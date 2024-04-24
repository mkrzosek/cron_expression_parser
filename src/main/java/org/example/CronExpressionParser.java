package org.example;

import org.example.parser.CronExpression;
import org.example.parser.CronParser;
import org.example.validator.CronExpressionValidator;

public class CronExpressionParser {
    public static void main(String[] args) {

        CronExpressionValidator CronExpressionValidator = new CronExpressionValidator();
        CronExpressionValidator.validate(args);
        CronParser parser = new CronParser();
        CronExpression parsedExpression = parser.parse(args[0]);

        System.out.format("%-14s%-14s%n", "minute", parsedExpression.getMinutes());
        System.out.format("%-14s%-14s%n", "hour", parsedExpression.getHours());
        System.out.format("%-14s%-14s%n", "day of month", parsedExpression.getDayOfMonth());
        System.out.format("%-14s%-14s%n", "month", parsedExpression.getMonths());
        System.out.format("%-14s%-14s%n", "day of week", parsedExpression.getDayOfWeek());
        System.out.format("%-14s%-14s%n", "command", parsedExpression.getCommand());
    }
}