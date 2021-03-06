/*  This file is part of Waisda 

    Copyright (c) 2012 Netherlands Institute for Sound and Vision
    https://github.com/beeldengeluid/waisda
	
    Waisda is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Waisda is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Waisda.  If not, see <http://www.gnu.org/licenses/>.
*/

package nl.waisda.model;

import java.util.ArrayList;
import java.util.List;

import nl.waisda.domain.TagEntry;


public class TagEntryStats {

	private String normalizedTag;
	private TagEntry firstEntry;
	private List<VideoStats> videoStats = new ArrayList<VideoStats>();

	public String getNormalizedTag() {
		return normalizedTag;
	}

	public void setNormalizedTag(String normalizedTag) {
		this.normalizedTag = normalizedTag;
	}

	public TagEntry getFirstEntry() {
		return firstEntry;
	}

	public void setFirstEntry(TagEntry firstEntry) {
		this.firstEntry = firstEntry;
	}

	public List<VideoStats> getVideoStats() {
		return videoStats;
	}

	public void setVideoStats(List<VideoStats> videoStats) {
		this.videoStats = videoStats;
	}

}
