springcloud学习之搭建问题总结：
1.  SpringCloud中的服务注册与发现有多种实现，比如：eureka, consul, zookeeper。在使用服务发现时有两套注解即：@EnableEurekaClient和@EnableDiscoveryClient，其主要区别如下：
        1. @EnableDiscoveryClient注解是基于spring-cloud-commons依赖，并且在classpath中实现； 
        2. @EnableEurekaClient注解是基于spring-cloud-netflix依赖，只能为eureka作用；
        3. @EnableEurekaClient只适用于Eureka作为注册中心，@EnableDiscoveryClient可以是其他注册中心，使用场景较为单一。如果你的classpath中添加了eureka，则它们的作用是一样的。
        4. @EnableDiscoveryClient和@EnableEurekaClient共同点就是：都是能够让注册中心能够发现，扫描到该服务。
        简单来说，使用Eureka作为服务注册中心时，使用服务发现@EnableDiscoveryClient或@EnableEurekaClient都可以，但是不用Eureka做服务注册中心时，只能使用@EnableDiscoveryClient，不能使用@EnableEurekaClient。

2.服务负载均衡。feign和ribbon都是用作服务负载均衡使用，考虑在使用ribbon时需要自己构建http请求，步骤比较繁琐,舍弃ribbon，采用feign做负载均衡，feign与ribbon主要区别如下：
    1.启动类使用的注解不同，Ribbon用的是@RibbonClient，Feign用的是@EnableFeignClients。
    2.服务的指定位置不同，Ribbon是在@RibbonClient注解上声明，Feign则是在定义抽象方法的接口中使用@FeignClient声明。
    3.调用方式不同，Ribbon需要自己构建http请求，模拟http请求然后使用RestTemplate发送给其他服务，步骤相当繁琐。
    Feign则是在Ribbon的基础上进行了一次改进，采用接口的方式，将需要调用的其他服务的方法定义成抽象方法即可，不需要自己构建http请求。不过要注意的是抽象方法的注解、方法签名要和提供服务的方法完全一致。
