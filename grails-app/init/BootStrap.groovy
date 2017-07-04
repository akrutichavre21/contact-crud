import mydemo.org.ep.Person
import mydemo.org.ep.TestGroup

class BootStrap {

    def init = { servletContext ->

        TestGroup g1 = new TestGroup([name: "work"])
        g1.save()

        Person defaultUser = new Person([username: "abc@gmail.com", password: "abc"])
        defaultUser.save()

   }
    def destroy = {
    }
}
