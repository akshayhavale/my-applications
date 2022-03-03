package grails.testing.app

import grails.gorm.transactions.Transactional

@Transactional
class OrdersService {

    def listOrders() {
       return Orders.findAll()
    }

    def singleOrders(def params) {
       def orderId = params.id
        return Orders.get(new Long(orderId))
    }

    def save(def request) {
        def ordersJson = request.JSON
        def ordersInstance = new Orders(ordersJson)
        return ordersInstance.save()
    }

    def update(def params, def request) {

        def ordersId = params.id
        def ordersJson = request.JSON
        def ordersInstance = Orders.get(new Long(ordersId))
        ordersInstance.properties = ordersJson
        return ordersInstance.merge()

    }

    def delete(def params) {
        def ordersId = params.id
        def ordersInstance = Orders.get(new Long(ordersId))
        ordersInstance.delete()
        return ordersInstance
    }
}
