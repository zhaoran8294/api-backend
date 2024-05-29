
## 项目介绍

基于 React + Springboot+ Dubbo +Gateway 的 API接口开放调用平台。

管理员可以集成并发布接口、下线接口及管理用户等；用户可以浏览接口、在线调试接口及更新用户凭证等，并通过 Java SDK 轻松调用接口。
本项目为前后端分离项目，前端主要采用TypeScript、React、Antd Pro等主流开发框架。后端采用Spring Cloud SpringBoot 作为业务框架。通过Springcloud Gateway作为全局网关实现流量控制、负载均衡以及路由管理，使用Mybatis-plus作为持久层技术。使用Apache Dubbo做高性能远程服务调用。同时Nacos作为注册中心，完成服务注册与发现，通过各模块主要功能以及业务进行模块的合理划分。通过全链路日志以及回调配置, 支持异步接口调用 , 同时通过FreeMarker模板引擎进行自动化SDK代码以及接口文档生成 , 并通过Github Action完成SDK发版与接口文档部署。

## 项目架构设计

这个项目的架构是一个典型的分布式系统，包括多个独立的子项目，每个子项目具有特定的功能和职责。以下是每个子项目的功能和关系。

1. __api-backend__：提供用户认证、接口管理、账号管理、接口调用功能。
2. __api-gateway__：统一鉴权、限流、路由转发、统一日志、接口染色、统一业务处理等。
3. __api-client-sdk__ ：封装了对模拟接口项目的调用，提供了简化的API以便其他项目使用。
4. __api-interface__ ：模拟第三方接口，供客户端SDK调用，用于开发和测试。（这个子项目在该项目中属于第三方服务，可使用第三方在线服务或本地开发项目，我直接使用的本地简单项目，就不创建仓库了）
5. __api-common__: 公共模块，包括各其他模块中需要复用的方法、工具类、实体类、全局异常等。


## 技术栈

### 后端技术栈
* Java Spring Boot
* MySQL 数据库
* MyBatis-Plus 及 MyBatis X 自动生成
* API 签名认证（Http 调用）
* Spring Boot Starter（SDK 开发）
* Dubbo 分布式（RPC、Nacos）
* Swagger + Knife4j 接口文档生成
* Spring Cloud Gateway 微服务网关
* Hutool、Apache Common Utils、Gson 等工具库



