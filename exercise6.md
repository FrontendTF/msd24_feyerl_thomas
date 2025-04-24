# Exercise 6 – Maven Site Documentation

## What is required to generate Maven Site documentation?

The following configuration provides the **minimum setup** required to generate a functional Maven Site:

```xml
<reporting>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-site-plugin</artifactId>
      <version>3.12.1</version>
    </plugin>
  </plugins>
</reporting>
```

This only enables the basic structure of the site. To enhance the Maven Site with additional information, the following plugins are not strictly required, but highly recommended:

```xml
<!-- Provides project metadata (dependencies, team, licenses, etc.) -->
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-project-info-reports-plugin</artifactId>
  <version>3.5.0</version>
</plugin>

<!-- Adds JavaDoc API documentation to the site -->
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-javadoc-plugin</artifactId>
  <version>3.7.0</version>
  <configuration>
    <!-- Suppress strict JavaDoc validation -->
    <additionalJOption>-Xdoclint:none</additionalJOption>
  </configuration>
</plugin>
```

These optional plugins make the generated site more informative and professional, especially for open-source or team projects.

## Which different aspects, configurations, information are configured in site.xml and pom.xl

### Configuration in site.xml

The `site.xml` file defines the structure and layout of the Maven Site, including:

- Navigation menu (links to reports, Markdown/HTML pages)
- Grouping of sections
- Custom Titles and labels

Example configuration:

```xml
<project name="Calculator Demo">
<publishDate position="right"/>
<version position="left"/>
<body>
<menu name="Overview">
<item name="Introduction" href="index.html"/>
<item name="Addition" href="add.html"/>
<item name="Subtraction" href="minus.html"/>
</menu>
<menu ref="reports"/>
</body>
</project>
```

### Configuration in pom.xml

The `pom.xml` file contains all necessary plugins and configuration for the build process, including:

- Dependencies
- Build plugins
- Reporting tools
- Developer and license information

For this exercise, the focus lies on integrating tools like **Javadoc** and **JaCoCo** into the Maven Site documentation.

#### Key Sections in `pom.xml`

##### Javadoc Plugin

The `maven-javadoc-plugin` generates HTML API documentation from Javadoc comments (e.g., in the `Calculator` class). This improves code readability and maintainability.

**Example configuration:**

```xml
<!--  Java Doc within Maven Site Documentation -->
<plugin>
<groupId>org.apache.maven.plugins</groupId>
<artifactId>maven-javadoc-plugin</artifactId>
<version>3.7.0</version>
<configuration>
<!--  Disable JavaDoc warnings  -->
<additionalJOption>-Xdoclint:none</additionalJOption>
</configuration>
</plugin>
```

##### JaCoCo Plugin

The jacoco-maven-plugin is used to measure test coverage of the project. When you run:

`mvn clean test`

all previously generated files are removed, and the test suite is executed.
If the plugin is configured in the `<reporting>` section, JaCoCo will generate a readable HTML report showing which parts of the code are covered by tests. This report is then included in the generated Maven Site.

Example configuration:

```xml
<!--  Test Coverage from JaCoCo Plugin integration in Maven Site Documentation  -->
<plugin>
<groupId>org.jacoco</groupId>
<artifactId>jacoco-maven-plugin</artifactId>
<version>0.8.12</version>
<reportSets>
<reportSet>
<reports>
<!--  select non-aggregate reports  -->
<report>report</report>
</reports>
</reportSet>
</reportSets>
</plugin>
```
