package com.asaas

import com.asaas.gson.CpfAdapter
import com.asaas.gson.GrailsDomainExclusionStrategy
import com.google.gson.Gson
import com.google.gson.GsonBuilder

class PersonController {

    PersonService personService

    def list() {
        render contentType: "application/json", text: toJson([data: personService.list()])
    }

    def save() {

    }

    def update() {

    }

    def delete() {

    }

    private String toJson(Object data) {
        GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(Cpf, new CpfAdapter()).setExclusionStrategies(new GrailsDomainExclusionStrategy())

        Gson gson = gsonBuilder.create()

        return gson.toJson(data)
    }
}