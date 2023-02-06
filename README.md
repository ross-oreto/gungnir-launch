### gungnir-launch

run 
```
mvn compile exec:java
```

build
```
mvn pacakage 
```

run jar
```
java -jar target/gungnir-launch.jar
```

specify profiles
```
mvn exec:java -Dgungnir.profiles=local,dev
```
```
java -jar -Dgungnir.profiles=local target\gungnir-launch.jar 
```

### application properties
Config files are loaded in this order of priority: (given gungnir.profiles = ['dev'])
  1. System properties
  2. application-dev.conf (would just be application.conf when profiles are empty)
  3. reference.conf (comes from gungnir jar classpath)

specify a different config source -Dconfig.file=path/to/config-file
```
java -Dconfig.file=path/to/config-file -jar app.jar
```
- config.resource specifies a resource name - not a basename, i.e. application.conf not application
- config.file specifies a filesystem path, again it should include the extension, not be a basename
- config.url specifies a URL