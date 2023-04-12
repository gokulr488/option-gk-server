package com.gokulr488.optionsgk.services.datacollector;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

	@Scheduled(cron = "0 45 15 * * MON-FRI")
	public void collectGraphData() {

	}

}
