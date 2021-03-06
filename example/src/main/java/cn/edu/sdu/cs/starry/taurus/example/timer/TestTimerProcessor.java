package cn.edu.sdu.cs.starry.taurus.example.timer;

import cn.edu.sdu.cs.starry.taurus.common.exception.BusinessException;
import cn.edu.sdu.cs.starry.taurus.processor.TimerProcessor;
import cn.edu.sdu.cs.starry.taurus.request.BaseBusinessRequest;
import cn.edu.sdu.cs.starry.taurus.response.TimerResponse;

public class TestTimerProcessor extends TimerProcessor {
	@Override
	protected void cleanProcessor() {

	}

	@Override
	public String getAuthor() {
		return "ytChen";
	}

	@Override
	public TimerResponse process(BaseBusinessRequest request)
			throws BusinessException {
		TestTimerResponse response = new TestTimerResponse();
		response.setSayHello("this is a query ,saying hello "+ ((TestTimerRequest)request).getName());
		return response;
	}

}
