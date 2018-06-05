package com.hudson.ssm.domain;

/**
 * ADX流量信息
 */
public class Flow {
	private String id;// CONCAT(flowName,os,qid,dspver)
	private String flowId;// 流量唯一标识
	private String flowName;// 流量名称
	private String os;// 操作系统
	private String bundle;// bundel �?包名
	private String flowsyurl;// 首页新闻url
	private String downadindex;// 下拉位置(3,8,13,18)
	private String adindexs;// 上拉位置(3,8)
	private String downindexforeven;// 下拉特殊位置
	private String adindexforeven;// 上拉特殊位置
	private String detailadindex;// 内页热点信息广告位置
	private String videoplayadindex;// 视频信息流广告位�?
	private String videoplaydownidx;// 视频信息流下拉广告位�?
	private String videodetailadindex;// 视频内页热点信息广告位置
	private String photoendidx;// 图集广告位置(4,5)
	private String searchbaradidx;//搜索�?
	private String searchlistadidx;//综合搜索列表
	private String searchvideolistadidx;//视频搜索列表
	private String isenableappadv;// 是否启用APP广告池中的素材Y|N
	private String isenableh5adv;// 是否启用h5广告池中的素材Y|N
	private String enableh5advgrade;// 启用h5广告素材的等�?
	private String slotid;// 应用的slotid
	private String appminver;// app�?��版本
	private String adx;// app�?��版本
	private String douyinvideoidx;//视频播放广告位置

	private String dspver;// dsp接口版本�?
	
	private Integer minver;//�?��版本
	private Integer maxver;//�?��版本

	public String getFlowId() {
		return flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getFlowName() {
		return flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getBundle() {
		return bundle;
	}

	public void setBundle(String bundle) {
		this.bundle = bundle;
	}

	public String getFlowsyurl() {
		return flowsyurl;
	}

	public void setFlowsyurl(String flowsyurl) {
		this.flowsyurl = flowsyurl;
	}

	public String getDownadindex() {
		return downadindex;
	}

	public void setDownadindex(String downadindex) {
		this.downadindex = downadindex;
	}

	public String getAdindexs() {
		return adindexs;
	}

	public void setAdindexs(String adindexs) {
		this.adindexs = adindexs;
	}

	public String getDetailadindex() {
		return detailadindex;
	}

	public void setDetailadindex(String detailadindex) {
		this.detailadindex = detailadindex;
	}

	public String getVideoplayadindex() {
		return videoplayadindex;
	}

	public void setVideoplayadindex(String videoplayadindex) {
		this.videoplayadindex = videoplayadindex;
	}

	public String getVideodetailadindex() {
		return videodetailadindex;
	}

	public void setVideodetailadindex(String videodetailadindex) {
		this.videodetailadindex = videodetailadindex;
	}

	public String getDspver() {
		return dspver;
	}

	public void setDspver(String dspver) {
		this.dspver = dspver;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIsenableh5adv() {
		return isenableh5adv;
	}

	public void setIsenableh5adv(String isenableh5adv) {
		this.isenableh5adv = isenableh5adv;
	}

	public String getEnableh5advgrade() {
		return enableh5advgrade;
	}

	public void setEnableh5advgrade(String enableh5advgrade) {
		this.enableh5advgrade = enableh5advgrade;
	}

	public String getIsenableappadv() {
		return isenableappadv;
	}

	public void setIsenableappadv(String isenableappadv) {
		this.isenableappadv = isenableappadv;
	}

	public String getAppminver() {
		return appminver;
	}

	public void setAppminver(String appminver) {
		this.appminver = appminver;
	}

	public String getAdx() {
		return adx;
	}

	public void setAdx(String adx) {
		this.adx = adx;
	}

	public String getSlotid() {
		return slotid;
	}

	public void setSlotid(String slotid) {
		this.slotid = slotid;
	}

	public String getVideoplaydownidx() {
		return videoplaydownidx;
	}

	public void setVideoplaydownidx(String videoplaydownidx) {
		this.videoplaydownidx = videoplaydownidx;
	}

	public String getPhotoendidx() {
		return photoendidx;
	}

	public void setPhotoendidx(String photoendidx) {
		this.photoendidx = photoendidx;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", bundle=" + bundle + "]";
	}

	public String getSearchbaradidx() {
		return searchbaradidx;
	}

	public void setSearchbaradidx(String searchbaradidx) {
		this.searchbaradidx = searchbaradidx;
	}

	public String getSearchlistadidx() {
		return searchlistadidx;
	}

	public void setSearchlistadidx(String searchlistadidx) {
		this.searchlistadidx = searchlistadidx;
	}

	public String getSearchvideolistadidx() {
		return searchvideolistadidx;
	}

	public void setSearchvideolistadidx(String searchvideolistadidx) {
		this.searchvideolistadidx = searchvideolistadidx;
	}

	public String getDownindexforeven() {
		return downindexforeven;
	}

	public void setDownindexforeven(String downindexforeven) {
		this.downindexforeven = downindexforeven;
	}

	public String getAdindexforeven() {
		return adindexforeven;
	}

	public void setAdindexforeven(String adindexforeven) {
		this.adindexforeven = adindexforeven;
	}

	public Integer getMinver() {
		return minver;
	}

	public void setMinver(Integer minver) {
		this.minver = minver;
	}

	public Integer getMaxver() {
		return maxver;
	}

	public void setMaxver(Integer maxver) {
		this.maxver = maxver;
	}

	public String getDouyinvideoidx() {
		return douyinvideoidx;
	}

	public void setDouyinvideoidx(String douyinvideoidx) {
		this.douyinvideoidx = douyinvideoidx;
	}
}
