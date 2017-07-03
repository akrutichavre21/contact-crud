package mydemo.org.ep

class TestController {

    def index() {
        [myInstance: TestGroup.list()]
    }

    def save() {
        Test test = new Test()
        test.firstName = params.fname
        test.lastName = params.lname
        test.myGroup = TestGroup.get(Integer.parseInt(params.groupId))

        test.save(flush: true)
        flash.successCreate = "Contact has been successfully created."
        redirect(action: "show")
    }

    def show() {
        List listInstance = Test.list()
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
        editInstance.myGroup = TestGroup.get(Integer.parseInt(params.groupId))
        editInstance.save(flush: true)
        flash.successUp = "Successfully Updated"
        redirect(action: "show")
    }
}
