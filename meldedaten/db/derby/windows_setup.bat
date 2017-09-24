@ECHO OFF

SET IJ_PATH=D:\development\Java\jdk1.8.0_45\db\bin

SET PATH=%PATH%;%IJ_PATH%


@REM temporäres Script erstellen mit Derby-spezifischem Connect, damit ij.bat aufgerufen werden kann
md temp
type 00a_derby_connect.sql >> .\temp\01_create.sql
type datenmodell.sql >> .\temp\01_create.sql
type initial_data.sql >> .\temp\01_create.sql
type 00b_derby_disconnect.sql >> .\temp\01_create.sql

@REM ij.bat aufrufen, um temporäres Script auszuführen
call ij.bat .\temp\01_create.sql >> out.log

@REM temp-Ordner wieder löschen
rmdir /S /Q temp

@REM pause