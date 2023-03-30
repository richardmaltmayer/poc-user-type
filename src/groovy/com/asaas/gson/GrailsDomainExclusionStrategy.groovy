package com.asaas.gson

import com.google.gson.ExclusionStrategy
import com.google.gson.FieldAttributes

class GrailsDomainExclusionStrategy implements ExclusionStrategy {

    @Override
    boolean shouldSkipField(FieldAttributes fieldAttributes) {
        return false
    }

    @Override
    boolean shouldSkipClass(Class<?> aClass) {
        return false
    }
}