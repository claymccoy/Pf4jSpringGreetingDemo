# PF4J Gradle Spring Demo

This demo assumes that you know the basics of Gradle (Please look at [gradle](https://gradle.org/) for more info)

### Setup/Build

1. clone this repo
2. `cd Pf4jSpringGreetingDemo` 
3. run `./gradlew build`
4. optionally, put some plugins in the './plugins' directory. [This one](https://github.com/claymccoy/BjjGreetingPlugin) for example

### Run the demo

1. Run 

```
 ./gradlew bootRun
```

2. The demo's output should look similar to:
```
10:09:56.098 [main] DEBUG org.springframework.context.annotation.AnnotationConfigApplicationContext - Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@18769467
10:09:56.107 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor'
10:09:56.177 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerProcessor'
10:09:56.178 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.event.internalEventListenerFactory'
10:09:56.179 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor'
10:09:56.180 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
10:09:56.184 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'springConfiguration'
10:09:56.188 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'pluginManager'
10:09:56.204 [main] INFO org.pf4j.DefaultPluginStatusProvider - Enabled plugins: []
10:09:56.205 [main] INFO org.pf4j.DefaultPluginStatusProvider - Disabled plugins: []
10:09:56.207 [main] INFO org.pf4j.DefaultPluginManager - PF4J version 3.1.0 in 'deployment' mode
10:09:56.214 [main] DEBUG org.pf4j.AbstractPluginManager - Lookup plugins in 'plugins'
10:09:56.216 [main] DEBUG org.pf4j.AbstractPluginManager - Found 1 possible plugins: [plugins/plugin-welcome-plugin-0.0.1]
10:09:56.217 [main] DEBUG org.pf4j.AbstractPluginManager - Use 'org.pf4j.CompoundPluginDescriptorFinder@67e2d983' to find plugins descriptors
10:09:56.217 [main] DEBUG org.pf4j.AbstractPluginManager - Finding plugin descriptor for plugin 'plugins/plugin-welcome-plugin-0.0.1'
10:09:56.217 [main] DEBUG org.pf4j.CompoundPluginDescriptorFinder - 'org.pf4j.PropertiesPluginDescriptorFinder@5d47c63f' is applicable for plugin 'plugins/plugin-welcome-plugin-0.0.1'
10:09:56.217 [main] DEBUG org.pf4j.PropertiesPluginDescriptorFinder - Lookup plugin descriptor in 'plugins/plugin-welcome-plugin-0.0.1/plugin.properties'
10:09:56.218 [main] DEBUG org.pf4j.CompoundPluginDescriptorFinder - Cannot find 'plugins/plugin-welcome-plugin-0.0.1/plugin.properties' path
10:09:56.219 [main] DEBUG org.pf4j.CompoundPluginDescriptorFinder - Try to continue with the next finder
10:09:56.219 [main] DEBUG org.pf4j.CompoundPluginDescriptorFinder - 'org.pf4j.ManifestPluginDescriptorFinder@568bf312' is applicable for plugin 'plugins/plugin-welcome-plugin-0.0.1'
10:09:56.219 [main] DEBUG org.pf4j.ManifestPluginDescriptorFinder - Lookup plugin descriptor in 'plugins/plugin-welcome-plugin-0.0.1/classes/META-INF/MANIFEST.MF'
10:09:56.226 [main] DEBUG org.pf4j.AbstractPluginManager - Found descriptor PluginDescriptor [pluginId=welcome-plugin, pluginClass=org.pf4j.demo.welcome.WelcomePlugin, version=0.0.1, provider=Decebal Suiu, dependencies=[], description=, requires=*, license=null]
10:09:56.227 [main] DEBUG org.pf4j.AbstractPluginManager - Class 'org.pf4j.demo.welcome.WelcomePlugin' for plugin 'plugins/plugin-welcome-plugin-0.0.1'
10:09:56.227 [main] DEBUG org.pf4j.AbstractPluginManager - Loading plugin 'plugins/plugin-welcome-plugin-0.0.1'
10:09:56.227 [main] DEBUG org.pf4j.CompoundPluginLoader - 'org.pf4j.JarPluginLoader@35083305' is not applicable for plugin 'plugins/plugin-welcome-plugin-0.0.1'
10:09:56.227 [main] DEBUG org.pf4j.CompoundPluginLoader - 'org.pf4j.DefaultPluginLoader@8e0379d' is applicable for plugin 'plugins/plugin-welcome-plugin-0.0.1'
10:09:56.227 [main] DEBUG org.pf4j.PluginClassLoader - Add 'file:/Users/claymccoy/dev/projects/pf4j/demos/springGreeting/plugins/plugin-welcome-plugin-0.0.1/classes/'
10:09:56.227 [main] DEBUG org.pf4j.PluginClassLoader - Add 'file:/Users/claymccoy/dev/projects/pf4j/demos/springGreeting/plugins/plugin-welcome-plugin-0.0.1/lib/commons-lang3-3.5.jar'
10:09:56.228 [main] DEBUG org.pf4j.AbstractPluginManager - Loaded plugin 'plugins/plugin-welcome-plugin-0.0.1' with class loader 'org.pf4j.PluginClassLoader@2890c451'
10:09:56.228 [main] DEBUG org.pf4j.AbstractPluginManager - Creating wrapper for plugin 'plugins/plugin-welcome-plugin-0.0.1'
10:09:56.228 [main] DEBUG org.pf4j.AbstractPluginManager - Created wrapper 'PluginWrapper [descriptor=PluginDescriptor [pluginId=welcome-plugin, pluginClass=org.pf4j.demo.welcome.WelcomePlugin, version=0.0.1, provider=Decebal Suiu, dependencies=[], description=, requires=*, license=null], pluginPath=plugins/plugin-welcome-plugin-0.0.1]' for plugin 'plugins/plugin-welcome-plugin-0.0.1'
10:09:56.228 [main] DEBUG org.pf4j.DependencyResolver - Graph: 
   welcome-plugin -> []
10:09:56.228 [main] DEBUG org.pf4j.DependencyResolver - Plugins order: [welcome-plugin]
10:09:56.228 [main] INFO org.pf4j.AbstractPluginManager - Plugin 'welcome-plugin@0.0.1' resolved
10:09:56.228 [main] INFO org.pf4j.AbstractPluginManager - Start plugin 'welcome-plugin@0.0.1'
10:09:56.228 [main] DEBUG org.pf4j.DefaultPluginFactory - Create instance for plugin 'org.pf4j.demo.welcome.WelcomePlugin'
10:09:56.229 [main] INFO org.pf4j.demo.welcome.WelcomePlugin - WelcomePlugin.start()
10:09:56.230 [main] INFO org.pf4j.demo.welcome.WelcomePlugin - WELCOMEPLUGIN
10:09:56.231 [main] DEBUG org.pf4j.LegacyExtensionFinder - Reading extensions storages from classpath
10:09:56.231 [main] DEBUG org.pf4j.LegacyExtensionFinder - Read '/Users/claymccoy/dev/projects/pf4j/demos/springGreeting/build/classes/java/main/META-INF/extensions.idx'
10:09:56.232 [main] DEBUG org.pf4j.AbstractExtensionFinder - Found possible 1 extensions:
10:09:56.232 [main] DEBUG org.pf4j.AbstractExtensionFinder -    org.pf4j.demo.WhazzupGreeting
10:09:56.232 [main] DEBUG org.pf4j.LegacyExtensionFinder - Reading extensions storages from plugins
10:09:56.232 [main] DEBUG org.pf4j.LegacyExtensionFinder - Reading extensions storage from plugin 'welcome-plugin'
10:09:56.232 [main] DEBUG org.pf4j.LegacyExtensionFinder - Read 'META-INF/extensions.idx'
10:09:56.232 [main] DEBUG org.pf4j.AbstractExtensionFinder - Found possible 1 extensions:
10:09:56.232 [main] DEBUG org.pf4j.AbstractExtensionFinder -    org.pf4j.demo.welcome.WelcomePlugin$WelcomeGreeting
10:09:56.232 [main] DEBUG org.pf4j.spring.ExtensionsInjector - Register extension 'org.pf4j.demo.WhazzupGreeting' as bean
10:09:56.233 [main] DEBUG org.pf4j.spring.ExtensionsInjector - Registering extensions of the plugin 'welcome-plugin' as beans
10:09:56.233 [main] DEBUG org.pf4j.spring.ExtensionsInjector - Register extension 'org.pf4j.demo.welcome.WelcomePlugin$WelcomeGreeting' as bean
10:09:56.234 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'greetings'
Found 2 extensions for extension point 'org.pf4j.demo.api.Greeting'
>>> Whazzup
>>> Welcome
10:09:56.264 [main] INFO org.pf4j.AbstractPluginManager - Stop plugin 'welcome-plugin@0.0.1'
10:09:56.264 [main] INFO org.pf4j.demo.welcome.WelcomePlugin - WelcomePlugin.stop()
```

