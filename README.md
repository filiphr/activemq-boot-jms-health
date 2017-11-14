# Demonstrator of ActiveMQ blocking failover

This project demonstrates the blocking of the default ActiveMQ failover transport
blocking a connection start, and not using the `TransportListener` when starting a connection.

This behaviour is an issue for Spring Boot and causes the `JmsHealthIndicator` to block,
which in turn causes the `/application/health` actuator endpoint to block.

In order to test this start the application and try to navigate to: [`http://localhost:8080/application/health`](http://localhost:8080/application/health).

See also:

* Spring Boot Issue [gh-10809](https://github.com/spring-projects/spring-boot/issues/10809) and PR [gh-10853](https://github.com/spring-projects/spring-boot/pull/10853)
* ActiveMQ Forum Question [cannot monitor Failover Transport](http://activemq.2283324.n4.nabble.com/Cannot-monitor-Failover-Transport-td4732844.html) 
