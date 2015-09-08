package com.app30

import org.hibernate.criterion.DetachedCriteria

/**
 * Created by thandomafela on 15/06/15.
 */
class Person {

    String name
    String lastName

    static simpsons = Person.where {
        like 'name', 'Th%'
    }

    static constraints = {

    }
}
