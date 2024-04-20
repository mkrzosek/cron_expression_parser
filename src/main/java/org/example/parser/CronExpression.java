package org.example.parser;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class CronExpression {
    CronField<Integer> minutes;
    CronField<Integer> hours;
    CronField<Integer> dayOfMonth;
    CronField<Integer> months;
    CronField<Integer> dayOfWeek;
    CronField<String> command;
}
