package com.gokulr488.optionsgk.services.datacollector.ohlc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokulr488.optionsgk.core.BaseResp;
import com.gokulr488.optionsgk.services.CacheService;
import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.KiteAuthReq;
import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.OhlcCollectionReq;
import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.OhlcCollectionResp;

@Service
public class KiteOhlcCollector implements OhlcCollector {

	@Autowired
	private CacheService cache;

	@Override
	public OhlcCollectionResp collectOhlcData(OhlcCollectionReq req) {
		return null;
	}

	@Override
	public BaseResp setKiteAuth(KiteAuthReq req) {
		cache.setKiteAuthToken(req.getAuthorizationKey());
		cache.setUserId(req.getUserId());
		return new BaseResp(200, "Auth set succesfully", true);
	}
}
