# playground

## Modul meldedaten
### Start
Start via Maven oder Eclips Run as Maven build...:
`mvn clean package -Ptomee tomee:run`

### DB-Setup (embedded Derby)
Gemäß der Konfiguration des TomEE liegt die Datenbank im Verzeichnis {git_root}/meldedaten/db/derby/meldedatenDB.

Zunächst muss das Datenmodell angelegt werden. Im Anschluss werden initale Daten für den Test eingefügt. Hierzu
stehen die folgenden Skripte (in {git_root}/meldedaten/db/derby/) zur Verfügung:
* datenmodell.sql
* initial_data.sql

Für Windows liegt ein Hilfsskript (windows_setup.bat) bereit. Hier muss der Pfad für das JDK entsprechend der
lokalen Umgebung angepasst werden.
