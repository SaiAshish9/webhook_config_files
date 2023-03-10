```
server:
  port: 9093
spring:
  application:
    name: dataservice
  data:
    cassandra:
      keyspace-name: itgarden
      contact-points: 127.0.0.1
      port: 9042
      local-datacenter: datacenter1
```
