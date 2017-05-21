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
 4，@scope 声明bean的生命周期，常用的有singleton（默认），prototype，request，session 和 globalSession<br/>
</p> 
<p>
四，基于AspectJ的AOP注解<br/>
 1，@Aspect 用在类上，声明一个切面<br/>
 2，@After 在用在方法上，声明一个建言（advice），此方法将在符合切点规则的方法执行后执行<br/>
 3，@Before 在用在方法上，声明一个建言（advice），此方法将在符合切点规则的方法执行前执行<br/>
 4，@Around 在用在方法上，声明一个建言（advice），此方法将环绕符合切点规则的方法执行<br/>
 5，@Pointcut 声明一个切点，切点规则指定了在哪些方法上执行建言<br/>
</p>
<p>
五，声明数据库事物使用的注解<br/>
 1，@Transactional 声明要开启数据库事务，用在类上或方法上<br/>
</p>
<p>
六，缓存相关的注解<br/>
 1，@Cacheable 用在方法上，声明方法的返回值需要缓存，在缓存失效之前且查询条件未变化，将直接返回缓存的数据<br/>
 2，@CachePut 用在方法上，声明方法的返回值需要缓存，但是每次都会执行方法，不会直接返回缓存中的数据<br/>
 3，@CacheEvict 用在方法上，执行方法之后（或之前beforeInvocation=true），清理指定的缓存数据<br/>
 4，@Caching 在方法或类上同时指定多个注解，它有三个属性：cacheable、put和evict，分别用于指定@Cacheable、@CachePut和@CacheEvict<br/>
 5，@CacheConfig 用在类上，用来为类里面的方法指定一个默认的cache名称，这样在使用前三个注解时，就不用写cache名称了<br/>
</p>
<p>
七，使用properties文件<br/>
 1、@PropertySource 用在类上，声明properties文件的位置，替代xml配置文件中的util:properties<br/>
</p>
<p>
八，EL表达式相关的注解<br/>
 1，@Value 用在类的属性上，用来执行EL表达式，并把执行结果赋给属性<br/>
</p>
<p>
九，Bean在初始化后和销毁前执行的方法<br/>
 1，@PostConstruct 用在方法上，声明方法将在bean初始化后执行<br/>
 2，@PreDestroy 用在方法上，声明方法将在bean销毁前执行<br/>
 3，可以用@Bean替换上面两个：@Bena(initMethod="method1",destroyMethod="method2")<br/>
</p>
