# JavaFX Deploy Sample

## Description

This is a JavaFX deploy example for Windows OS. Ultimately, it produces a Windows Installer that includes a custom JRE.

End-users can install the program via a small (`28MB`) `exe` file and run it immediately using the generated desktop shortcut without the need for additional JRE installations.

---

**The actual build process involves the following steps:**
- Bundling dependencies using `module-info.java` or the `jdeps` tool
- Creating a runtime image using the `jlink` tool
- Packaging as an installer using the `jpackage` tool

In this example, [JavaFX-Maven-Plugin](https://github.com/openjfx/javafx-maven-plugin) and [JPackage-Maven-Plugin](https://github.com/petr-panteleyev/jpackage-maven-plugin) plugins are used instead of direct commands.

## How to Build

Firstly, to create the Windows Installer, please install [Wix](https://github.com/wixtoolset/wix3/releases). Install `wix311.exe`.

Then, build using the following command:

```bash
.\mvnw clean javafx:jlink jpackage:jpackage
```

The output can be found in the `target/dist` folder.