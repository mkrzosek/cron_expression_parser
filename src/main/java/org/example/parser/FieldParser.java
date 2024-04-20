package org.example.parser;

import java.util.LinkedList;
import java.util.List;

class FieldParser {

    private int minRange = 0;
    private int maxRange = 0;

    FieldParser(int minRange, int maxRange) {
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    FieldParser() {
    }

    /**
     * Common parser for datetime fields
     */
    CronField parseField(String field) {
        List<Integer> values = new LinkedList<>();

        if (field.equals("*")) {
            for (int value = minRange; value <= maxRange; value++) {
                values.add(value);
            }
        } else if (field.startsWith("*/")) {
            int step = Integer.parseInt(field.substring(2));
            for (int value = minRange; value <= maxRange; value += step) {
                values.add(value);
            }
        }
        else {
            String[] parts = field.split(",");
            for (String part : parts) {
                if (part.contains("-")) {
                    String[] rangeParts = part.split("-");
                    int start = Integer.parseInt(rangeParts[0]);
                    int end = Integer.parseInt(rangeParts[1]);
                    for (int value = start; value <= end; value++) {
                        values.add(value);
                    }
                } else {
                    values.add(Integer.parseInt(part));
                }
            }
        }

        return new CronField<>(values);
    }
}
