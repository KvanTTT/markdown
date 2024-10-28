rootProject.name = "markdown"

include(":docs")

pluginManagement {
  plugins {
    kotlin("multiplatform") version "2.1.0-Beta2" apply false
    id("org.jetbrains.dokka") version "1.8.20" apply false
  }
}
