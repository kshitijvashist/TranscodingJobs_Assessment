package com.vizary.transcodingjobs.Inereface;

import java.util.List;
import java.util.Map;

public interface ItranscodingJobs {
	public Map<String,Integer> getJobsStatusCounter(String xmlName);
	public List<String> getFailedStatusErrorDescription(String xmlName);
	public List<String> getParticularPublishedJobs(String xmlName);

}
