⚠ If you are running the program in windows run start.cmd once, close and run it again for the ansi codes to work

# Pokemon CL (Command & Line)

Pokemon CL is a small command line recreation of the pokemon game formula. It is a command line program that can be run in anything that can install JVM.

**Features:**

- Choose your gender and starter pokemon.
- Battle 3 different Pokemons and have the chance to capture them.
- Check your pokedex.

## Build PokemonCL yourself

**Build information:**

This project uses Maven as its build tool for Java. To build from source you must install Maven.

**Build steps:**

- Download the code as a [zip](https://github.com/psikoo/pokemonCL/archive/refs/heads/main.zip), or clone the repository from its [.git](https://github.com/psikoo/pokemonCL.git).

- Run this command from the main project directory (PokemonCL-main or PokemonCL depending on your download method):

Build compile .class, create project information site, compile jar, compile jar with dependencies, run mavenInstall.cmd:

```bash
mvn clean validate compile site assembly:assembly -DdescriptorId=jar-with-dependencies exec:exec
```

Build compile .class, compile jar, compile jar with dependencies:
```bash
mvn clean validate compile assembly:assembly -DdescriptorId=jar-with-dependencies
```

- mavenInstall.cmd:
The main purpose of the script is to create a folder in the user's desktop named "PokemonCL" and copy the compiled .jar with dependencies, the README and the start.cmd script into it. This allows for a smother user experience when building this project, as all you would need to run the app is inside this new folder. This script is run automatically when building the project (to stop it from running, remove the "exec:exec" argument from the build command).

- ⚠ Linux and macOS
mavenInstall.cmd only a utility script and its not needed for the building process, it runs after the build process. If you are building this on linux or macOS you can get the game .jar from pokemonCL/target/pokemon-1-jar-with-dependencies.jar and run it using `java -jar pokemon-1-jar-with-dependencies.jar`

## Running PokemonCL

Once you have built the PokemonCL or downloaded it from the [releases](https://github.com/psikoo/PokemonCL/releases/), you can simply run the app by running start.cmd. This script runs the following command: 

```bash
reg add HKEY_CURRENT_USER\Console /v VirtualTerminalLevel /t REG_DWORD /d 0x00000001 /f >NUL
java -jar pokeCL.jar
```
The registery key enables ansi codes in the windows terminal
