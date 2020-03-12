plugins {
    kotlin("jvm")
    id("io.quarkus")
}

version = "unspecified"

repositories {
    mavenCentral()
}

val quarkusPlatformGroupId: String by ext
val quarkusPlatformArtifactId: String by ext
val quarkusPlatformVersion: String by ext
val jUnitJupiterVersion: String by ext

dependencies {
    implementation(kotlin("stdlib-jdk8"))
//    implementation(project(":core"))

    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation("io.quarkus:quarkus-kotlin")
    implementation("io.quarkus:quarkus-resteasy")
    implementation("io.quarkus:quarkus-resteasy-jsonb")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    quarkus {
        setSourceDir("$projectDir/src/main/kotlin")
        setOutputDirectory("$projectDir/build/classes/kotlin")
    }
}