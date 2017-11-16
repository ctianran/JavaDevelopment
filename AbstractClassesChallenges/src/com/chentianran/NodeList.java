package com.chentianran;

/**
 * Created by Tianran on 10/30/2017.
 */
public interface NodeList {
	ListItem getRoot();
	boolean addItem(ListItem item);
	boolean removeItem(ListItem item);
	void traverse(ListItem root);
}
