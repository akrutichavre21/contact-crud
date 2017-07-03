package mydemo.org.ep

class TestgroupController {

    def index() { }

    def save() {
        TestGroup saveInstance = new TestGroup()
        saveInstance.name = params.gname
        saveInstance.save(flush: true)
        flash.successSave = "Group has been successfully Created."
        redirect(action: "show")
    }

    def show() {
        List listInstance = TestGroup.list()
        render(view: 'show', model: [abc:listInstance   ])
    }

    def delete() {
        TestGroup deleteInstance = TestGroup.get(Integer.parseInt(params.id))
        if(!deleteInstance) {
            flash.deleteUnsuccess = "Cannot Delete Group with Id ${params.id}"
        }
        deleteInstance.delete()
        flash.deleteSuccess = "Group has been Deleted."
        redirect(action: "show")
    }

    def update() {
        def updateInstance = TestGroup.get(Integer.parseInt(params.id))
        if(!updateInstance){
            flash.unsuccessfulUpdate = "Cannot Update Group with Id ${params.id}"
            redirect(action: "show")
            return
        }
        [updateInstance: updateInstance]
    }

    def edit() {
        TestGroup editInstance = TestGroup.get(Integer.parseInt(params.id))
        editInstance.name = params.name
        editInstance.save(flush: true)

        flash.successUpdate = "Successfully Updated"
        redirect(action: "show")
    }

}
