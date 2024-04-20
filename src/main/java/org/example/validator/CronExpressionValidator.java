package org.example.validator;

public class CronExpressionValidator {

    public static final int NUMBER_OF_REQUIRES_ARGUMENTS = 1;
    public static final int NUMBER_OF_EXPRESSION_FIELDS = 6;

    public void validate(String[] args) throws IllegalArgumentException {
        validateNumberOfInputArguments(args);
        String cronExpression = args[0];
        validateCronExpression(cronExpression);
    }

    private void validateNumberOfInputArguments(String[] args) {
        if (args.length != NUMBER_OF_REQUIRES_ARGUMENTS) {
            throw new IllegalArgumentException("Wrong number of arguments. Proper number of arguments is: " + NUMBER_OF_REQUIRES_ARGUMENTS);
        }
    }

    private void validateCronExpression(String expression) {
        if (expression != null && !expression.isBlank()) {
            validateNumberOfFieldsInExpression(expression);
        } else {
            throw new IllegalArgumentException("Cron expression cannot be blank");
        }
    }

    private void validateNumberOfFieldsInExpression(String expression) {
        if (expression.trim().split("\\s+").length != NUMBER_OF_EXPRESSION_FIELDS) {
            throw new IllegalArgumentException(String.format("Cron expression has to have exactly %s fields divided by spaces", NUMBER_OF_EXPRESSION_FIELDS));
        }
    }

}
