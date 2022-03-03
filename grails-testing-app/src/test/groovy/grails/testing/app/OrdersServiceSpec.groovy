package grails.testing.app

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class OrdersServiceSpec extends Specification implements ServiceUnitTest<OrdersService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
