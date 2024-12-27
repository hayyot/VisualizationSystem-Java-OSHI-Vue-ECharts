package com.hayyot.oshiapp.controller;

import com.hayyot.oshiapp.common.R;
import com.hayyot.oshiapp.service.CpuLoadMetricsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: CpuLoadRestController
 * @author: Jason Shen
 * @date: 2024/12/27
 **/
@RestController
@RequestMapping("/metrics")
public class CpuLoadRestController {

    @Autowired
    CpuLoadMetricsService cpuLoadMetricsService;

    @GetMapping("/cpuLoad")
    public R getCpuLoad(){
        return R.ok(cpuLoadMetricsService.getCpuLoads());
    }
}
