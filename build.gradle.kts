plugins {
    val kotlinVersion = "1.3.31"

    id("io.spring.dependency-management") version "1.0.6.RELEASE"
    id("org.jetbrains.kotlin.jvm") version kotlinVersion
    id("org.jetbrains.kotlin.plugin.spring") version kotlinVersion
}

dependencies {
    compile("org.jetbrains.kotlin:kotlin-reflect")
    compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    compile("io.github.microutils:kotlin-logging:1.6.24")

    tasks.compileKotlin {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
    }
}

group = "ru.hodorov"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}