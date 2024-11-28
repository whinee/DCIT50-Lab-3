<h1 align="center" style="font-weight: bold">
    Getting Started
</h1>

<div class="toc">
    <h2 id="toc"><b><a href="#toc">Table of Contents</a></b></h2>
    <ul>
        <li>
            <a href="#installing-prerequisites">Installing Prerequisites</a>
            <ul>
                <li><a href="#installing-prerequisites-windows">Windows</a></li>
                <li>
                    <a href="#installing-prerequisites-linux">Linux</a>
                    <ul>
                        <li><a href="#installing-prerequisites-linux-debian">Debian</a></li>
                        <li><a href="#installing-prerequisites-linux-fedora">Fedora</a></li>
                        <li><a href="#installing-prerequisites-linux-arch">Arch</a></li>
                    </ul>
                </li>
            </ul>
        </li>
    </ul>
</div>

<h2 id="installing-prerequisites"><b><a href="#installing-prerequisites">Installing Prerequisites</a></b></h2>

<h2 id="installing-prerequisites-windows"><b><i><a href="#installing-prerequisites-windows">Windows</a></i></b></h2>

1. Copy the following text:

    ```ps1
    Set-ExecutionPolicy Bypass -Scope Process -Force
    [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072
    iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
    ```

2. Press `Windows` + `R` (Press `Windows` and `R` keys simultaneously)

3. A window with a title `Run` should appear. Focus to the said window in the `Open:` text field by hovering the mouse towards the said text field and left-clicking the mouse and type `powershell` as shown below:

    ![](/docs/assets/images/run_box_ps.png)

4. Press `Ctrl` + `Shift` + `Enter` (Press `Ctrl`, `Shift`, and `Enter` keys simultaneously).

5. A window with a title `User Account Control` should appear as shown below:

    ![](/docs/assets/images/UAC_ps.png)

6. Focus to the said window and press the `Yes` button by hovering the mouse towards the said button and left-clicking the mouse. A window named `Administrator: Windows Powershell` should pop-up.

7. Focus to the window named `Administrator: Windows Powershell` window by hovering the mouse towards the said window and left-clicking the mouse. Then, press `Ctrl` + `V` (Press `Ctrl` and `V` keys simultaneously), and `Enter` afterwards.

    If the window `Administrator: Windows Powershell` seems to hang up, focus to said window by hovering the mouse towards the said window and left-clicking the mouse, then press `Enter` five times every minute or so until something happens.

8. Restart your computer, then login to the user account to which you have done the above instructions at.

9. Copy the following text:

    ```ps1
    choco install -y git
    ```

    Then, repeat step 2-8.

10. Download an OpenJDK build from [adoptium.net](https://adoptium.net/) and install it.

11. Replace the "username" and "email" in the following text with your respective username and email you used for registration in Github:

    ```ps1
    git config --global user.name "username"
    git config --global user.email "email"
    ```

    Then, repeat step 2-8.

<h2 id="installing-prerequisites-linux"><b><i><a href="#installing-prerequisites-linux">Linux</a></i></b></h2>

<h2 id="installing-prerequisites-linux-debian"><a href="#installing-prerequisites-linux-debian">Debian</a></h2>

1. Open your preferred terminal and run the following command to install the prerequisites:

    ```sh
    sudo apt update -y
    sudo apt install -y default-jre git
    ```

<h2 id="installing-prerequisites-linux-fedora"><a href="#installing-prerequisites-linux-fedora">Fedora</a></h2>

1. Open your preferred terminal and run the following command to install the prerequisites:

    ```sh
    sudo dnf install -y git java-latest-openjdk.x86_64
    ```

<h2 id="installing-prerequisites-linux-arch"><a href="#installing-prerequisites-linux-arch">Arch</a></h2>

1. Open your preferred terminal and run the following command to install the prerequisites:

    ```sh
    sudo pacman -Syyu --noconfirm git jre-openjdk
    ```
