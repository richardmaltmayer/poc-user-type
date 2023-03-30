import com.asaas.Cpf
import com.asaas.Person

class BootStrap {

    def init = { servletContext ->

        Person person1 = new Person(id: 1, name: "Richard", cpf: new Cpf(value: "01346565040"), cnpj: "12345678901234")
        person1.save(flush: true)
        Person person2 = new Person(id: 2, name: "Teste", cpf: new Cpf(value: "01346565040"))
        person2.save(flush: true)
        Person person3 = new Person(id: 2, name: "Teste", cnpj: "12345678901234")
        person3.save(flush: true)

    }
    def destroy = {
    }
}