package test

import grails.converters.JSON
import org.springframework.web.bind.annotation.RequestParam

import java.security.Security

class ProductController {

    def springSecurityService

    def index() {
        redirect(action: "listProd")
    }

    def listProd() {
        def user = springSecurityService.currentUser
        def product = Product.list()
        [product: product, user:user]
      //  render product as JSON
    }


    def addProd() {}
    def save() {
        def product = new Product(params)
        product.save flush: true, failOnError: true
        redirect(action: "listProd")
    }

    def edit(){
        def product = Product.get(params.id)
        [product:product]
    }

    def Update(){
        def product = Product.get(params.id)
        product.properties = params
        product.save flush: true, failOnError: true
        redirect(action: "listProd")
    }

    def delete(){
        def product = Product.get(params.id)
        product.delete flush: true, failOnError: true
        redirect(action: "listProd")
    }

//    def Show(){
//        def prod = Product.get(params.id)
//        [prod:prod]
//    }
    // http://grails.asia/grails-tutorial-for-beginners-scaffolding

    // https://medium.com/@victortorres/create-your-first-grails-application-without-scaffold-7e4c85c76156}

    //https://bootswatch.com/default/?
    //https://getbootstrap.com/docs/3.3/components/
    //http://bootstrap-3.ru/bootstraptheme.php#template
}
