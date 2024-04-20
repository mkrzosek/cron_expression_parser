package org.example.parser;

import java.util.Collections;

class CommandParser extends FieldParser {

    @Override
    public CronField<String> parseField(String field) {
        return new CronField<>(Collections.singletonList(field));
    }
}
