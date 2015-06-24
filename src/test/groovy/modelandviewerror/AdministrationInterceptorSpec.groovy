package modelandviewerror


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(AdministrationInterceptor)
class AdministrationInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test administration interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"administration")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
