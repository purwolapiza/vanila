# vanila

**Edit Settings.xml**
- Open Settings.xml in conf folder under Apache Maven installation folder 
- Add repository from Bintray to get maven-protoc-plugin

```
<pluginRepositories>
    <pluginRepository>
        <releases>
            <updatePolicy>never</updatePolicy>
        </releases>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
        <id>central</id>
        <name>Central Repository</name>
        <url>https://repo.maven.apache.org/maven2</url>
    </pluginRepository>
    <pluginRepository>
        <id>protoc-plugin</id>
        <url>https://dl.bintray.com/sergei-ivanov/maven/</url>
    </pluginRepository>
</pluginRepositories>
```
