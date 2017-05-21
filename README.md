# summer
# spring 的注解
<p>
一，Java配置类上用到的注解<br/>
  1，@Configuration 声明一个类是Spring配置类，以替换xml配置文件<br/>
  2，@Bean 声明配置类中的方法的返回值是一个bean<br/>
  3，@EnableWebMvc 开启对SpringMVC的支持 <br/>
  4，@EnableScheduling 开启对定时任务的支持，需要联合@Scheduled注解使用<br/>
  5，@ComponentScan 声明扫描的包<br/>
  6，@EnableAspectJAutoProxy 开启基于AspectJ的AOP支持<br/>
</p>
<p>
二，声明Bean的注解<br/>
 1，@Component 组件，无明确角色<br/>
 2，@Service 在业务逻辑层（Service层）使用<br/>
 3，@Repository 在数据访问层（DAO层）使用<br/>
 4，@Controller 在控制层使用<br/>
</p>
<p>
三，注入Bean的注解<br/>
 1，@Autowired Spring提供的注解，默认以类型匹配注入，如果需要ID匹配，需要使用@Qualifier注解<br/>
 2，@Inject JSR-330提供的注解<br/>
 3，@Resource JSR-250提供的注解<br/>
</p> 
