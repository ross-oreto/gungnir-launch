package io.oreto.gungnir.launch;

import io.oreto.gungnir.app.AppService;
import io.oreto.gungnir.app.Gungnir;
import io.oreto.gungnir.app.ServiceRegistrar;

public class GungnirLaunch extends Gungnir {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        new GungnirLaunch().start();
    }

    @Override
    protected void registerServices(ServiceRegistrar registrar) {
        registrar.register(new AppService());
    }
}
