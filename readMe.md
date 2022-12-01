## 欢迎来到starter
* 简介:快速启动搭建api和admin的开胃菜，参照若依项目改编
* 准备事项

### 结构介绍
1. starter-admin：后台admin包含启动类、打包,引入framework、platform、generator、system、job模块
2. starter-api：接口api包含启动类、打包,引入framework、business模块
3. starter-common：通用工具包，包含json、shiro、io、hutool、lombok
4. starter-framework：核心框架，包含springboot各种依赖、配置、拦截器、切面
5. starter-generator：代码生成，模板配置
6. starter-job：xxl-job执行器
7. starter-mq：消息队列模块
8. starter-platform：后台模块
9. starter-system：后台系统模块

### 注意事项
* ApplicationConfig扫描路径
* CaptchaConfig-getKaptchaBeanMath(验证码文本生成器)路径
* GlobalConfig-ConfigurationProperties(prefix = "starter")读取的yml # 项目相关配置
* ShiroConfig.getEhCacheManager
* ShiroConfig.shiroFilterFactoryBean(放开接口地址api)
* FileUploadUtils.upload(上传图片到服务器)

### 待完成
* 上传图片服务器工具
* 集成mq

