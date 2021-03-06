package abi32_0_0.host.exp.exponent.modules.universal.sensors;

import java.util.Collections;
import java.util.List;

import abi32_0_0.expo.core.interfaces.InternalModule;
import abi32_0_0.expo.interfaces.sensors.services.GravitySensorService;
import host.exp.exponent.kernel.ExperienceId;
import host.exp.exponent.kernel.services.sensors.SubscribableSensorKernelService;

public class ScopedGravitySensorService extends BaseSensorService implements InternalModule, GravitySensorService {
  public ScopedGravitySensorService(ExperienceId experienceId) {
    super(experienceId);
  }

  @Override
  protected SubscribableSensorKernelService getSensorKernelService() {
    return getKernelServiceRegistry().getGravitySensorKernelService();
  }

  @Override
  public List<Class> getExportedInterfaces() {
    return Collections.<Class>singletonList(GravitySensorService.class);
  }
}

