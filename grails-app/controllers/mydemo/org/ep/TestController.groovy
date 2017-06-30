package mydemo.org.ep

class TestController {

    def index() {

    }

    def save() {
        Test test = new Test()
        test.firstName = params.fname
        test.lastName = params.lname
        test.save()
        redirect(action: "show")
    }

    def show() {
        List listInstance = Test.list()
/*        println "${Test.getAll()}"
        println "${Test.getAll([5,6,7])}"
        println "${Test.getAll(5,6,7)}"*/

        render(view: 'show', model: [abc:listInstance])
    }

    def delete() {
        def deleteInstance = Test.get(params.id)
        println deleteInstance

        if(deleteInstance == null) {
            flash.unsuccessDel = "Cannot Delete!! User with Id ${params.id} doesn't exist."
            redirect(action: "show")
            return
        }
        deleteInstance.delete()
        flash.successDel = "Successfully Deleted."
        redirect(action: "show")
    }

    def update() {
        def updateInstance = Test.get(params.id)
        if(updateInstance == null) {
            flash.unsuccessUp = "Cannot Update!! User with Id ${params.id} doesn't exist."
            redirect(action: "show")
            return
        }
        [updateInstance: updateInstance]
    }

    def edit() {
        def id = Integer.parseInt(params.id)
        def editInstance = Test.get(id)
        editInstance.firstName = params.fname
        editInstance.lastName = params.lname
        flash.successUp = "Successfully Updated"
        redirect(action: "show")
    }
}
