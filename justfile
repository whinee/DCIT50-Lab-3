[linux]
run:
    #!/usr/bin/env bash
    set -euo pipefail
    javac src/main/java/xyz/whinyaan/dcit50/lab3/*.java -Xdiags:verbose
    java -Dawt.useSystemAAFontSettings=lcd_hrgb -Dswing.aatext=true -cp src/main/java xyz.whinyaan.dcit50.lab3.App # set antialiasing to true for smooth font rendering

[macos]
run:
    #!/usr/bin/env bash
    set -euo pipefail
    javac src/main/java/xyz/whinyaan/dcit50/lab3/*.java -Xdiags:verbose
    java -cp src/main/java xyz.whinyaan.dcit50.lab3.App

[windows]
run:
    #!powershell.exe
    javac src/main/java/xyz/whinyaan/dcit50/lab3/*.java -Xdiags:verbose
    java -cp src/main/java xyz.whinyaan.dcit50.lab3.App