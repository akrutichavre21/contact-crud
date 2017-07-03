import mydemo.org.ep.TestGroup

class BootStrap {

    def init = { servletContext ->

        TestGroup g1 = new TestGroup([name: "work"])
                g1.save()
   }
    def destroy = {
    }
}
