package com.oneToMany.exaple2;

import java.util.Set;

public class Vendor {
	private int vid;
	private String vname;
	private Set fokey;
	public Set getFokey() {
		return fokey;
	}
	public void setFokey(Set fokey) {
		this.fokey = fokey;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}


	}


