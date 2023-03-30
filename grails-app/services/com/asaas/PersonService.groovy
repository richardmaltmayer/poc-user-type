package com.asaas

import grails.transaction.Transactional

@Transactional
class PersonService {

    public List<Person> list() {
        return Person.list()
    }
}