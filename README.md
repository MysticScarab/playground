# playground

## Modul meldedaten

### Start

Start via Maven oder Eclips Run as Maven build...:
`mvn clean package -Ptomee tomee:run`

### Embedded InMemory DB

Bei Verwendung des TomEE-Plugins wird der Server bereits mit einer HSQL-Datenbank gestartet. Für das Profil wird eine
eigene `persistence.xml` verwendet (in `src/test/resources/META-INF`). Über diese Konfiguration wird mittels JPA das
Datenbankschema anhand der Entities angelegt und mit initialen Daten versorgt (`initial_data.sql`).