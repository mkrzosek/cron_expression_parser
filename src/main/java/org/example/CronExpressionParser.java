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

        System.out.println("CRON expression parsed successfully:");
        System.out.println("minute: " + parsedExpression.getMinutes());
        System.out.println("hour: " + parsedExpression.getHours());
        System.out.println("day of month: " + parsedExpression.getDayOfMonth());
        System.out.println("month: " + parsedExpression.getMonths());
        System.out.println("day of week: " + parsedExpression.getDayOfWeek());
        System.out.println("command: " + parsedExpression.getCommand());
    }
}