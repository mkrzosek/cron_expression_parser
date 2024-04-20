package org.example.parser;

import java.util.List;
import java.util.stream.Collectors;

record CronField<T>(List<T> values) {

    public String toString() {
        return values.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));
    }
}
