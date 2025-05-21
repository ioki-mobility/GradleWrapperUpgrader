plugins {
    `base`
    id("org.gradle.wrapper-upgrade") version "0.12"
}

val projectNames = listOf(
    "kmp-lokalise-api",
    "LokaliseGradlePlugin",
    "SentryProguardGradlePlugin",
    "TextRef",
    "GradleWrapperUpgrader",
    "ProgressButton",
    "kmp-passenger-api",
    "Result",
)

wrapperUpgrade.gradle {
    projectNames.forEach { projectName ->
        register(projectName) {
            repo.set("ioki-mobility/$projectName")
        }
    }
}
