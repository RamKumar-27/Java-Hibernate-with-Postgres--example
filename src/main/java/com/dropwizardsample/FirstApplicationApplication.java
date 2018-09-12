package com.dropwizardsample;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class FirstApplicationApplication extends Application<FirstApplicationConfiguration> {

    public static void main(final String[] args) throws Exception {
        new FirstApplicationApplication().run(args);
    }

    @Override
    public String getName() {
        return "FirstApplication";
    }

    @Override
    public void initialize(final Bootstrap<FirstApplicationConfiguration> bootstrap) {
        // TODO: application initialization
//        bootstrap.setConfigurationSourceProvider(
//                new SubstitutingSourceProvider(
//                        bootstrap.getConfigurationSourceProvider(),
//                        new EnvironmentVariableSubstitutor(false)
//                )
//        );
    }

    @Override
    public void run(final FirstApplicationConfiguration configuration, final Environment environment) {
        // TODO: implement application
        environment.jersey().register(new ModelClass());
    }


}
