package com.github.harveyives.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.harveyives.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
