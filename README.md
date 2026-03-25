# Android framework stubs

Full stubs for the android framework (+stub project generator script)

Can be injected into any android project to provide full stubs for the android framework

# Usage

Import the desired version with Jitpack; for proper injection, ensure the jar is prepended to the classpath

For an example usage with multiple stubs, see [Murine Launcher](https://github.com/alesimula/Murine-launcher/blob/main/build.gradle)

The stub aims to (but is not 100% guaranteed to) provide a 1-to-1 interface to an entire android framework jar


# Create your own stub framework

1. Download, build or obtain the desired framework.jar
2. Run `python jar_stubify.py <input.jar> <output_dir> [--fake-deps]`
3. The script will create a directory with the stubs and an "<output_dir>_deps" directory
4. Build the framework stubs using the fake deps only as compile time dependencies (see this project's build.gradle)
5. Profit
