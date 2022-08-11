package com.employeshorting;

import java.util.Comparator;

public class TestSort implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		return o1.getSallary()>o2.getSallary()?1:-1;
	}

}
