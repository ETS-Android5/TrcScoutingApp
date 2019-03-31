@echo off
:start
echo TRC Scouting App Data Grabber
echo (C) Titan Robotics Club 2019
:prompt
echo.
echo       Choice Menu
echo [1] - Pull data from phone
echo [9] - Exit 
SET /P _inputname=Choice: 
IF "%_inputname%"=="1" GOTO :pull
IF "%_inputname%"=="9" GOTO :done
:confused
echo Please enter a valid choice.
goto :prompt
:done
echo Bye!
exit
:pull
echo Pulling data from phone...
mkdir outputs
call adbpull /sdcard/TrcScoutingApp/*.csv
echo Done
goto :start