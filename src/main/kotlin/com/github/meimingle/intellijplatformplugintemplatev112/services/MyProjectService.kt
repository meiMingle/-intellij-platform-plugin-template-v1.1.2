package com.github.meimingle.intellijplatformplugintemplatev112.services

import com.intellij.openapi.project.Project
import com.github.meimingle.intellijplatformplugintemplatev112.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
