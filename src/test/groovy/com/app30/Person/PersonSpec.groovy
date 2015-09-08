package com.app30.Person

import com.app30.Person
import grails.test.mixin.TestFor
import org.hibernate.criterion.DetachedCriteria
import spock.lang.Specification

/**
 * Created by thandomafela on 15/06/15.
 */
@TestFor(Person)
class PersonSpec extends Specification {

    def setup() {
        mockDomain(Person)
        Person p1 = new Person(name: 'Kerrie', lastName: 'Channer').save(validate:false)
        Person p2 = new Person(name: 'Thando', lastName: 'Mafela').save(validate:false)
        Person p3 = new Person(name: 'Zinzile', lastName: 'Mlauze').save(validate:false)
        Person p4 = new Person(name: 'Thabo', lastName: 'Moyo').save(validate:false)
    }

    def 'Use of detached Queries'() {


        expect:
            Person.simpsons.findAll()?.size() == 2
    }
}
