package modelandviewerror

import static org.springframework.http.HttpStatus.NOT_FOUND

class AdministrationInterceptor {

    AdministrationInterceptor(){
        match(namespace: 'administration')
    }

    boolean before() {
        log.debug "running administration interceptor before()"
        render view: '/notFound', status: NOT_FOUND
        return false
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }

}
