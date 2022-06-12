package com.github.yanweiqiang.androidmodularplugin.services

import com.intellij.openapi.project.Project
import com.github.yanweiqiang.androidmodularplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
