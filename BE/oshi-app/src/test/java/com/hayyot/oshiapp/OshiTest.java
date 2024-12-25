package com.hayyot.oshiapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;

import java.util.List;

/**
 * @className: OshiTest
 * @author: Jason Shen
 * @date: 2024/12/25
 **/
public class OshiTest {
    SystemInfo si = new SystemInfo();
    @Test
    @SneakyThrows
    void test01(){
        // 创建系统监控类
        SystemInfo systemInfo = new SystemInfo();
        OperatingSystem operatingSystem = systemInfo.getOperatingSystem();
        List<OSProcess> osProcessList = operatingSystem.getProcesses();
        ObjectMapper objectMapper = new ObjectMapper();
        for (OSProcess os : osProcessList) {
            String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(os);
            System.out.println(json);
        }
        System.out.println("进程总数"+operatingSystem.getProcessCount());
    }

    @SneakyThrows
    @Test
    void testMemory(){
        HardwareAbstractionLayer hardwareAbstractionLayer = si.getHardware();
        GlobalMemory globalMemory = hardwareAbstractionLayer.getMemory();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(globalMemory);
    }
}
