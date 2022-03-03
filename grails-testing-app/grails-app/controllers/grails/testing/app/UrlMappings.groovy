package grails.testing.app

class UrlMappings {

    static mappings = {
//        "/$controller/$action?/$id?(.$format)?"{
//            constraints {
//                // apply constraints here
//            }
//        }
//
//        "/"(view:"/index")
//        "500"(view:'/error')
//        "404"(view:'/notFound')

        "/api/orders"(controller: "orders", action: "getAll", method:"GET")
        "/api/orders/$id"(controller: "orders", action: "get", method:"GET")

        "/api/orders"(controller: "orders", action: "save", method:"POST")
        "/api/orders/$id"(controller: "orders", action: "update", method:"PUT")

        "/api/orders/$id"(controller: "orders", action: "delete", method:"DELETE")

    }
}
