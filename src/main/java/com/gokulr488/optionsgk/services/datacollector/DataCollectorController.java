package com.gokulr488.optionsgk.services.datacollector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gokulr488.optionsgk.core.BaseResp;
import com.gokulr488.optionsgk.services.datacollector.ohlc.OhlcCollector;
import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.KiteAuthReq;
import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.OhlcCollectionReq;
import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.OhlcCollectionResp;

@RestController
public class DataCollectorController {

	@Autowired
	private OhlcCollector ohlcCollector;

	private static final String OHLC_COLLECTION = "/dataCollector/ohlcData";
	private static final String KITE_AUTH = "/dataCollector/kiteAuth";

	@PostMapping(value = OHLC_COLLECTION)
	public OhlcCollectionResp collectOhlcData(@RequestBody OhlcCollectionReq req) {
		return ohlcCollector.collectOhlcData(req);
	}

	@PostMapping(value = KITE_AUTH)
	public BaseResp setKiteAuth(@RequestBody KiteAuthReq req) {
		return ohlcCollector.setKiteAuth(req);
	}

}
