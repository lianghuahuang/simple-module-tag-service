package net.simpleframework.module.tag;

import net.simpleframework.ado.bean.AbstractDescriptionBean;

/**
 * Licensed under the Apache License, Version 2.0
 * 
 * @author 陈侃(cknet@126.com, 13910090885) https://github.com/simpleframework
 *         http://www.simpleframework.net
 */
public class Tag extends AbstractDescriptionBean {
	/* 标签标识 */
	private int tagMark;

	/* 标签文本 */
	private String tagText;

	/* 建议的标签 */
	private boolean suggest;

	/* 出现频率 */
	private int frequency;

	/* 查看次数 */
	private int views;

	public int getTagMark() {
		return tagMark;
	}

	public void setTagMark(final int tagMark) {
		this.tagMark = tagMark;
	}

	public String getTagText() {
		return tagText;
	}

	public void setTagText(final String tagText) {
		this.tagText = tagText;
	}

	public boolean isSuggest() {
		return suggest;
	}

	public void setSuggest(final boolean suggest) {
		this.suggest = suggest;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(final int frequency) {
		this.frequency = frequency;
	}

	public int getViews() {
		return views;
	}

	public void setViews(final int views) {
		this.views = views;
	}

	private static final long serialVersionUID = 7553542915564737502L;
}
