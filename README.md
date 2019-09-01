# spring-cloud-config
第 10 章 配置中心 Spring Cloud Config

启动多个config-server，注册到eureka-server，实现config-server高可用。
反复重启config-client，可以看到轮询的从config-server中获取配置，实现负载均衡。
