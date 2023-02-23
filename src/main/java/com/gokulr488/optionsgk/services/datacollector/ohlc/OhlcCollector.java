package com.gokulr488.optionsgk.services.datacollector.ohlc;

import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.OhlcCollectionReq;
import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.OhlcCollectionResp;

public interface OhlcCollector {

	OhlcCollectionResp collectOhlcData(OhlcCollectionReq req);

}
