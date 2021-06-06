# use logstash-logging-spring-boot-starter

        <dependency>
            <groupId>com.github.piomin</groupId>
            <artifactId>logstash-logging-spring-boot-starter</artifactId>
            <version>1.3.0.RELEASE</version>
        </dependency>

# Logstash config tcp input

    logstash -f /Users/dev/IdeaProjects/microservice-centrallize-log-elk-demo/logstash-tcpinput.conf
