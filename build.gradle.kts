plugins {
    `base`
    id("org.gradle.wrapper-upgrade") version "0.12"
}

val projectNames = listOf(
    "TextRef",
    "GradleWrapperUpgrader",
    "ProgressButton",
)

wrapperUpgrade.gradle {
    projectNames.forEach { projectName ->
        register(projectName) {
            repo.set("ioki-mobility/$projectName")
        }
    }
}
