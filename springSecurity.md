Spring Security  4-5 节
高级版的filter  
第一节
What is spring security?
基于service filter, 它帮你做好了很多filter.

一个framework，做各种各样的authentication
basic authentication: 不输入就什么都看不到（可以用filter 做到）  
Token based authentication:  
Anonymous Authentication:  
stateful authentication:  
Session.id (unique 在每一个服务器上)， 带着session.id去请求，在服务器上找到你的信息，就可以去取到了  

cookie 和 section.id 关系：  
cookie 包含 section.id
交互都是用section.id, 只要不清空的话，都可以看到  
他们会用这个来ads 来target你  
登陆永远是post,   
可以用curl来通过terminal登陆  

Session 好处：
coputing 少
session pool: 不一样的形式， 可以在数据库，也可以在文本格式的，多个服务器共享的。（大多是在redis cache）  

   

why using spring security?