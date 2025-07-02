// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.6.0")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.71")
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.0")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.51")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

plugins {
    alias(libs.plugins.android.application) version ("8.6.0") apply false
    alias(libs.plugins.kotlin.android) version ("1.3.71") apply false
    alias(libs.plugins.kotlin.compose) apply false
}