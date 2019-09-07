# spring-mvc-basics-Eclipse-IDE---Maven-
Developed and Tested in Eclipse IDE(2018-09)


### 1. Web MVC Complete project

![loginscreen](https://github.com/nlpraveennl/spring-mvc-basics-Eclipse-IDE---Maven-/blob/master/z_screenshots/mvc_complete.png)

```xml
<servlet>
  <servlet-name>simpleUrlHandlerDispatcherServlet</servlet-name>
  <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  <init-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/simpleUrlHandlerMapping.xml</param-value>
  </init-param>
</servlet>
<servlet-mapping>
  <servlet-name>simpleUrlHandlerDispatcherServlet</servlet-name>
  <url-pattern>*.simple</url-pattern>
</servlet-mapping>

<servlet>
  <servlet-name>beanNameUrlHandlerDispatcherServlet</servlet-name>
  <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  <init-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/beanNameUrlHandlerMapping.xml</param-value>
  </init-param>
</servlet>
<servlet-mapping>
  <servlet-name>beanNameUrlHandlerDispatcherServlet</servlet-name>
  <url-pattern>*.beanName</url-pattern>
</servlet-mapping>

<servlet>
  <servlet-name>urlFileNameHandlerDispatcherServlet</servlet-name>
  <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  <init-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/urlFileNameHandlerMapping.xml</param-value>
  </init-param>
</servlet>
<servlet-mapping>
  <servlet-name>urlFileNameHandlerDispatcherServlet</servlet-name>
  <url-pattern>*.url</url-pattern>
</servlet-mapping>
```

### 2. MVC with context param
![loginscreen](https://github.com/nlpraveennl/spring-mvc-basics-Eclipse-IDE---Maven-/blob/master/z_screenshots/mvc_with_context_param.png)

```xml
<servlet>
  <servlet-name>dispatcher</servlet-name>
  <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  <init-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/initparam.xml,/WEB-INF/initparam2.xml</param-value>
  </init-param>
</servlet>
<servlet-mapping>
  <servlet-name>dispatcher</servlet-name>
  <url-pattern>*.html</url-pattern>
</servlet-mapping>

<context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/contextparam.xml</param-value>
</context-param>
```

