package test
import com.auth.*

class BootStrap {

    def init = { servletContext ->
        new Product(name: "banan", price: 43, sku: "BV433").save()
        new Product(name: "sdfsd", price: 13, sku: "BaD433").save()

        def user =  new User(username:"user", password:"123").save(flush:true)
        def admin =  new User(username:"admin", password:"123").save(flush:true)

        def userRole = new UserRole(authority:"ROLE_USER").save(flush:true)
        def adminRole = new UserRole(authority:"ROLE_ADMIN").save(flush:true)

        new UserRole(user:user, role:userRole).save(flush:true)
        new UserRole(user:admin, role:adminRole).save(flush:true)

    }
    def destroy = {
    }
}
