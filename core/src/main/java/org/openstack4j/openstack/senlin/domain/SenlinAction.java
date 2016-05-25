package org.openstack4j.openstack.senlin.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openstack4j.model.senlin.Action;
import org.openstack4j.openstack.common.ListResult;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * This is a model of a senlinAction. It uses Jackson annotations for
 * (de)serialization into JSON format
 * 
 * @author lion
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SenlinAction implements Action {
	private static final long serialVersionUID = -1125919503657762374L;

	@JsonProperty("action")
	private String action;
	@JsonProperty("cause")
	private String cause;
	@JsonProperty("created_at")
	private Date createdAt;
	@JsonProperty("depended_by")
	private List<String> dependedBy;
	@JsonProperty("depended_on")
	private List<String> dependedOn;
	@JsonProperty("end_time")
	private Float endTime;
	@JsonProperty("id")
	private String id;
	@JsonProperty("inputs")
	private Map<String, String> inputs;
	@JsonProperty("interval")
	private Integer interval;
	@JsonProperty("name")
	private String name;
	@JsonProperty("outputs")
	private Map<String, String> outputs;
	@JsonProperty("owner")
	private String owner;
	@JsonProperty("start_time")
	private Float startTime;
	@JsonProperty("status")
	private String status;
	@JsonProperty("status_reason")
	private String statusReason;
	@JsonProperty("target")
	private String target;
	@JsonProperty("timeout")
	private Integer timeout;
	@JsonProperty("updated_at")
	private Date updatedAt;

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "SenlinAction{" +
				"action='" + action + '\'' +
				", cause='" + cause + '\'' +
				", created_at='" + createdAt + '\'' +
				", depended_by=" + dependedBy +
				", depended_on=" + dependedOn +
				", end_time='" + endTime + '\'' +
				", id='" + id + '\'' +
				", inputs=" + inputs +
				", interval='" + interval + '\'' +
				", name='" + name + '\'' +
				", outputs=" + outputs +
				", owner='" + owner + '\'' +
				", start_time='" + startTime + '\'' +
				", status='" + status + '\'' +
				", status_reason='" + statusReason + '\'' +
				", target='" + target + '\'' +
				", timeout='" + timeout + '\'' +
				", updated_at='" + updatedAt + '\'' +
				'}';
	}

	/**
	 * An inner class for representing lists of senlinAction
	 * 
	 * @author lion
	 * 
	 */
	public static class Action extends ListResult<SenlinAction> {
		private static final long serialVersionUID = 298037693459165073L;
		@JsonProperty("actions")
		private List<SenlinAction> list;

		protected List<SenlinAction> value() {
			return list;
		}
	}
}
