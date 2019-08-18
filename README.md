# spring-cloud-config
第 10 章 配置中心 Spring Cloud Config
## Config Server管理本地配置文件方式
- Config Client配置文件为bootstrap.yml，优先于application.yml文件加载
- bootstrap配置文件中的变量{spring.application.name}和变量{spring.profiles.active}，两者以“-”相连，构成了向Config Server读取的配置文件名
