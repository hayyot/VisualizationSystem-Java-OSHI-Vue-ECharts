package com.hayyot.oshiapp;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;

import java.sql.Time;
import java.util.Arrays;
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
        while(true){
            Thread.sleep(1000);
            GlobalMemory globalMemory = hardwareAbstractionLayer.getMemory();
//            ObjectMapper objectMapper = new ObjectMapper();
//            String string = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(globalMemory);
//            System.out.println(string);
            System.out.println("可用内存:"+globalMemory.getAvailable());
        }

    }

    @Test
    void testCPU() {
        HardwareAbstractionLayer hardware = si.getHardware();
        CentralProcessor processor = hardware.getProcessor();
//        获取cpu最大频率
        long maxFreq = processor.getMaxFreq();
        System.out.println(maxFreq);
//        获取cpu当前频率
        long[] currentFreq = processor.getCurrentFreq();
        System.out.println(Arrays.toString(currentFreq));
//        当前频率/最大频率 = 当前CPU使用率

//        获取CPU 1s 使用情况
        double[] cpuload = processor.getProcessorCpuLoad(1000);
        System.out.println(Arrays.toString(cpuload));
    }
}
