package mydemo.org.ep

class TestgroupController {

    def index() {
        if(!session.myUserId) {
            println "Session is not present"
            redirect controller: "mylogin", action: "index"
        }
    }

    def save() {
        if(session.myUserId) {
            TestGroup saveInstance = new TestGroup()
            saveInstance.name = params.gname
            saveInstance.save(flush: true)
            flash.successSave = "Group has been successfully Created."
            redirect(action: "show")
        }

        else {
            println "Session is not present"
            flash.notLogin = "User not logged in."
            redirect controller: "mylogin", action: "index"
        }

    }

    def show() {
        if(session.myUserId) {
            List listInstance = TestGroup.list()
            render(view: 'show', model: [abc: listInstance])
        }
        else {
            println "Session is not present"
            flash.notLogin = "User not logged in."
            redirect controller: "mylogin", action: "index"
        }
    }

    def delete() {
        if(session.myUserId) {
            TestGroup deleteInstance = TestGroup.get(Integer.parseInt(params.id))
            if (!deleteInstance) {
                flash.deleteUnsuccess = "Cannot Delete Group with Id ${params.id}"
            }
            deleteInstance.delete()
            flash.deleteSuccess = "Group has been Deleted."
            redirect(action: "show")
        }
        else {
            println "Session is not present"
            flash.notLogin = "User not logged in."
            redirect controller: "mylogin", action: "index"
        }
    }

    def update() {
        if(session.myUserId) {
            def updateInstance = TestGroup.get(Integer.parseInt(params.id))
            if (!updateInstance) {
                flash.unsuccessfulUpdate = "Cannot Update Group with Id ${params.id}"
                redirect(action: "show")
                return
            }
            [updateInstance: updateInstance]
        }
        else {
            println "Session is not present"
            flash.notLogin = "User not logged in."
            redirect controller: "mylogin", action: "index"
        }
    }

    def edit() {
        if(session.myUserId) {
            TestGroup editInstance = TestGroup.get(Integer.parseInt(params.id))
            editInstance.name = params.gname
            editInstance.save(flush: true)

            flash.successUpdate = "Successfully Updated"
            redirect(action: "show")
        }
        else {
            println "Session is not present"
            flash.notLogin = "User not logged in."
            redirect controller: "mylogin", action: "index"
        }
    }

}
