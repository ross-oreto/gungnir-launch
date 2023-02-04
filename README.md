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