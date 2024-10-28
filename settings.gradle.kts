rootProject.name = "markdown"

include(":docs")

pluginManagement {
  plugins {
    kotlin("multiplatform") version "2.1.255-SNAPSHOT" apply false
    id("org.jetbrains.dokka") version "1.8.20" apply false
  }
  repositories {
    maven("/Users/Ivan.Kochurkin/Documents/JetBrains/kotlin/build/repo")
    mavenCentral()
  }
}
