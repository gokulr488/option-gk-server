package com.gokulr488.optionsgk.services.datacollector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.gokulr488.optionsgk.services.datacollector.ohlc.OhlcCollector;
import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.OhlcCollectionReq;

@Service
public class SchedulerService {

	@Autowired
	private OhlcCollector ohlcCollector;

	// @Scheduled(cron = "0 45 15 * * MON-FRI")
	@Scheduled(fixedDelay = 50000)
	public void collectGraphData() {
		OhlcCollectionReq req = new OhlcCollectionReq();
		req.setUserId("ON0962");
		req.setContractCode("912129");
		req.setFromDate("2023-04-11");
		req.setToDate("2023-04-12");
		ohlcCollector.collectOhlcData(req);
	}

}
