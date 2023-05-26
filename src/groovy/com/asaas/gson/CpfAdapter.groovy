package com.asaas.gson

import com.asaas.Cpf
import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter

class CpfAdapter extends TypeAdapter<Cpf> {

    @Override
    void write(JsonWriter writer, Cpf cpf) throws IOException {
        if (cpf.value) {
            writer.value(cpf.value)
        } else {
            writer.nullValue()
        }
    }

    @Override
    Cpf read(JsonReader reader) throws IOException {
        String value = reader.nextString()
        return new Cpf(value: value)
    }
}