package com.terraform.lambda.lambda;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.function.Function;

@Component("example-lambda")
public class ExampleLambda implements Function<Map<String, Object>, Map<String, Object>> {
    // todo: skonfiguruje lambde i napisz terrafrorma do niej
    @Override
    public Map<String, Object> apply(Map<String, Object> stringObjectMap) {
        return stringObjectMap;
    }
}