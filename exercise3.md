# Uebung3

## Übungsanleitung

Das Ziel der dritten Übung ist es, ein Java-Projekt mit Hilfe von Git zu
versionieren. In dieser Übung werden Sie verschiedene Werkzeuge zur BuildAutomatisierung kennenlernen und weitere Möglichkeiten von Git erkunden bzw.
wiederholen.

---

## Voraussetzungen

### **1. Installationen & Setups**

- Eine **IDE** (z. B. VS Code oder IntelliJ)
- **Maven** [🔗 Download](https://maven.apache.org/download.cgi) (Standardeinstellungen verwenden)
- **OpenJDK** [🔗 Download](https://openjdk.java.net)
- Das Repository **msd_feyerl_thomas** wurde bereits lokal verbunden, da der Projektordner beim Öffnen automatisch erkannt wurde.

## Arbeitsschritte

### **2. Umgebungsvariablen setzen in der PATH **

1. Setzen der JAVA_HOME , MAVEN und PATH Variable in den Umgebungsvariablen
2. PATH ergänzen (…\bin Pfad der Programme) bei
   • Java
   • Maven

### \*\*3. Im Terminal Testen ob Maven/Java richtig installiert ist

mvn -v
java -version
javac -version

### \*\*4. Neues Projekt mit Maven erstellen

#### Normales CMD Fenster Maven Projekt erstellen

Funktioniert mit Windows Powershell nicht:
mvn archetype:generate -DgroupId=at.fhj.msd -DartifactId=calculator
-DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

#### Mit Powershell Maven Projekt erstellen

mvn archetype:generate "-DgroupId=at.fhj.msd" "-DartifactId=calculator"
"-DarchetypeArtifactId=maven-archetype-quickstart" "-DinteractiveMode=false"

Falls es mit einer GIU erstellt wurde den .idea Ordner in .gitignore hinzufügen. Ich habe es trotz CMD zusätzlich hinzugefügt sollte ich in der Zukunft Projekte in das Repo pushen über eine IDE GUI anstatt über das Terminal

### \*\*5. Git Projekt ins Repositority in den Root pushen

```
git add calculator/
git commit -m "Projekt mit Maven erstellt"
git push -u origin main
```

### Neuer Ordner nach Build-Vorgang

Nach der ersten Ausführung wurde der `target/` -Ordner erstellt, der die kompilierten Java-Klassen enthält.

[Ordnerstruktur](resources/images/ex3_1.png)

### Erfolgreicher Build

Nach: mvn compile
[Buildscreenshot](resources/images/ex3_2.png)
