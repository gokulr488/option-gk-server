package com.gokulr488.optionsgk.services.datacollector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gokulr488.optionsgk.services.datacollector.ohlc.OhlcCollector;
import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.OhlcCollectionReq;
import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.OhlcCollectionResp;

@RestController
public class DataCollectorController {

	@Autowired
	private OhlcCollector ohlcCollector;

	private static final String OHLC_COLLECTION = "/dataCollector/ohlcData";

	@PostMapping(value = OHLC_COLLECTION)
	public OhlcCollectionResp collectOhlcData(@RequestBody OhlcCollectionReq req) {
		return ohlcCollector.collectOhlcData(req);
	}

}
