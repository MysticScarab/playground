# playground

## Checkstyle

Das Projekt nutzt eine angepasste Version der Google-Checks aus Checkstyle 8.40. Die Anpassung war erforderlich, um beim
Check während des Builds auch die `@SuppressWarnings`-Annotationen für Checkstyle zu berücksichtigen.

Konkret wurden lediglich zwei Zeilen ergänzt:

* `<module name="SuppressWarningsFilter"/>` im Modul `Checker`
* `<module name="SuppressWarningsHolder"/>` im Modul `TreeWalker`

Die Checkstyle-Konfiguration wird ebenfalls in IntelliJ im Checkstyle-Plugin verwendet, damit sich Entwicklungsumgebung
und Mavenbuild gleich verhalten.

## Modul meldedaten

### Start

Start via Maven oder Eclips Run as Maven build...:
`mvn clean package -Ptomee tomee:run`

### Embedded InMemory DB

Bei Verwendung des TomEE-Plugins wird der Server bereits mit einer HSQL-Datenbank gestartet. Für das Profil wird eine
eigene `persistence.xml` verwendet (in `src/test/resources/META-INF`). Über diese Konfiguration wird mittels JPA das
Datenbankschema anhand der Entities angelegt und mit initialen Daten versorgt (`initial_data.sql`).