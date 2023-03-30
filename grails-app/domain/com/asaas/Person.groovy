package com.asaas

class Person {

    Long id
    String name
    Cpf cpf
    String cnpj

    static constraints = {
        cpf nullable: true
        cnpj nullable: true
    }

    static namedQueries = {
        query { Map search ->
            if (search.containsKey("cpf")) {
                if (search.cpf instanceof Cpf) {
                    eq("cpf", search.cpf)
                } else {
                    eq("cpf", new Cpf(value: search.cpf))
                }
            }
        }
    }
}