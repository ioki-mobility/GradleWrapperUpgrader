# GradleWrapperUpgrader

Automation to upgrade Gradle wrappers across the ioki-mobility GitHub organisation repositories.
It uses the [Wrapper Upgrade Gradle Plugin](https://github.com/gradle/wrapper-upgrade-gradle-plugin) and [GitHub Actions](https://github.com/ioki-mobility/GradleWrapperUpgrader/blob/c907a4399dc07e7a79a39ca7ad2db70b0e4b02ca/.github/workflows/gradle-wrapper-upgrade.yml) for that.

## How to add a new repo

To add a new repository to the repository you have to do the following tasks:

1. Add the new project (name) to the list in the [build.gradle.kts](https://github.com/ioki-mobility/GradleWrapperUpgrader/blob/main/build.gradle.kts) file.
2. Invite [iokibot](https://github.com/iokibot) as a contributor with **Write** access to the new project.
   1. Wait that the invite got accepted by [Blackjacx](https://github.com/Blackjacx/).
3. Celebrate 🥳
