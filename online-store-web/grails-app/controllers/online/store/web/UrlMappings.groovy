package online.store.web

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/admin"(view:"/index")
		"/"(view:"/poly")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
