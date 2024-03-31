package com.terraform.lambda.lambda;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.function.Function;

@Component("example2-lambda")
public class Example2Lambda  implements Function<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> apply(Map<String, Object> stringObjectMap) {
        return Map.of("sdfg", 23, "dsfgnbdgfn", 1000);
    }
}