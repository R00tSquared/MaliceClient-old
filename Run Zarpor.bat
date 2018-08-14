@echo off
title Zarpor - Loading
color 0b

for /f "tokens=2 delims=e" %%i in ('dir /b "%programfiles%\java"') do (
set java_home=%%i
)

:start
title  Zarpor (x64) - Loader
echo * Auto-Detected %PROCESSOR_ARCHITECTURE% Operating System

if exist "%HOMEDRIVE%\Program Files (x86)\java"  goto x64
goto x86


:x64
echo * Java Version 32bit (jre%java_home%)
echo.
echo [ Client Output ]
 
"%HOMEDRIVE%/Program Files (x86)/Java/jre%java_home%/bin/java.exe" -jar Zarpor_V6.jar -Xmx1024m Jframe 10 0 highmem members 32
exit

:x86
echo * Java Version 64bit (jre%java_home%)
echo.
echo [ Client Output ]
"%HOMEDRIVE%/Program Files/Java/jre%java_home%/bin/java.exe" -jar Zarpor_V6.jar -Xmx1024m Jframe 10 0 highmem members 32
exit