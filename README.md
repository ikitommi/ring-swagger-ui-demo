# swagger-ui-demo

created with:

```bash
lein new compojure-api swagger-ui-demo
cd swagger-ui-demo
mkdir -p resources/swagger-ui
wget https://raw.githubusercontent.com/metosin/ring-swagger-ui/master/resources/swagger-ui/index.html -O resources/swagger-ui/index.html
echo "<h1>Awesome.</h1>" >> resources/swagger-ui/index.html
lein ring uberjar
```

started with:
```
java -jar target/server.jar
```

the jar contents:
```bash
jar -tf target/server.jar |grep swagger-ui
META-INF/maven/swagger-ui-demo/swagger-ui-demo/pom.xml
META-INF/leiningen/swagger-ui-demo/swagger-ui-demo/project.clj
META-INF/leiningen/swagger-ui-demo/swagger-ui-demo/README.md
META-INF/maven/swagger-ui-demo/
META-INF/maven/swagger-ui-demo/swagger-ui-demo/
META-INF/maven/swagger-ui-demo/swagger-ui-demo/pom.properties
swagger-ui/
swagger-ui/index.html
META-INF/maven/metosin/ring-swagger-ui/pom.xml
META-INF/maven/metosin/ring-swagger-ui/pom.properties
META-INF/leiningen/metosin/ring-swagger-ui/project.clj
META-INF/leiningen/metosin/ring-swagger-ui/README.md
swagger-ui/conf.js
swagger-ui/css/
swagger-ui/css/reset.css
swagger-ui/css/screen.css
swagger-ui/images/
swagger-ui/images/explorer_icons.png
swagger-ui/images/logo_small.png
swagger-ui/images/pet_store_api.png
swagger-ui/images/throbber.gif
swagger-ui/images/wordnik_api.png
swagger-ui/lib/
swagger-ui/lib/backbone-min.js
swagger-ui/lib/handlebars-1.0.0.js
swagger-ui/lib/highlight.7.3.pack.js
swagger-ui/lib/jquery-1.8.0.min.js
swagger-ui/lib/jquery.ba-bbq.min.js
swagger-ui/lib/jquery.slideto.min.js
swagger-ui/lib/jquery.wiggle.min.js
swagger-ui/lib/shred/
swagger-ui/lib/shred/content.js
swagger-ui/lib/shred.bundle.js
swagger-ui/lib/swagger-oauth.js
swagger-ui/lib/swagger.js
swagger-ui/lib/underscore-min.js
swagger-ui/o2c.html
swagger-ui/swagger-ui.js
swagger-ui/swagger-ui.min.js
```

![](https://raw.githubusercontent.com/ikitommi/ring-swagger-ui-demo/master/pics/ui.png)

## Usage

### Run the application locally

`lein ring server`

### Packaging and running as standalone jar

```
lein do clean, ring uberjar
java -jar target/server.jar
```

### Packaging as war

`lein ring uberwar`

## License

Copyright ©  FIXME
