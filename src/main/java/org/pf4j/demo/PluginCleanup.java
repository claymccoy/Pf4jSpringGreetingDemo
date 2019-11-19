package org.pf4j.demo;

import org.pf4j.spring.SpringPluginManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class PluginCleanup {

    @Autowired
    private SpringPluginManager pluginManager;

    @PreDestroy
    public void destroy() {
        pluginManager.stopPlugins();
    }
}
