package grails.testing.app

import grails.rest.RestfulController

class OrdersController extends RestfulController{

    def ordersService

    static responseFormats = ['json', 'json']

    static allowedMethods = [get: 'GET', getAll: 'GET', save: 'POST', update: 'PUT', delete: 'DELETE']

    OrdersController() {
        super(Orders)
    }


    def getAll() {
        respond ordersService.listOrders()
    }

    def get() {
        respond ordersService.singleOrders(params)
    }

    def save() {
        def orders = ordersService.save(request)
        respond orders
    }

    def update() {
        def orders = ordersService.update(params, request)
        respond orders
    }


    def delete() {
        def orders = ordersService.delete(params)
        respond orders
    }


}
