package com.asaas.gson

import com.asaas.Cpf
import com.google.gson.Gson
import com.google.gson.TypeAdapter
import com.google.gson.TypeAdapterFactory
import com.google.gson.reflect.TypeToken
import groovy.transform.CompileStatic

@CompileStatic
class CpfAdapterFactory implements TypeAdapterFactory {

    @Override
    TypeAdapter create(Gson gson, TypeToken typeToken) {
        println "adapter"
        return typeToken.rawType == Cpf ? new CpfAdapter() : null
    }
}