package com.hayyot.oshiapp.service;

import org.springframework.stereotype.Service;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

/**
 * @className: CpuLoadMetricsService
 * @author: Jason Shen
 * @date: 2024/12/27
 **/
@Service
public class CpuLoadMetricsService {

//    OSHI
    SystemInfo systemInfo = new SystemInfo();
    public double[] getCpuLoads() {
        HardwareAbstractionLayer hardwareAbstractionLayer = systemInfo.getHardware();
        CentralProcessor centralProcessor = hardwareAbstractionLayer.getProcessor();
        double[] cpuLoad = centralProcessor.getProcessorCpuLoad(1000);
        return cpuLoad;
    }
}
