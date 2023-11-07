plugins {
    `base`
    id("org.gradle.wrapper-upgrade") version "0.11.4"
}

val projectNames = listOf(
    "kmp-lokalise-api",
    "LokaliseGradlePlugin",
    "SentryProguardGradlePlugin",
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