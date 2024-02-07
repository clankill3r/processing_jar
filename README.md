# processing_jar
Jar files with sources and fat jar


This repository provides essential JAR files for working with the Processing IDE outside of its native environment.


## Core JAR with Sources

The core.jar file included in Processing lacks sources, making debugging outside the Processing IDE challenging. This repository provides both core.jar and core-sources.jar, enabling debugging and breakpoint placement in alternative editors like VSCode.


## jogamp-fat.jar

Included is jogamp-fat.jar, sourced directly from [Jogamp's official site](https://jogamp.org/deployment/archive/rc/). Unlike the JAR files bundled with Processing, jogamp-fat.jar eliminates the need for additional folders and files, simplifying project setup. On top of that the ones that come with processing require of folder called `natives` in the root of the project, else you receive the following error:

> java.lang.UnsatisfiedLinkError: Can't load library: C:\Users\clank\Desktop\some_project\natives\windows-amd64\gluegen_rt.dll

## JOGL Version

This repository utilizes JOGL 2.5 instead of 2.4 due to a critical bug fix. Note that the Processing PDE still relies on JOGL 2.4.
Check this processing issue for the current status: 
[Update to JOGL 2.5](https://github.com/benfry/processing4/issues/806).

## Tags

Tags will be added to match the processing version e.g. `processing-1293-4.3` for processing 4.3 with that revision.

## Important

I believe that putting the jar files in a subfolder like `lib/processing` is currently broken on OSX. I can't test it right now...

## settings.json

Note this repository comes with a hidden folder `.vscode` that contains a `settings.json`, this is for my convenient sake.


```json
"java.configuration.runtimes": [
    {
        "name": "JavaSE-17",
        "path": "C:/Program Files/Eclipse Adoptium/jdk-17.0.10.7-hotspot/",
        "default": true
    },
]
```

## Notes for myself

**Updating jar files:**

```bash
# make a new core.jar
cd /path/to/processing4/build
ant run

# make the core-sources.jar
cd /path/to/processing4/core
ant source-jar
```

**The files to copy:**

> ..\processing4\core\library\core.jar  
> ..\processing4\core\core-sources.jar  

