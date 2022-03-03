package grails.testing.app

import grails.rest.Resource

/**
 * Like this we can make the Domain Class itself as a RestController
 */
//@Resource(uri = "/api/orders", formats = ['json', 'json'])
class Orders {
    Long id
    String stock
    String side
    Double price
    Long size

    static mapping = {
        version false
        table 'orders'
        id column: 'id', generator: 'native', params: [sequence: 'order_seq']
    }

    static constraints = {
        stock blank: false
        side blank: false
        price blank: false
        size blank: false
    }
}
