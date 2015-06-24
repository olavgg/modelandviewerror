class UrlMappings {

    static mappings = {

        name administration: "/administration/$controller/$action?/$id?" {
            namespace = 'administration'
        }

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/$namespace/$controller/$action?"()

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
