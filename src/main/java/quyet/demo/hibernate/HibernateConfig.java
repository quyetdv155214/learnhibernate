package quyet.demo.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import quyet.demo.hibernate.entities.example.Event;

public class HibernateConfig {

//    private SessionFactory createSessionFactory(boolean traceWithActiveSpanOnly) {
//        Configuration configuration = new Configuration();
//        configuration.addAnnotatedClass(Event.class);
//        configuration.setProperty("hibernate.connection.driver_class",
//                "io.opentracing.contrib.jdbc.TracingDriver");
//        configuration.setProperty("hibernate.connection.url",
//                "jdbc:tracing:h2:mem:hibernate?traceWithActiveSpanOnly=" + traceWithActiveSpanOnly);
//        configuration.setProperty("hibernate.connection.username", "sa");
//        configuration.setProperty("hibernate.connection.password", "");
//        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
//        configuration.setProperty("hibernate.hbm2ddl.auto", "create-drop");
//        configuration.setProperty("hibernate.show_sql", "true");
//        configuration.setProperty("hibernate.connection.pool_size", "10");
//        configuration.addClass(Event.class);
//
//        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
//                .applySettings(configuration.getProperties());
//        return configuration.buildSessionFactory(builder.build());
//    }

}
