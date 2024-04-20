package org.example.parser;

import static org.example.parser.Parser.*;

public class CronParser {

    public CronExpression parse(String cronExpression) {
        String[] fields = cronExpression.trim().split("\\s+");

        CronField<Integer> minutes = MINUTE.parseField(fields[0]);
        CronField<Integer> hours = HOUR.parseField(fields[1]);
        CronField<Integer> dayOfMonth = DAY_OF_MONTH.parseField(fields[2]);
        CronField<Integer> months = MONTH.parseField(fields[3]);
        CronField<Integer> dayOfWeek = DAY_OF_WEEK.parseField(fields[4]);
        CronField<String> command = COMMAND.parseField(fields[5]);

        return CronExpression.builder()
                .minutes(minutes)
                .hours(hours)
                .dayOfMonth(dayOfMonth)
                .months(months)
                .dayOfWeek(dayOfWeek)
                .command(command)
                .build();
    }

}
