echo off
set workingDir=%cd%
echo.

echo #--------------------------------#
echo ^| Starting maven automated setup ^|
echo #--------------------------------#

REM add registery key to enable ansi codes in terminal for the current user
reg add HKEY_CURRENT_USER\Console /v VirtualTerminalLevel /t REG_DWORD /d 0x00000001 /f >NUL

if not exist "%workingDir%\pokemonCL" ( mkdir "%workingDir%\pokemonCL" )
if exist "%workingDir%\pokemonCL\pokemonCL.jar" ( del "%workingDir%\pokemonCL\pokemonCL.jar" )
copy "%workingDir%\target\pokemon-1-jar-with-dependencies.jar" "%workingDir%\pokemonCL" >NUL
cd "%workingDir%\pokemonCL"
ren pokemon-1-jar-with-dependencies.jar pokemonCL.jar

echo ^| Copying and renaming files     ^|
echo #--------------------------------#
