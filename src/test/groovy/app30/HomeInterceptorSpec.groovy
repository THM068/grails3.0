package app30


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(HomeInterceptor)
class HomeInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test home interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"home")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
