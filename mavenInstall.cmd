echo off
set workingDir=%cd%
set desktop="%userprofile%\Desktop"
echo.

echo #--------------------------------#
echo ^| Starting maven automated setup ^|
echo #--------------------------------#

REM add registery key to enable ansi codes in terminal for the current user
reg add HKEY_CURRENT_USER\Console /v VirtualTerminalLevel /t REG_DWORD /d 0x00000001 /f >NUL

cd %desktop%
if not exist "%desktop%\PokemonCL" ( 
    mkdir "PokemonCL"
    cd "%desktop%\PokemonCL"
) else ( cd "%desktop%\PokemonCL" )

if exist README.md ( del README.md )
if exist start.cmd ( del start.cmd )
if exist pokemonCL.jar ( del pokemonCL.jar )
if exist pokemon-1-jar-with-dependencies.jar ( del pokemon-1-jar-with-dependencies.jar )

copy "%workingDir%\target\pokemon-1-jar-with-dependencies.jar" "%desktop%\PokemonCL" >NUL
copy "%workingDir%\README.md" "%desktop%\PokemonCL" >NUL
copy "%workingDir%\src\main\resources\start.cmd" "%desktop%\PokemonCL" >NUL

cd "%desktop%\PokemonCL"
ren pokemon-1-jar-with-dependencies.jar pokemonCL.jar

echo ^| Copying files                  ^|
echo #--------------------------------#
