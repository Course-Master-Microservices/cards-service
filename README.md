# cards-service
Cards Service

## Jib (Docker Image)
- Google Jib website - https://github.com/GoogleContainerTools/jib

### Jib Configuration
```
<plugin>
    <groupId>com.google.cloud.tools</groupId>
    <artifactId>jib-maven-plugin</artifactId>
    <version>3.4.6</version>
    <configuration>
      <to>
        <image>myimage</image>
      </to>
    </configuration>
</plugin>
```

### Build Docker Image

```
mvn compile jib:build
```
or
```
mvn compile jib:dockerBuild
```

See the [Jib documentation](https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin#build-your-image)

### Run Docker Image
```
docker run -d -p 9000:9000 luisalho/cards-service:s4
```