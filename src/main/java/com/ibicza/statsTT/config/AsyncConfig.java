package com.ibicza.statsTT.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync  // Включаем поддержку асинхронности
public class AsyncConfig {

    @Bean(name = "taskExecutor")
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);  // Минимальное количество потоков
        executor.setMaxPoolSize(50);   // Максимальное количество потоков
        executor.setQueueCapacity(100);  // Размер очереди
        executor.setThreadNamePrefix("async-");  // Префикс для имен потоков
        executor.initialize();  // Инициализация
        return executor;
    }
}
