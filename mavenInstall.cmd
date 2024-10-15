echo off
set workingDir=%cd%
echo.

echo #--------------------------------#
echo ^| Starting maven automated setup ^|
echo #--------------------------------#

if exist javasgate.jar ( del javasgate.jar )
copy "%workingDir%\target\javasgate-1-jar-with-dependencies.jar" "%workingDir%" >NUL
ren javasgate-1-jar-with-dependencies.jar javasgate.jar

java -jar javasgate.jar

PAUSE