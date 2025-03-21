# 10分钟上手 spring-ai

## 版本说明
● JDK >= 17
● Spring 6.x;Spring Boot 3.x
● Spring AI 1.0.0-M5


如果本地 maven 有阿里镜像，务必如下修改,否则将无法拉 spring-ai 包下来

````shell
<mirror>
    <id>alimaven</id>
    <mirrorOf>*,!spring-milestones</mirrorOf>
    <name>aliyun maven</name>
    <url>http://maven.aliyun.com/nexus/content/repositories/central/</url>
</mirror>
````

## 申请 open api 
请移步 open api 官网并申请api，得到的 api-key 于 applicaition.yml 替换