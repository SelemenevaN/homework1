
plugins {
    kotlin("jvm") version "1.9.22"

}

group = "com.selemeneva"
version = "0.0.1"

repositories {
    mavenCentral()
}
subprojects {
    repositories {
        mavenCentral()
    }
    group = rootProject.group
    version = rootProject.version
}
kotlin {
    jvmToolchain(17)
}

