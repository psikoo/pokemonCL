echo off
set workingDir=%cd%
echo.

echo #--------------------------------#
echo ^| Starting maven automated setup ^|
echo #--------------------------------#

if exist pokemon.jar ( del pokemon.jar )
copy "%workingDir%\target\pokemon-1-jar-with-dependencies.jar" "%workingDir%" >NUL
ren pokemon-1-jar-with-dependencies.jar pokemon.jar

java -jar pokemon.jar

PAUSE