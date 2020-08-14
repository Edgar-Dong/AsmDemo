package com.example.android.buildsrc

import org.gradle.api.Plugin
import org.gradle.api.Project

class AsmPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println(">>>>>>>>>>")
        println("buildSrc:Hello gradle plugin")
        println(">>>>>>>>>>")
    }
}