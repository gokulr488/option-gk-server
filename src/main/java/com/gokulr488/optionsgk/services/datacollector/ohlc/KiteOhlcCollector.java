package com.gokulr488.optionsgk.services.datacollector.ohlc;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gokulr488.optionsgk.core.BaseResp;
import com.gokulr488.optionsgk.core.OgkException;
import com.gokulr488.optionsgk.services.CacheService;
import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.KiteAuthReq;
import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.OhlcCollectionReq;
import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.OhlcCollectionResp;
import com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.kitegraph.KiteGraphResp;

@Service
public class KiteOhlcCollector implements OhlcCollector {

	@Autowired
	private CacheService cache;
	private RestTemplate rest = new RestTemplate();

	@Override
	public OhlcCollectionResp collectOhlcData(OhlcCollectionReq req) {
		try {
			KiteGraphResp resp = ohlcRestCall(req);
		} catch (OgkException e) {
			e.printStackTrace();
		}

		return null;
	}

	private KiteGraphResp ohlcRestCall(OhlcCollectionReq req) throws OgkException {
		try {
			String url = "https://kite.zerodha.com/oms/instruments/historical/" + req.getContractCode() + "/"
					+ req.getCandleType() + "?user_id=" + req.getUserId() + "&oi=1&from=" + req.getFromDate() + "&to="
					+ req.getToDate();

			HttpHeaders headers = new HttpHeaders();
			headers.set("authorization", cache.getKiteAuthToken());
			headers.set("Cookie", "_cfuvid=7K07iJIBX2HlwMPjjKAnOdciwqdGstXfKOZGYZKQ7K0-1681314266602-0-604800000");
			ResponseEntity<KiteGraphResp> response = rest.exchange(url, HttpMethod.GET, new HttpEntity<>(headers),
					KiteGraphResp.class, new HashMap<>());
			return response.getBody();
		} catch (Exception e) {
			throw new OgkException("Failed Kite Graph Data rest call");
		}
	}

	@Override
	public BaseResp setKiteAuth(KiteAuthReq req) {
		cache.setKiteAuthToken(req.getAuthorizationKey());
		cache.setUserId(req.getUserId());
		return new BaseResp(200, "Auth set succesfully", true);
	}
}
